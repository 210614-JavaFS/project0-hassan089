package com.revature.services;

import java.util.List;

import com.revature.models.Home;
import com.revature.repos.HomeDAO;
import com.revature.repos.HomeDAOImp;

public class HomeService {
	
	private static HomeDAO homeDao = new HomeDAOImp();

	
	public List<Home> getAllHomes() {
		return homeDao.findAll();
}
	
	public Home getHome(String name) {
		return homeDao.findByName(name);
	}
	
	public boolean addHome(Home home) {
		return homeDao.addHome(home);
	}
}