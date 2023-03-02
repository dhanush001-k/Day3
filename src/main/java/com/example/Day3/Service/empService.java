package com.example.Day3.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Day3.Entity.empdetails;
import com.example.Day3.Repository.empRepo;



@Service
public class empService {
	@Autowired
	empRepo erep;
	public empdetails saveDetails(empdetails e) {
		return erep.save(e);
	}
	public List<empdetails> getDetails(){
		return erep.findAll();
	}

}
