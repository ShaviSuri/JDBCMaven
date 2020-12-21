package com.coforge.mnvSpring.dao;

import java.util.List;

import com.coforge.mnvSpring.entity.Laptop;

public interface LaptopDao {

	public void addLaptop(Laptop laptop);
	public void editLaptop(Laptop laptop, int serialNo);
	public void deleteLaptop(int serialNo);
	public Laptop find(int serialNo);
	public List<Laptop> findAll();
}
