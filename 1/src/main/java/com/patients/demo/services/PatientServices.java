package com.patients.demo.services;

import com.patients.demo.entity.Patients;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PatientServices {

    public List<Patients> getPatients();
    public Patients findPatients(long patientID);
    public Patients addPatient(Patients pt);
    public Patients updatePatient(Patients pt);
    public void deletePatient(long patientId);
}
