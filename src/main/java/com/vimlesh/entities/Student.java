package com.vimlesh.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "STUDENT_INFO")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}
