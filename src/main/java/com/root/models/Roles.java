package com.root.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Roles {
  @Id
  private Long role_id;
  private String name;
  private Long inuse;

  public Long getRole_id() {
    return role_id;
  }

  public void setRole_id(Long role_id) {
    this.role_id = role_id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Long getInuse() {
    return inuse;
  }

  public void setInuse(Long inuse) {
    this.inuse = inuse;
  }
}
