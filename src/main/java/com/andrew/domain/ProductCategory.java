package com.andrew.domain;

import javax.persistence.*;

@Entity
@Table(name = "product_categories")
@AssociationOverrides({
        @AssociationOverride(name = "pk.product",
                joinColumns = @JoinColumn(name = "product_id")),
        @AssociationOverride(name = "pk.category",
                joinColumns = @JoinColumn(name = "category_id")) })
public class ProductCategory {

    private ProductCategoryId pk = new ProductCategoryId();

    public ProductCategory() {

    }

    @EmbeddedId
    public ProductCategoryId getPk() {
        return pk;
    }

    public void setPk(ProductCategoryId pk) {
        this.pk = pk;
    }

    @Transient
    public Product getProduct() {
        return getPk().getProduct();
    }

    public void setProduct(Product product) {
        getPk().setProduct(product);
    }

    @Transient
    public Category getCategory() {
        return getPk().getCategory();
    }

    public void setCategory(Category category) {
        getPk().setCategory(category);
    }

}
