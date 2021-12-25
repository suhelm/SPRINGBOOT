package com.patients.demo.services;

import com.patients.demo.entity.Patients;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;


public interface PatientServices {

    public @ResponseBody
    Iterable<Patients> getPatients();
    public Optional<Patients> findPatients(long patientID);
    public Patients addPatient(Patients pt);
    public Patients updatePatient(Patients pt);
    public void deletePatient(long patientId);
}
