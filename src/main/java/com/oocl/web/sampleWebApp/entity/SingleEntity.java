package com.oocl.web.sampleWebApp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SingleEntity {
    @Id
    public Long id;
    @Column(length = 10)
    public String name;

    public SingleEntity(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public SingleEntity() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
