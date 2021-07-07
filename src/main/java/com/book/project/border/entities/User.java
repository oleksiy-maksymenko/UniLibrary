package com.book.project.border.entities;

import javafx.scene.control.IndexRange;
import org.springframework.context.annotation.Primary;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    private Integer id;

    private String name;
    private String surname;
    private String pobatykovi;
    private String address;
    private Integer age;
    private String phone;
    private String email;

}
