package com.solution.entities;


public class Computer {

	private Integer cno;

    private String brand;

    private String cpu;

    private String ram;

    private String disksize;


	private Double price; // Graphics Processing Unit, if needed
	
	
	public Computer() {
		// Default constructor
	}	
	public Computer(Integer cno, String brand, String cpu, String ram, String disksize) {
		this.cno = cno;
		this.brand = brand;
		this.cpu = cpu;
		this.ram = ram;
		this.disksize = disksize;
	}
	
	public Integer getCno() {
		return cno;
	}
	public void setCno(Integer cno) {
		this.cno = cno;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getDisksize() {
		return disksize;
	}
	public void setDisksize(String disksize) {
		this.disksize = disksize;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public String toString() {
		return "Computer [cno=" + cno + ", brand=" + brand + ", cpu=" + cpu + ", ram=" + ram + ", disksize=" + disksize
				+ ", price=" + price + "]";
	}
	
}
