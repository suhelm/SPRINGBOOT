package com.patients.demo.controller;

import com.patients.demo.PatientServicesImpl;
import com.patients.demo.entity.Patients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientController {

    @Autowired
    PatientServicesImpl pat;
    //return list of patients
    @GetMapping("/getpatients")
    public List<Patients> getPatient(){
        return this.pat.getPatients();
    }
    //return a patient by patient ID
    @GetMapping("/findpatients/{pID}")
    public Patients findPatient(@PathVariable String pID){
        return this.pat.findPatients(Long.parseLong(pID));
    }
    //add a patients
    @PostMapping("/addpatient")
    public Patients addPatient(@RequestBody Patients pt){
        return this.pat.addPatient(pt);
    }
    //update a patient
    @PutMapping("/updatepatient")
    public Patients updatePatient(@RequestBody Patients pt){
        return this.pat.updatePatient(pt);
    }

    @PutMapping("/deletepatient/{pID}")
    public String deletePatient(@PathVariable String pID){
        this.pat.deletePatient(Long.parseLong(pID));
        return "Deleted";
    }


}
