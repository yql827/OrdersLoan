package com.zking.pojo;


public class TOverdue {

  private long overdueId;
  private String overdueState;
  private long overdueTime;
  private double overdueMoney;


  public long getOverdueId() {
    return overdueId;
  }

  public void setOverdueId(long overdueId) {
    this.overdueId = overdueId;
  }


  public String getOverdueState() {
    return overdueState;
  }

  public void setOverdueState(String overdueState) {
    this.overdueState = overdueState;
  }


  public long getOverdueTime() {
    return overdueTime;
  }

  public void setOverdueTime(long overdueTime) {
    this.overdueTime = overdueTime;
  }


  public double getOverdueMoney() {
    return overdueMoney;
  }

  public void setOverdueMoney(double overdueMoney) {
    this.overdueMoney = overdueMoney;
  }

  @Override
  public String toString() {
    return "TOverdue{" +
            "overdueId=" + overdueId +
            ", overdueState='" + overdueState + '\'' +
            ", overdueTime=" + overdueTime +
            ", overdueMoney=" + overdueMoney +
            '}';
  }
}
