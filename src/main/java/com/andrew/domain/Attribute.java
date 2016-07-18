package com.andrew.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "attributes")
public class Attribute {

    private int id;
    private String name;
    private Set<CategoryAttribute> categoryAttributes = new HashSet<>();

    public Attribute() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.attribute")
    public Set<CategoryAttribute> getCategoryAttribute() {
        return this.categoryAttributes;
    }

    public void setCategoryAttribute(Set<CategoryAttribute> categoryAttribute) {
        this.categoryAttributes = categoryAttribute;
    }



}
