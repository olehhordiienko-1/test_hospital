package com.example.hospital.controllers;

import com.example.hospital.repos.AppointmentsRepo;
import com.example.hospital.repos.DoctorsRepo;
import com.example.hospital.repos.PatientsRepo;
import com.example.hospital.repos.ResultRepo;
import com.example.hospital.tables.Appointments;
import com.example.hospital.tables.Doctors;
import com.example.hospital.tables.Patients;
import com.example.hospital.tables.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Hospital {

    @Autowired
    private DoctorsRepo docs;

    @Autowired
    private AppointmentsRepo apps;

    @Autowired
    private ResultRepo res;

    @Autowired
    private PatientsRepo pats;

    @GetMapping("/")
    public String mainPage(Model model)
    {
        Iterable<Doctors> doc = docs.findAll();
        Iterable<Appointments> app = apps.findAll();
        Iterable<Result> ress = res.findAll();
        Iterable<Patients> pat = pats.findAll();
        return "main";
    }
}
