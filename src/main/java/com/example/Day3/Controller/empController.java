package com.example.Day3.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Day3.Entity.empdetails;
import com.example.Day3.Service.empService;


@RestController
public class empController {
	@Autowired
	empService eser;
	@PostMapping("/add2Details")
	public empdetails addInfo(@RequestBody empdetails st) {
		return eser.saveDetails(st);
	}
	@GetMapping("/get2Details")
	public List<empdetails> fetchDetails(){
		return eser.getDetails();
	}

}
