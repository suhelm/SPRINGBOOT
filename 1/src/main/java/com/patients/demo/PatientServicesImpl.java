package com.patients.demo;

import com.patients.demo.entity.Patients;
import com.patients.demo.services.PatientServices;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class PatientServicesImpl implements PatientServices {
    List<Patients> patientList;

    public PatientServicesImpl() {
        patientList=new ArrayList<>();
        patientList.add(new Patients(1,"Suhel","Firdus",35,"m"));
        patientList.add(new Patients(2,"Shanaya","Suhel",35,"f"));

    }

    public List<Patients> getPatients() {
        return patientList;
    }

    @Override
    public Patients findPatients(long patientID) {
        for(int i=0;i<patientList.size();i++){
            if(patientList.get(i).getPatientId()==patientID){
                return patientList.get(i);
            }
        }
        return null;
    }

    @Override
    public Patients addPatient(Patients pt) {
        patientList.add(pt);
        return pt;
    }

    @Override
    public Patients updatePatient(Patients pt) {

        for(int i=0;i<patientList.size();i++){
            System.out.println("Updating : " +patientList.get(i).getPatientId());
            if(patientList.get(i).getPatientId()==pt.getPatientId()){
                System.out.println("Updating : " +patientList.get(i).getPatientId());
                patientList.get(i).setAge(pt.getAge());
                patientList.get(i).setFirstName(pt.getFirstName());
                patientList.get(i).setLastName(pt.getLastName());
                patientList.get(i).setGender(pt.getGender());
                System.out.println("Updated");
                return patientList.get(i);
            }
        }
        return null;
    }

    @Override
    public void deletePatient(long patientId) {
        for(int i=0;i<patientList.size();i++){
            if(patientList.get(i).getPatientId()==patientId){
                patientList.remove(i) ;
            }
        }
    }
}
