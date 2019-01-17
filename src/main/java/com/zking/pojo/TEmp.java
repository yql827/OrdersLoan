package com.zking.pojo;


public class TEmp {

  private long empId;
  private String empNo;
  private String empPwd;
  private long empState;


  public long getEmpId() {
    return empId;
  }

  public void setEmpId(long empId) {
    this.empId = empId;
  }


  public String getEmpNo() {
    return empNo;
  }

  public void setEmpNo(String empNo) {
    this.empNo = empNo;
  }


  public String getEmpPwd() {
    return empPwd;
  }

  public void setEmpPwd(String empPwd) {
    this.empPwd = empPwd;
  }


  public long getEmpState() {
    return empState;
  }

  public void setEmpState(long empState) {
    this.empState = empState;
  }

  @Override
  public String toString() {
    return "TEmp{" +
            "empId=" + empId +
            ", empNo='" + empNo + '\'' +
            ", empPwd='" + empPwd + '\'' +
            ", empState=" + empState +
            '}';
  }
}
