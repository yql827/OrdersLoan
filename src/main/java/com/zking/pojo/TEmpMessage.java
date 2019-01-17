package com.zking.pojo;


public class TEmpMessage {

  private long empMessageId;
  private long empId;
  private long deptId;
  private String empName;
  private java.sql.Timestamp empInductionDate;
  private String empSex;
  private java.sql.Timestamp empBirthday;
  private String empIdcard;
  private String empTel;
  private String empEml;


  public long getEmpMessageId() {
    return empMessageId;
  }

  public void setEmpMessageId(long empMessageId) {
    this.empMessageId = empMessageId;
  }


  public long getEmpId() {
    return empId;
  }

  public void setEmpId(long empId) {
    this.empId = empId;
  }


  public long getDeptId() {
    return deptId;
  }

  public void setDeptId(long deptId) {
    this.deptId = deptId;
  }


  public String getEmpName() {
    return empName;
  }

  public void setEmpName(String empName) {
    this.empName = empName;
  }


  public java.sql.Timestamp getEmpInductionDate() {
    return empInductionDate;
  }

  public void setEmpInductionDate(java.sql.Timestamp empInductionDate) {
    this.empInductionDate = empInductionDate;
  }


  public String getEmpSex() {
    return empSex;
  }

  public void setEmpSex(String empSex) {
    this.empSex = empSex;
  }


  public java.sql.Timestamp getEmpBirthday() {
    return empBirthday;
  }

  public void setEmpBirthday(java.sql.Timestamp empBirthday) {
    this.empBirthday = empBirthday;
  }


  public String getEmpIdcard() {
    return empIdcard;
  }

  public void setEmpIdcard(String empIdcard) {
    this.empIdcard = empIdcard;
  }


  public String getEmpTel() {
    return empTel;
  }

  public void setEmpTel(String empTel) {
    this.empTel = empTel;
  }


  public String getEmpEml() {
    return empEml;
  }

  public void setEmpEml(String empEml) {
    this.empEml = empEml;
  }

  @Override
  public String toString() {
    return "TEmpMessage{" +
            "empMessageId=" + empMessageId +
            ", empId=" + empId +
            ", deptId=" + deptId +
            ", empName='" + empName + '\'' +
            ", empInductionDate=" + empInductionDate +
            ", empSex='" + empSex + '\'' +
            ", empBirthday=" + empBirthday +
            ", empIdcard='" + empIdcard + '\'' +
            ", empTel='" + empTel + '\'' +
            ", empEml='" + empEml + '\'' +
            '}';
  }
}
