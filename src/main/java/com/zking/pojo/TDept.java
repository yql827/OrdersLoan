package com.zking.pojo;


public class TDept {

  private long deptId;
  private String deptName;
  private String describes;


  public long getDeptId() {
    return deptId;
  }

  public void setDeptId(long deptId) {
    this.deptId = deptId;
  }


  public String getDeptName() {
    return deptName;
  }

  public void setDeptName(String deptName) {
    this.deptName = deptName;
  }


  public String getDescribes() {
    return describes;
  }

  public void setDescribes(String describes) {
    this.describes = describes;
  }

  @Override
  public String toString() {
    return "TDept{" +
            "deptId=" + deptId +
            ", deptName='" + deptName + '\'' +
            ", describes='" + describes + '\'' +
            '}';
  }
}
