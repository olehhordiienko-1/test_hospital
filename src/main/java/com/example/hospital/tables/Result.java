package com.example.hospital.tables;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
public class Result {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IdRec")
    private Integer idRec;
    private String Conclusion;

    @OneToOne(mappedBy = "res")
    private Appointments app;
}
