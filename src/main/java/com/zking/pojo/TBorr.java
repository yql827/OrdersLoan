package com.zking.pojo;


public class TBorr {

  private long borrId;
  private long borrState;
  private long borrowingId;
  private java.sql.Timestamp nowTime;
  private java.sql.Timestamp lastTime;
  private double needMoney;
  private long overdueTime;
  private double _;


  public long getBorrId() {
    return borrId;
  }

  public void setBorrId(long borrId) {
    this.borrId = borrId;
  }


  public long getBorrState() {
    return borrState;
  }

  public void setBorrState(long borrState) {
    this.borrState = borrState;
  }


  public long getBorrowingId() {
    return borrowingId;
  }

  public void setBorrowingId(long borrowingId) {
    this.borrowingId = borrowingId;
  }


  public java.sql.Timestamp getNowTime() {
    return nowTime;
  }

  public void setNowTime(java.sql.Timestamp nowTime) {
    this.nowTime = nowTime;
  }


  public java.sql.Timestamp getLastTime() {
    return lastTime;
  }

  public void setLastTime(java.sql.Timestamp lastTime) {
    this.lastTime = lastTime;
  }


  public double getNeedMoney() {
    return needMoney;
  }

  public void setNeedMoney(double needMoney) {
    this.needMoney = needMoney;
  }


  public long getOverdueTime() {
    return overdueTime;
  }

  public void setOverdueTime(long overdueTime) {
    this.overdueTime = overdueTime;
  }


  public double get_() {
    return _;
  }

  public void set_(double _) {
    this._ = _;
  }

  @Override
  public String toString() {
    return "TBorr{" +
            "borrId=" + borrId +
            ", borrState=" + borrState +
            ", borrowingId=" + borrowingId +
            ", nowTime=" + nowTime +
            ", lastTime=" + lastTime +
            ", needMoney=" + needMoney +
            ", overdueTime=" + overdueTime +
            ", _=" + _ +
            '}';
  }
}
