package com.example.hospital.tables;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table
@Getter
@Setter
public class Appointments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IdApp")
    private Integer idApp;
    private Date Date;

    @ManyToOne
    @JoinColumn(name="patId")
    private Patients IdPat;

    @ManyToOne
    @JoinColumn(name="docId")
    private Doctors IdDoc;

    @OneToOne
    @JoinColumn(name="IdRes")
    private Result res;

}
