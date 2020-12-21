package com.coforge.mnvSpring.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.coforge.mnvSpring.entity.Laptop;


@Repository
@Qualifier("laptopDao")
public class LaptopDaoImpl implements LaptopDao{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	public void addLaptop(Laptop laptop) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("INSERT INTO laptop (serialNo, processor, graphicCard, ram, company, price) VALUES (?,?,?,?,?,?)",
				laptop.getSerialNo(), laptop.getProcessor(), laptop.getGraphicCard(), laptop.getRam(), laptop.getCompany(), laptop.getPrice());
		System.out.println("Laptop Added!");
	}


	public void editLaptop(Laptop laptop, int serialNo) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("UPDATE laptop SET processor = ? ,ram = ? , price = ? WHERE serialNo = ? ", 
				laptop.getProcessor(), laptop.getRam(), laptop.getPrice(), serialNo); 
		System.out.println("Laptop Updated!!"); 
	}


	public void deleteLaptop(int serialNo) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("DELETE from laptop WHERE serialNo = ?", serialNo); 
		System.out.println("Laptop Deleted!!"); 
	}

	@SuppressWarnings("unchecked") 

	public Laptop find(int serialNo) {
		// TODO Auto-generated method stub
		@SuppressWarnings("rawtypes") 
		Laptop laptop = (Laptop) jdbcTemplate.queryForObject("SELECT * FROM laptop where serialNo = ? ", new Object[] { serialNo }, new BeanPropertyRowMapper(Laptop.class)); 
		return laptop; 
	}

	@SuppressWarnings("rawtypes") 

	public List<Laptop> findAll() {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked") 
		List <Laptop> laptops = jdbcTemplate.query("SELECT * FROM laptop", new BeanPropertyRowMapper(Laptop.class)); 
		return laptops; 
	}

}
