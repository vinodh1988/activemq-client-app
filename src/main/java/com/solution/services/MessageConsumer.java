package com.solution.services;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.solution.entities.Computer;

@Service
public class MessageConsumer {
	@Autowired
	private RestTemplate restTemplate;
	
	
   @JmsListener(destination = "pqueue")
	public void receive(String message) {
		 Path path=Paths.get("e:\\files\\mlogs.txt");
		 message="\n"+message;
		 String number = message.replaceAll("\\D+", "");
	     System.out.println(number); 
		 try {
			 Files.write(path, message.getBytes(),StandardOpenOption.CREATE,StandardOpenOption.APPEND);
			 readDetails(Integer.parseInt(number));
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
	}
   
   public void readDetails(Integer number) {
	   String url = "http://localhost:8080/api/computers/" + number;
	   try {
		   Computer response = restTemplate.getForObject(url, Computer.class);
		   System.out.println("Response from Computer API: " + response);
	   } catch (Exception e) {
		   System.err.println("Error fetching details for computer number " + number + ": " + e.getMessage());
	   }
   }
}