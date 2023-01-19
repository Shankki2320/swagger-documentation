package com.eudotech.swaggerapplication.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table
public class User {

    @Id
    private Integer id;

    @Column(name = "name")
    private String name;

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
