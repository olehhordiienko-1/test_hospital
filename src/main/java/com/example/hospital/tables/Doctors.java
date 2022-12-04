package com.example.hospital.tables;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
@Getter
@Setter
public class Doctors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IdDoc")
    private Integer IdDoc;
    private String Name;
    private String Surname;
    private String Patronymic;
    private String Category;
    private String Phone;

    @OneToMany(mappedBy = "IdDoc")
    private Set<Appointments> apps;
}
