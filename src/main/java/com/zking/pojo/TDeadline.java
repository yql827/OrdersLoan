package com.zking.pojo;


public class TDeadline {

  private long deadlineId;
  private long deadlineTime;
  private String profit;


  public long getDeadlineId() {
    return deadlineId;
  }

  public void setDeadlineId(long deadlineId) {
    this.deadlineId = deadlineId;
  }


  public long getDeadlineTime() {
    return deadlineTime;
  }

  public void setDeadlineTime(long deadlineTime) {
    this.deadlineTime = deadlineTime;
  }


  public String getProfit() {
    return profit;
  }

  public void setProfit(String profit) {
    this.profit = profit;
  }

  @Override
  public String toString() {
    return "TDeadline{" +
            "deadlineId=" + deadlineId +
            ", deadlineTime=" + deadlineTime +
            ", profit='" + profit + '\'' +
            '}';
  }
}
