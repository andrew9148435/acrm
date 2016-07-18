package com.andrew.domain;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.io.Serializable;

@Embeddable
public class CategoryAttributeId implements Serializable {

    private Category category;
    private Attribute attribute;

    public CategoryAttributeId() {

    }

    @OneToOne
    @JoinColumn(name="category")
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @ManyToOne
    @JoinColumn(name = "attribute")
    public Attribute getAttribute() {
        return attribute;
    }

    public void setAttribute(Attribute attribute) {
        this.attribute = attribute;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CategoryAttributeId that = (CategoryAttributeId) o;

        if (category != null ? !category.equals(that.category) : that.category != null) return false;
        if (attribute != null ? !attribute.equals(that.attribute) : that.attribute != null)
            return false;

        return true;
    }

    public int hashCode() {
        int result;
        result = (category != null ? category.hashCode() : 0);
        result = 31 * result + (attribute != null ? attribute.hashCode() : 0);
        return result;
    }
}
