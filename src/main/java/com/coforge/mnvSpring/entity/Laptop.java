package com.coforge.mnvSpring.entity;

public class Laptop {

	private int serialNo;
	private String processor;
	private String graphicCard;
	private String ram;
	private String company;
	private String price;
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop(int serialNo, String processor, String graphicCard, String ram, String company, String price) {
		super();
		this.serialNo = serialNo;
		this.processor = processor;
		this.graphicCard = graphicCard;
		this.ram = ram;
		this.company = company;
		this.price = price;
	}
	public int getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public String getGraphicCard() {
		return graphicCard;
	}
	public void setGraphicCard(String graphicCard) {
		this.graphicCard = graphicCard;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Laptop [serialNo=" + serialNo + ", processor=" + processor + ", graphicCard=" + graphicCard + ", ram="
				+ ram + ", company=" + company + ", price=" + price + "]";
	}
	
	
}
