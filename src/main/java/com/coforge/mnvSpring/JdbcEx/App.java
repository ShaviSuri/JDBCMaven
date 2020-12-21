package com.coforge.mnvSpring.JdbcEx;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.coforge.mnvSpring.config.ApplicationConfig;
import com.coforge.mnvSpring.entity.Laptop;
import com.coforge.mnvSpring.service.LaptopService;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		LaptopService laptopService = (LaptopService) context.getBean("laptopService");
		
		Laptop dell = new Laptop(4,"i5","4GB","8","Dell","50000.0");
		Laptop hp =new Laptop(5,"i5","4GB","8","HP","45000.0");
		Laptop lenovo = new Laptop(6,"i5","4GB","8","Lenovo","40000.0");
		
		laptopService.addLaptop(dell);
		laptopService.addLaptop(hp);
		laptopService.addLaptop(lenovo);
		
		System.out.println("Find All");
		
		List<Laptop> laptops  = laptopService.findAll();
		for (Laptop laptop: laptops) { 
    		System.out.println(laptop); 
    	} 
		System.out.println("Delete Serial No. = 6");
		int deleteMe = 6;
		laptopService.deleteLaptop(deleteMe);
		
		System.out.println("Find All Again");
		laptops  = laptopService.findAll();
		for (Laptop laptop: laptops) { 
    		System.out.println(laptop); 
    	} 
	}

}
