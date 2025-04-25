package com.test;
import jakarta.persistence.*;
import lombok.*;
import java.util.*;

@SuppressWarnings("unused")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private Double salary;

    @ManyToOne
    @JoinColumn(name = "dept_id")
    private Dept dept;
}