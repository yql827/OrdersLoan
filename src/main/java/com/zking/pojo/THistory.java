package com.zking.pojo;


public class THistory {

  private long historyId;
  private java.sql.Timestamp historyTime;
  private String historyHead;
  private double historyMoney;
  private String historyTogo;
  private String historyNowstate;
  private String _;


  public long getHistoryId() {
    return historyId;
  }

  public void setHistoryId(long historyId) {
    this.historyId = historyId;
  }


  public java.sql.Timestamp getHistoryTime() {
    return historyTime;
  }

  public void setHistoryTime(java.sql.Timestamp historyTime) {
    this.historyTime = historyTime;
  }


  public String getHistoryHead() {
    return historyHead;
  }

  public void setHistoryHead(String historyHead) {
    this.historyHead = historyHead;
  }


  public double getHistoryMoney() {
    return historyMoney;
  }

  public void setHistoryMoney(double historyMoney) {
    this.historyMoney = historyMoney;
  }


  public String getHistoryTogo() {
    return historyTogo;
  }

  public void setHistoryTogo(String historyTogo) {
    this.historyTogo = historyTogo;
  }


  public String getHistoryNowstate() {
    return historyNowstate;
  }

  public void setHistoryNowstate(String historyNowstate) {
    this.historyNowstate = historyNowstate;
  }


  public String get_() {
    return _;
  }

  public void set_(String _) {
    this._ = _;
  }

  @Override
  public String toString() {
    return "THistory{" +
            "historyId=" + historyId +
            ", historyTime=" + historyTime +
            ", historyHead='" + historyHead + '\'' +
            ", historyMoney=" + historyMoney +
            ", historyTogo='" + historyTogo + '\'' +
            ", historyNowstate='" + historyNowstate + '\'' +
            ", _='" + _ + '\'' +
            '}';
  }
}
