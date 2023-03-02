package com.example.Day3.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Day3.Entity.empdetails;

public interface empRepo extends JpaRepository<empdetails,Integer>{

}
