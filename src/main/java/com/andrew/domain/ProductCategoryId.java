package com.andrew.domain;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.io.Serializable;

@Embeddable
public class ProductCategoryId implements Serializable {

    private Product product;
    private Category category;

    public ProductCategoryId() {

    }

    @ManyToOne
    @JoinColumn(name = "product")
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @OneToOne
    @JoinColumn(name="category")
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductCategoryId that = (ProductCategoryId) o;

        if (product != null ? !product.equals(that.product) : that.product != null) return false;
        if (category != null ? !category.equals(that.category) : that.category != null)
            return false;

        return true;
    }

    public int hashCode() {
        int result;
        result = (product != null ? product.hashCode() : 0);
        result = 31 * result + (category != null ? category.hashCode() : 0);
        return result;
    }
}
