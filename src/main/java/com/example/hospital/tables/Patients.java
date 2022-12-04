package com.example.hospital.tables;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
@Getter
@Setter
public class Patients {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IdPat")
    private Integer idPat;
    private String Name;
    private String Surname;
    private String Patronymic;
    private String Phone;

    @OneToMany(mappedBy = "IdPat")
    private Set<Appointments> apps;
}
