package io.blainelafreniere.langsite;

import javax.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column
    private String first_name;

    @Column
    private String last_name;
}
