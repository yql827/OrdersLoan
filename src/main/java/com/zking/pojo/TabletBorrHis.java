package com.zking.pojo;


public class TabletBorrHis {

  private long borrHisId;
  private long borrId;
  private java.sql.Timestamp borrHisTime;
  private long overdueId;
  private double borrHisMoney;


  public long getBorrHisId() {
    return borrHisId;
  }

  public void setBorrHisId(long borrHisId) {
    this.borrHisId = borrHisId;
  }


  public long getBorrId() {
    return borrId;
  }

  public void setBorrId(long borrId) {
    this.borrId = borrId;
  }


  public java.sql.Timestamp getBorrHisTime() {
    return borrHisTime;
  }

  public void setBorrHisTime(java.sql.Timestamp borrHisTime) {
    this.borrHisTime = borrHisTime;
  }


  public long getOverdueId() {
    return overdueId;
  }

  public void setOverdueId(long overdueId) {
    this.overdueId = overdueId;
  }


  public double getBorrHisMoney() {
    return borrHisMoney;
  }

  public void setBorrHisMoney(double borrHisMoney) {
    this.borrHisMoney = borrHisMoney;
  }

  @Override
  public String toString() {
    return "TabletBorrHis{" +
            "borrHisId=" + borrHisId +
            ", borrId=" + borrId +
            ", borrHisTime=" + borrHisTime +
            ", overdueId=" + overdueId +
            ", borrHisMoney=" + borrHisMoney +
            '}';
  }
}
