package com.root.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Products {
    @Id
    private Long product_id;
    private String name;
    private String description;
    private Long inuse;
    private Long category_id;
    private Long seller_user_id;

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getInuse() {
        return inuse;
    }

    public void setInuse(Long inuse) {
        this.inuse = inuse;
    }

    public Long getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Long category_id) {
        this.category_id = category_id;
    }

    public Long getSeller_user_id() {
        return seller_user_id;
    }

    public void setSeller_user_id(Long seller_user_id) {
        this.seller_user_id = seller_user_id;
    }
}
