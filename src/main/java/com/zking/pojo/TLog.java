package com.zking.pojo;


public class TLog {

  private long logId;
  private long userId;
  private java.sql.Timestamp logTime;
  private String logAddress;


  public long getLogId() {
    return logId;
  }

  public void setLogId(long logId) {
    this.logId = logId;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public java.sql.Timestamp getLogTime() {
    return logTime;
  }

  public void setLogTime(java.sql.Timestamp logTime) {
    this.logTime = logTime;
  }


  public String getLogAddress() {
    return logAddress;
  }

  public void setLogAddress(String logAddress) {
    this.logAddress = logAddress;
  }

  @Override
  public String toString() {
    return "TLog{" +
            "logId=" + logId +
            ", userId=" + userId +
            ", logTime=" + logTime +
            ", logAddress='" + logAddress + '\'' +
            '}';
  }
}
