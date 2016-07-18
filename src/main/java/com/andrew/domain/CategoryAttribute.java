package com.andrew.domain;

import javax.persistence.*;

@Entity
@Table(name = "category_attributes")
@AssociationOverrides({
        @AssociationOverride(name = "pk.category",
                joinColumns = @JoinColumn(name = "category_id")),
        @AssociationOverride(name = "pk.attribute",
                joinColumns = @JoinColumn(name = "attribute_id")) })
public class CategoryAttribute {

    private CategoryAttributeId pk = new CategoryAttributeId();

    public CategoryAttribute() {

    }

    @EmbeddedId
    public CategoryAttributeId getPk() {
        return pk;
    }

    public void setPk(CategoryAttributeId pk) {
        this.pk = pk;
    }

    @Transient
    public Category getCategory() {
        return getPk().getCategory();
    }

    public void setCategory(Category category) {
        getPk().setCategory(category);
    }

    @Transient
    public Attribute getAttribute() {
        return getPk().getAttribute();
    }

    public void setAttribute(Attribute attribute) {
        getPk().setAttribute(attribute);
    }

}
