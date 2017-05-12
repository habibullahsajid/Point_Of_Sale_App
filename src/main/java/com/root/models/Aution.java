package com.root.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Aution {
  @Id
  private Long auction_id;
  private Long offered_price;
  private java.sql.Date offered_date;
  private Long winned;
  private Long approved_date;
  private Long inuse;
  private Long product_auction_id;
  private Long bidder_user_id;
  private Long corroborative_user_id;

  public Long getAuction_id() {
    return auction_id;
  }

  public void setAuction_id(Long auction_id) {
    this.auction_id = auction_id;
  }

  public Long getOffered_price() {
    return offered_price;
  }

  public void setOffered_price(Long offered_price) {
    this.offered_price = offered_price;
  }

  public java.sql.Date getOffered_date() {
    return offered_date;
  }

  public void setOffered_date(java.sql.Date offered_date) {
    this.offered_date = offered_date;
  }

  public Long getWinned() {
    return winned;
  }

  public void setWinned(Long winned) {
    this.winned = winned;
  }

  public Long getApproved_date() {
    return approved_date;
  }

  public void setApproved_date(Long approved_date) {
    this.approved_date = approved_date;
  }

  public Long getInuse() {
    return inuse;
  }

  public void setInuse(Long inuse) {
    this.inuse = inuse;
  }

  public Long getProduct_auction_id() {
    return product_auction_id;
  }

  public void setProduct_auction_id(Long product_auction_id) {
    this.product_auction_id = product_auction_id;
  }

  public Long getBidder_user_id() {
    return bidder_user_id;
  }

  public void setBidder_user_id(Long bidder_user_id) {
    this.bidder_user_id = bidder_user_id;
  }

  public Long getCorroborative_user_id() {
    return corroborative_user_id;
  }

  public void setCorroborative_user_id(Long corroborative_user_id) {
    this.corroborative_user_id = corroborative_user_id;
  }
}
