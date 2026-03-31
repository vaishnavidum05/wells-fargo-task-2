package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Counselor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String specialization;

    public Counselor(Long id, String name, String specialization) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
    }

    public Counselor() {}

    public Long getId() { return id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) { this.specialization = specialization; }
}
