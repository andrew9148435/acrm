package com.andrew.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "products")
public class Product {

    private int id;
    private String name;
    private ProductCategory productCategory;
    private Set<ProductAttribute> productAttributes = new HashSet<>();
    private Set<ProductTag> productTags = new HashSet<>();

    public Product() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
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

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "pk.product", cascade=CascadeType.ALL)
    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.product")
    public Set<ProductAttribute> getProductAttributes() {
        return productAttributes;
    }

    public void setProductAttributes(Set<ProductAttribute> productAttributes) {
        this.productAttributes = productAttributes;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.product")
    public Set<ProductTag> getProductTags() {
        return productTags;
    }

    public void setProductTags(Set<ProductTag> productTags) {
        this.productTags = productTags;
    }

}
