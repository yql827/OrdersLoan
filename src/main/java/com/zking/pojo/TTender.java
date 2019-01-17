package com.zking.pojo;


public class TTender {

  private long tenderId;
  private long userId;
  private double tenderMoney;
  private java.sql.Timestamp tenderDate;
  private String tenderBorrState;
  private long tenderState;
  private String tenderType;
  private String tenderFit;
  private String profitmodel;
  private double profitmoney;
  private String replaydate;


  public long getTenderId() {
    return tenderId;
  }

  public void setTenderId(long tenderId) {
    this.tenderId = tenderId;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public double getTenderMoney() {
    return tenderMoney;
  }

  public void setTenderMoney(double tenderMoney) {
    this.tenderMoney = tenderMoney;
  }


  public java.sql.Timestamp getTenderDate() {
    return tenderDate;
  }

  public void setTenderDate(java.sql.Timestamp tenderDate) {
    this.tenderDate = tenderDate;
  }


  public String getTenderBorrState() {
    return tenderBorrState;
  }

  public void setTenderBorrState(String tenderBorrState) {
    this.tenderBorrState = tenderBorrState;
  }


  public long getTenderState() {
    return tenderState;
  }

  public void setTenderState(long tenderState) {
    this.tenderState = tenderState;
  }


  public String getTenderType() {
    return tenderType;
  }

  public void setTenderType(String tenderType) {
    this.tenderType = tenderType;
  }


  public String getTenderFit() {
    return tenderFit;
  }

  public void setTenderFit(String tenderFit) {
    this.tenderFit = tenderFit;
  }


  public String getProfitmodel() {
    return profitmodel;
  }

  public void setProfitmodel(String profitmodel) {
    this.profitmodel = profitmodel;
  }


  public double getProfitmoney() {
    return profitmoney;
  }

  public void setProfitmoney(double profitmoney) {
    this.profitmoney = profitmoney;
  }


  public String getReplaydate() {
    return replaydate;
  }

  public void setReplaydate(String replaydate) {
    this.replaydate = replaydate;
  }

  @Override
  public String toString() {
    return "TTender{" +
            "tenderId=" + tenderId +
            ", userId=" + userId +
            ", tenderMoney=" + tenderMoney +
            ", tenderDate=" + tenderDate +
            ", tenderBorrState='" + tenderBorrState + '\'' +
            ", tenderState=" + tenderState +
            ", tenderType='" + tenderType + '\'' +
            ", tenderFit='" + tenderFit + '\'' +
            ", profitmodel='" + profitmodel + '\'' +
            ", profitmoney=" + profitmoney +
            ", replaydate='" + replaydate + '\'' +
            '}';
  }
}
