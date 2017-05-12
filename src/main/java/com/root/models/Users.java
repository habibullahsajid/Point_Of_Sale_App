package com.root.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users {
  @Id
  private Long user_id;
  private String username;
  private String password;
  private String name;
  private String surname;
  private String home_phone;
  private String mobile_phone;
  private String work_phone;
  private String email;
  private String addres;
  private Long inuse;
  private Long role_id;

  public Long getUser_id() {
    return user_id;
  }

  public void setUser_id(Long user_id) {
    this.user_id = user_id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public String getHome_phone() {
    return home_phone;
  }

  public void setHome_phone(String home_phone) {
    this.home_phone = home_phone;
  }

  public String getMobile_phone() {
    return mobile_phone;
  }

  public void setMobile_phone(String mobile_phone) {
    this.mobile_phone = mobile_phone;
  }

  public String getWork_phone() {
    return work_phone;
  }

  public void setWork_phone(String work_phone) {
    this.work_phone = work_phone;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getAddres() {
    return addres;
  }

  public void setAddres(String addres) {
    this.addres = addres;
  }

  public Long getInuse() {
    return inuse;
  }

  public void setInuse(Long inuse) {
    this.inuse = inuse;
  }

  public Long getRole_id() {
    return role_id;
  }

  public void setRole_id(Long role_id) {
    this.role_id = role_id;
  }
}
