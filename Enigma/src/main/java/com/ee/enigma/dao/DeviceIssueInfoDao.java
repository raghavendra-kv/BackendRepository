package com.ee.enigma.dao;

import java.sql.Date;
import java.util.List;

import com.ee.enigma.model.DeviceIssueInfo;

public interface DeviceIssueInfoDao {
	public DeviceIssueInfo getDeviceIssueInfo(long deviceId);
	public DeviceIssueInfo getDeviceIssueInfoByIssueID(String issueId);
	//public String submitDeviceIssueInfo(long deviceId,String userId);
	public void createDeviceIssueInfo(DeviceIssueInfo deviceIssueInfo) ;
	public void updateDeviceIssueInfo(DeviceIssueInfo deviceIssueInfo) ;
	public List<DeviceIssueInfo> getDeviceIssueInfoList(long deviceId) ;
	public List<DeviceIssueInfo> getDeviceIssueInfoList(long deviceId,String userId) ;
	public List<DeviceIssueInfo> getDeviceIssueInfoListByDate(long deviceId,Date beginDate,Date endDate) ;
	
}
