package com.nf.entity;


public class FOrder {

  private int oid;
  private String linkname;
  private int num;
  private String type;
  private String Phone;
  private java.sql.Timestamp oDate;


  public long getOid() {
    return oid;
  }

  public void setOid(int oid) {
    this.oid = oid;
  }


  public String getLinkname() {
    return linkname;
  }

  public void setLinkname(String linkname) {
    this.linkname = linkname;
  }


  public long getNum() {
    return num;
  }

  public void setNum(int num) {
    this.num = num;
  }


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public String getPhone() {
    return Phone;
  }

  public void setPhone(String Phone) {
    this.Phone = Phone;
  }


  public java.sql.Timestamp getODate() {
    return oDate;
  }

  public void setODate(java.sql.Timestamp oDate) {
    this.oDate = oDate;
  }

  @Override
  public String toString() {
    return "FOrder{" +
            "oid=" + oid +
            ", linkname='" + linkname + '\'' +
            ", num=" + num +
            ", type='" + type + '\'' +
            ", phone='" + Phone + '\'' +
            ", oDate=" + oDate +
            '}';
  }
}
