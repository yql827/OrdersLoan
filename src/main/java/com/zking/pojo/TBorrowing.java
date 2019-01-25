package com.zking.pojo;


public class TBorrowing {

  private long borrowingId;
  private long borrowingState;
  private long userId;
  private String borrowingName;
  private String borrowingIntro;
  private String borrowingAccount;
  private double borrowingMoney;
  private String bigMoney;
  private String profit;
  private long issue;
  private String beginDate;
  private String borrowingUse;
  private String borrowingMethod;
  private String borrowingSource;
  private java.sql.Timestamp borrowingTime;
  private String lastDate;
  private double amountRaised;
  private String plan;
  private String bargainId;
  private String borrowingDescribe;
  private String auditState;
  private String why;


  public long getBorrowingId() {
    return borrowingId;
  }

  public void setBorrowingId(long borrowingId) {
    this.borrowingId = borrowingId;
  }


  public long getBorrowingState() {
    return borrowingState;
  }

  public void setBorrowingState(long borrowingState) {
    this.borrowingState = borrowingState;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public String getBorrowingName() {
    return borrowingName;
  }

  public void setBorrowingName(String borrowingName) {
    this.borrowingName = borrowingName;
  }


  public String getBorrowingIntro() {
    return borrowingIntro;
  }

  public void setBorrowingIntro(String borrowingIntro) {
    this.borrowingIntro = borrowingIntro;
  }


  public String getBorrowingAccount() {
    return borrowingAccount;
  }

  public void setBorrowingAccount(String borrowingAccount) {
    this.borrowingAccount = borrowingAccount;
  }


  public double getBorrowingMoney() {
    return borrowingMoney;
  }

  public void setBorrowingMoney(double borrowingMoney) {
    this.borrowingMoney = borrowingMoney;
  }


  public String getBigMoney() {
    return bigMoney;
  }

  public void setBigMoney(String bigMoney) {
    this.bigMoney = bigMoney;
  }


  public String getProfit() {
    return profit;
  }

  public void setProfit(String profit) {
    this.profit = profit;
  }


  public long getIssue() {
    return issue;
  }

  public void setIssue(long issue) {
    this.issue = issue;
  }


  public String getBeginDate() {
    return beginDate;
  }

  public void setBeginDate(String beginDate) {
    this.beginDate = beginDate;
  }


  public String getBorrowingUse() {
    return borrowingUse;
  }

  public void setBorrowingUse(String borrowingUse) {
    this.borrowingUse = borrowingUse;
  }


  public String getBorrowingMethod() {
    return borrowingMethod;
  }

  public void setBorrowingMethod(String borrowingMethod) {
    this.borrowingMethod = borrowingMethod;
  }


  public String getBorrowingSource() {
    return borrowingSource;
  }

  public void setBorrowingSource(String borrowingSource) {
    this.borrowingSource = borrowingSource;
  }


  public java.sql.Timestamp getBorrowingTime() {
    return borrowingTime;
  }

  public void setBorrowingTime(java.sql.Timestamp borrowingTime) {
    this.borrowingTime = borrowingTime;
  }


  public String getLastDate() {
    return lastDate;
  }

  public void setLastDate(String lastDate) {
    this.lastDate = lastDate;
  }

  public double getAmountRaised() {
    return amountRaised;
  }

  public void setAmountRaised(double amountRaised) {
    this.amountRaised = amountRaised;
  }


  public String getPlan() {
    return plan;
  }

  public void setPlan(String plan) {
    this.plan = plan;
  }


  public String getBargainId() {
    return bargainId;
  }

  public void setBargainId(String bargainId) {
    this.bargainId = bargainId;
  }


  public String getBorrowingDescribe() {
    return borrowingDescribe;
  }

  public void setBorrowingDescribe(String borrowingDescribe) {
    this.borrowingDescribe = borrowingDescribe;
  }


  public String getAuditState() {
    return auditState;
  }

  public void setAuditState(String auditState) {
    this.auditState = auditState;
  }


  public String getWhy() {
    return why;
  }

  public void setWhy(String why) {
    this.why = why;
  }

  @Override
  public String toString() {
    return "TBorrowing{" +
            "borrowingId=" + borrowingId +
            ", borrowingState=" + borrowingState +
            ", userId=" + userId +
            ", borrowingName='" + borrowingName + '\'' +
            ", borrowingIntro='" + borrowingIntro + '\'' +
            ", borrowingAccount='" + borrowingAccount + '\'' +
            ", borrowingMoney=" + borrowingMoney +
            ", bigMoney='" + bigMoney + '\'' +
            ", profit='" + profit + '\'' +
            ", issue=" + issue +
            ", beginDate='" + beginDate + '\'' +
            ", borrowingUse='" + borrowingUse + '\'' +
            ", borrowingMethod='" + borrowingMethod + '\'' +
            ", borrowingSource='" + borrowingSource + '\'' +
            ", borrowingTime=" + borrowingTime +
            ", lastDate=" + lastDate +
            ", amountRaised=" + amountRaised +
            ", plan='" + plan + '\'' +
            ", bargainId='" + bargainId + '\'' +
            ", borrowingDescribe='" + borrowingDescribe + '\'' +
            ", auditState='" + auditState + '\'' +
            ", why='" + why + '\'' +
            '}';
  }
}
