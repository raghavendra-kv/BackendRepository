package com.ee.enigma.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DEVICE_ISSUE_INFO")
public class DeviceIssueInfo {
	
	@Id
	private String issueId;
	private long deviceId;
	private String userId;
	private Date issueTime;
	private Date submitTime;
	private Boolean issueByAdmin;
  private Boolean submitByAdmin;
	
  public Boolean getIssueByAdmin()
  {
    return issueByAdmin;
  }
  public void setIssueByAdmin(Boolean issueByAdmin)
  {
    this.issueByAdmin = issueByAdmin;
  }
  public Boolean getSubmitByAdmin()
  {
    return submitByAdmin;
  }
  public void setSubmitByAdmin(Boolean submitByAdmin)
  {
    this.submitByAdmin = submitByAdmin;
  }
  /* GETTERS AND SETTERS */
	public String getIssueId() {
		return issueId;
	}
	public void setIssueId(String issueId) {
		this.issueId = issueId;
	}
	public long getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(long deviceId) {
		this.deviceId = deviceId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Date getIssueTime() {
		return issueTime;
	}
	public void setIssueTime(Date issueTime) {
		this.issueTime = issueTime;
	}
	public Date getSubmitTime() {
		return submitTime;
	}
	public void setSubmitTime(Date submitTime) {
		this.submitTime = submitTime;
	}
}
