package com.andrew.domain;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
public class ProductTagId implements Serializable {

    private Product product;
    private Tag tag;

    public ProductTagId() {

    }

    @ManyToOne
    @JoinColumn(name = "product")
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @ManyToOne
    @JoinColumn(name="tag")
    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductTagId that = (ProductTagId) o;

        if (product != null ? !product.equals(that.product) : that.product != null) return false;
        return tag != null ? tag.equals(that.tag) : that.tag == null;

    }

    @Override
    public int hashCode() {
        int result = product != null ? product.hashCode() : 0;
        result = 31 * result + (tag != null ? tag.hashCode() : 0);
        return result;
    }
}
