package com.root.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Categories {
  @Id
  private Long category_id;
  private String name;
  private Double commision_rate;
  private Long inuse;
  private Long fk_category_id;

  public Long getCategory_id() {
    return category_id;
  }

  public void setCategory_id(Long category_id) {
    this.category_id = category_id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getCommision_rate() {
    return commision_rate;
  }

  public void setCommision_rate(Double commision_rate) {
    this.commision_rate = commision_rate;
  }

  public Long getInuse() {
    return inuse;
  }

  public void setInuse(Long inuse) {
    this.inuse = inuse;
  }

  public Long getFk_category_id() {
    return fk_category_id;
  }

  public void setFk_category_id(Long fk_category_id) {
    this.fk_category_id = fk_category_id;
  }
}
