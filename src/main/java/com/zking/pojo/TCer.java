package com.zking.pojo;


public class TCer {

  private long cerId;
  private long userId;
  private String cerUserName;
  private long cerState;
  private java.sql.Timestamp cerDate;
  private String cerMan;
  private String cerThink;
  private String cerImg;
  private java.sql.Timestamp cerTime;


  public long getCerId() {
    return cerId;
  }

  public void setCerId(long cerId) {
    this.cerId = cerId;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public String getCerUserName() {
    return cerUserName;
  }

  public void setCerUserName(String cerUserName) {
    this.cerUserName = cerUserName;
  }


  public long getCerState() {
    return cerState;
  }

  public void setCerState(long cerState) {
    this.cerState = cerState;
  }


  public java.sql.Timestamp getCerDate() {
    return cerDate;
  }

  public void setCerDate(java.sql.Timestamp cerDate) {
    this.cerDate = cerDate;
  }


  public String getCerMan() {
    return cerMan;
  }

  public void setCerMan(String cerMan) {
    this.cerMan = cerMan;
  }


  public String getCerThink() {
    return cerThink;
  }

  public void setCerThink(String cerThink) {
    this.cerThink = cerThink;
  }


  public String getCerImg() {
    return cerImg;
  }

  public void setCerImg(String cerImg) {
    this.cerImg = cerImg;
  }


  public java.sql.Timestamp getCerTime() {
    return cerTime;
  }

  public void setCerTime(java.sql.Timestamp cerTime) {
    this.cerTime = cerTime;
  }

  @Override
  public String toString() {
    return "TCer{" +
            "cerId=" + cerId +
            ", userId=" + userId +
            ", cerUserName='" + cerUserName + '\'' +
            ", cerState=" + cerState +
            ", cerDate=" + cerDate +
            ", cerMan='" + cerMan + '\'' +
            ", cerThink='" + cerThink + '\'' +
            ", cerImg='" + cerImg + '\'' +
            ", cerTime=" + cerTime +
            '}';
  }
}
