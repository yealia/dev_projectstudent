package main.java.com.example.patient.controller;

import main.java.com.example.patient.model.dto.Patient;
import main.java.com.example.patient.service.PatientService;

public class PatientController {
    private final PatientService patientService = new PatientService();

    public int registerPatient(Patient patient) {
        return patientService.createPatient(patient);
    }

    public void searchReservation(String resNo) {
        patientService.checkReservation(resNo);
    }

    public int cancelReservation(String resNo) {
        return patientService.deleteReserve(resNo);

    }
}
