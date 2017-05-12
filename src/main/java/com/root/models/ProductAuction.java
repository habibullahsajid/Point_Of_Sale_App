package com.root.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductAuction {
  @Id
  private Long product_auction_id;
  private java.sql.Date start_date;
  private java.sql.Date end_date;
  private Long min_price;
  private Long desired_price;
  private java.sql.Date approved_date;
  private Long inuse;
  private Long corroborative_user_id;
  private Long product_id;

  public Long getProduct_auction_id() {
    return product_auction_id;
  }

  public void setProduct_auction_id(Long product_auction_id) {
    this.product_auction_id = product_auction_id;
  }

  public java.sql.Date getStart_date() {
    return start_date;
  }

  public void setStart_date(java.sql.Date start_date) {
    this.start_date = start_date;
  }

  public java.sql.Date getEnd_date() {
    return end_date;
  }

  public void setEnd_date(java.sql.Date end_date) {
    this.end_date = end_date;
  }

  public Long getMin_price() {
    return min_price;
  }

  public void setMin_price(Long min_price) {
    this.min_price = min_price;
  }

  public Long getDesired_price() {
    return desired_price;
  }

  public void setDesired_price(Long desired_price) {
    this.desired_price = desired_price;
  }

  public java.sql.Date getApproved_date() {
    return approved_date;
  }

  public void setApproved_date(java.sql.Date approved_date) {
    this.approved_date = approved_date;
  }

  public Long getInuse() {
    return inuse;
  }

  public void setInuse(Long inuse) {
    this.inuse = inuse;
  }

  public Long getCorroborative_user_id() {
    return corroborative_user_id;
  }

  public void setCorroborative_user_id(Long corroborative_user_id) {
    this.corroborative_user_id = corroborative_user_id;
  }

  public Long getProduct_id() {
    return product_id;
  }

  public void setProduct_id(Long product_id) {
    this.product_id = product_id;
  }
}
