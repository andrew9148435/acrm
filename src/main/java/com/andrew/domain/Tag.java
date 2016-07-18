package com.andrew.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

//@MappedSuperclass
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Entity
@Table(name = "tags")
public class Tag {

    private int id;
    private String name;
    public Set<ProductTag> productTags = new HashSet<>();


/*    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "products_tags",
            joinColumns = {@JoinColumn(name = "tag_id")},
            inverseJoinColumns = {@JoinColumn(name = "product_id")}
    )*/

/*    @ManyToMany(mappedBy = "tags", fetch = FetchType.LAZY)
    private List<Product> products = new ArrayList<>();*/

    public Tag() {

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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.tag")
    public Set<ProductTag> getProductTags() {
        return productTags;
    }

    public void setProductTags(Set<ProductTag> productTags) {
        this.productTags = productTags;
    }
}
