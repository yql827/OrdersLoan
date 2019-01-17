package com.zking.pojo;


public class TUser {

  private long userId;
  private String userType;
  private String userTel;
  private String userEml;
  private String userSimpname;
  private String userHead;
  private String userPwd;
  private String userName;
  private String userIdcard;
  private String userSex;
  private long userState;
  private long onDegree;
  private double onMoney;
  private String jobCategory;
  private String jobIndustry;
  private String incomeState;
  private String sheets;
  private java.sql.Timestamp userDate;
  private String userLv;
  private long userScore;
  private String userAddress;
  private long autonym;
  private double userMoney;


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public String getUserType() {
    return userType;
  }

  public void setUserType(String userType) {
    this.userType = userType;
  }


  public String getUserTel() {
    return userTel;
  }

  public void setUserTel(String userTel) {
    this.userTel = userTel;
  }


  public String getUserEml() {
    return userEml;
  }

  public void setUserEml(String userEml) {
    this.userEml = userEml;
  }


  public String getUserSimpname() {
    return userSimpname;
  }

  public void setUserSimpname(String userSimpname) {
    this.userSimpname = userSimpname;
  }


  public String getUserHead() {
    return userHead;
  }

  public void setUserHead(String userHead) {
    this.userHead = userHead;
  }


  public String getUserPwd() {
    return userPwd;
  }

  public void setUserPwd(String userPwd) {
    this.userPwd = userPwd;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public String getUserIdcard() {
    return userIdcard;
  }

  public void setUserIdcard(String userIdcard) {
    this.userIdcard = userIdcard;
  }


  public String getUserSex() {
    return userSex;
  }

  public void setUserSex(String userSex) {
    this.userSex = userSex;
  }


  public long getUserState() {
    return userState;
  }

  public void setUserState(long userState) {
    this.userState = userState;
  }


  public long getOnDegree() {
    return onDegree;
  }

  public void setOnDegree(long onDegree) {
    this.onDegree = onDegree;
  }


  public double getOnMoney() {
    return onMoney;
  }

  public void setOnMoney(double onMoney) {
    this.onMoney = onMoney;
  }


  public String getJobCategory() {
    return jobCategory;
  }

  public void setJobCategory(String jobCategory) {
    this.jobCategory = jobCategory;
  }


  public String getJobIndustry() {
    return jobIndustry;
  }

  public void setJobIndustry(String jobIndustry) {
    this.jobIndustry = jobIndustry;
  }


  public String getIncomeState() {
    return incomeState;
  }

  public void setIncomeState(String incomeState) {
    this.incomeState = incomeState;
  }


  public String getSheets() {
    return sheets;
  }

  public void setSheets(String sheets) {
    this.sheets = sheets;
  }


  public java.sql.Timestamp getUserDate() {
    return userDate;
  }

  public void setUserDate(java.sql.Timestamp userDate) {
    this.userDate = userDate;
  }


  public String getUserLv() {
    return userLv;
  }

  public void setUserLv(String userLv) {
    this.userLv = userLv;
  }


  public long getUserScore() {
    return userScore;
  }

  public void setUserScore(long userScore) {
    this.userScore = userScore;
  }


  public String getUserAddress() {
    return userAddress;
  }

  public void setUserAddress(String userAddress) {
    this.userAddress = userAddress;
  }


  public long getAutonym() {
    return autonym;
  }

  public void setAutonym(long autonym) {
    this.autonym = autonym;
  }


  public double getUserMoney() {
    return userMoney;
  }

  public void setUserMoney(double userMoney) {
    this.userMoney = userMoney;
  }

  @Override
  public String toString() {
    return "TUser{" +
            "userId=" + userId +
            ", userType='" + userType + '\'' +
            ", userTel='" + userTel + '\'' +
            ", userEml='" + userEml + '\'' +
            ", userSimpname='" + userSimpname + '\'' +
            ", userHead='" + userHead + '\'' +
            ", userPwd='" + userPwd + '\'' +
            ", userName='" + userName + '\'' +
            ", userIdcard='" + userIdcard + '\'' +
            ", userSex='" + userSex + '\'' +
            ", userState=" + userState +
            ", onDegree=" + onDegree +
            ", onMoney=" + onMoney +
            ", jobCategory='" + jobCategory + '\'' +
            ", jobIndustry='" + jobIndustry + '\'' +
            ", incomeState='" + incomeState + '\'' +
            ", sheets='" + sheets + '\'' +
            ", userDate=" + userDate +
            ", userLv='" + userLv + '\'' +
            ", userScore=" + userScore +
            ", userAddress='" + userAddress + '\'' +
            ", autonym=" + autonym +
            ", userMoney=" + userMoney +
            '}';
  }
}
