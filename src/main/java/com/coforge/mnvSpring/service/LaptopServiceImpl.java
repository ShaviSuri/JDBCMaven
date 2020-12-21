package com.coforge.mnvSpring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.mnvSpring.dao.LaptopDao;
import com.coforge.mnvSpring.entity.Laptop;

@Service("laptopService")
public class LaptopServiceImpl implements LaptopService {

	@Autowired
	LaptopDao laptopDao;
	

	public void addLaptop(Laptop laptop) {
		// TODO Auto-generated method stub
		laptopDao.addLaptop(laptop);
	}


	public void editLaptop(Laptop laptop, int serialNo) {
		// TODO Auto-generated method stub
		laptopDao.editLaptop(laptop, serialNo);
	}

	
	public void deleteLaptop(int serialNo) {
		// TODO Auto-generated method stub
		laptopDao.deleteLaptop(serialNo);
	}


	public Laptop find(int serialNo) {
		// TODO Auto-generated method stub
		return laptopDao.find(serialNo);
	}


	public List<Laptop> findAll() {
		// TODO Auto-generated method stub
		return laptopDao.findAll();
	}

}
