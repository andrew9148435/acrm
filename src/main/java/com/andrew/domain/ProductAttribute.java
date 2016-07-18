package com.andrew.domain;

import javax.persistence.*;

@Entity
@Table(name = "product_attributes")
@AssociationOverrides({
        @AssociationOverride(name = "pk.product",
                joinColumns = @JoinColumn(name = "product_id")),
        @AssociationOverride(name = "pk.attribute",
                joinColumns = @JoinColumn(name = "attribute_id")) })
public class ProductAttribute {

    private ProductAttributeId pk = new ProductAttributeId();

    public ProductAttribute() {

    }

    @EmbeddedId
    public ProductAttributeId getPk() {
        return pk;
    }

    public void setPk(ProductAttributeId pk) {
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
    public Attribute getAttribute() {
        return getPk().getAttribute();
    }

    public void setAttribute(Attribute attribute) {
        getPk().setAttribute(attribute);
    }
}
