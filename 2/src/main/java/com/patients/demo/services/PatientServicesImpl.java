package com.patients.demo.services;

import com.patients.demo.dao.PatientsDAO;
import com.patients.demo.entity.Patients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PatientServicesImpl implements PatientServices {
    List<Patients> patientList;

    @Autowired
    PatientsDAO patientsDAO;


    public PatientServicesImpl() {
        patientList=new ArrayList<>();
        patientList.add(new Patients(1,"Suhel","Firdus",35,"m"));
        patientList.add(new Patients(2,"Shanaya","Suhel",35,"f"));

    }

    public List<Patients> getPatients() {
        return patientsDAO.findAll();
    }

    @Override
    public Optional<Patients> findPatients(long patientID) {
        return patientsDAO.findById(patientID);
        //return null;
    }

    @Override
    public Patients addPatient(Patients pt) {
        //patientList.add(pt);
        //return pt;
        patientsDAO.save(pt);
        return pt;
    }

    @Override
    public Patients updatePatient(Patients pt) {
        patientsDAO.save(pt);
        return pt;
        /*for(int i=0;i<patientList.size();i++){
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
        }*/
        //return null;
    }

    @Override
    public void deletePatient(long id) {
        //System.out.println("ID to be deleted " +id);
        //Optional<Patients> p=patientsDAO.findById(patientId);
        //Patients p2=p.get();
        try {
            String str = Long.toString(id);
            patientsDAO.deleteById(id);
        }catch (Exception e){
            System.out.println(e.getMessage());

        }
        /*for(int i=0;i<patientList.size();i++){
            if(patientList.get(i).getPatientId()==patientId){
                patientList.remove(i) ;
            }
        }*/
    }
}
