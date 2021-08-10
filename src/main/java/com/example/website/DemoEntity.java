package com.example.website;

import javax.persistence.*;

@Entity
@Table(name = "abcde")
public class DemoEntity {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column
    private int id;

    @Column
    private String name;
}
