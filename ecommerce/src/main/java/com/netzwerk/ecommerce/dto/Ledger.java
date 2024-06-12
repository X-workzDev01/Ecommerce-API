package com.netzwerk.ecommerce.dto;

public class Ledger {
    private String patientName;
    private String patientId;
    private String company;

    public Ledger(String patientName, String patientId, String company) {
        this.patientName = patientName;
        this.patientId = patientId;
        this.company = company;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getCompany() {
        return company;
    }
}
