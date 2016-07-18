package com.andrew.domain;

import javax.persistence.*;

@Entity
@Table(name = "products_tags")
@AssociationOverrides({
        @AssociationOverride(name = "pk.product",
                joinColumns = @JoinColumn(name = "product_id")),
        @AssociationOverride(name = "pk.tag",
                joinColumns = @JoinColumn(name = "tag_id")) })
public class ProductTag {

    private ProductTagId pk = new ProductTagId();

    public ProductTag() {

    }

    @EmbeddedId
    public ProductTagId getPk() {
        return pk;
    }

    public void setPk(ProductTagId pk) {
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
    public Tag getTag() {
        return getPk().getTag();
    }

    public void setTag(Tag tag) {
        getPk().setTag(tag);
    }
}
