package com.patients.demo.dao;

import com.patients.demo.entity.Patients;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface PatientsDAO extends JpaRepository<Patients, Long> {

}
