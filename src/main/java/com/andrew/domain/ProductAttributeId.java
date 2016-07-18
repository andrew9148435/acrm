package com.andrew.domain;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
public class ProductAttributeId implements Serializable {

    private Product product;
    private Attribute attribute;

    public ProductAttributeId() {

    }

    @ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "product")
        public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="attribute")
    public Attribute getAttribute() {
        return attribute;
    }

    public void setAttribute(Attribute attribute) {
        this.attribute = attribute;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductAttributeId that = (ProductAttributeId) o;

        if (product != null ? !product.equals(that.product) : that.product != null) return false;
        return attribute != null ? attribute.equals(that.attribute) : that.attribute == null;

    }

    @Override
    public int hashCode() {
        int result = product != null ? product.hashCode() : 0;
        result = 31 * result + (attribute != null ? attribute.hashCode() : 0);
        return result;
    }
}
