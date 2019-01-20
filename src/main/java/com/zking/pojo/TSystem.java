package com.zking.pojo;


public class TSystem {

  private long systemId;
  private String shiroCode;
  private String systemName;
  private long systemFid;
  private String url;
  private  Integer type;


  public long getSystemId() {
    return systemId;
  }

  public void setSystemId(long systemId) {
    this.systemId = systemId;
  }


  public String getShiroCode() {
    return shiroCode;
  }

  public void setShiroCode(String shiroCode) {
    this.shiroCode = shiroCode;
  }


  public String getSystemName() {
    return systemName;
  }

  public void setSystemName(String systemName) {
    this.systemName = systemName;
  }


  public long getSystemFid() {
    return systemFid;
  }

  public void setSystemFid(long systemFid) {
    this.systemFid = systemFid;
  }


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "TSystem{" +
                "systemId=" + systemId +
                ", shiroCode='" + shiroCode + '\'' +
                ", systemName='" + systemName + '\'' +
                ", systemFid=" + systemFid +
                ", url='" + url + '\'' +
                ", type=" + type +
                '}';
    }
}
