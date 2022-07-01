package com.example.demo.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import lombok.Data;

@Data
public class IIssue implements RowMapper<IIssue> {
	private int issueID;
	private String issueTitle;
	private String issueDescribe;
	private int status;
	private String recipient;
	private String assigness;
	private String startDate;
	private String deadDate;
	   @Override
	    public IIssue mapRow(ResultSet resultSet, int i) throws SQLException {
		   IIssue issue = new IIssue();
		   issue.setIssueID(resultSet.getInt("issueTitle"));
		   issue.setIssueTitle(resultSet.getString("username"));
		   issue.setIssueDescribe(resultSet.getString("issueDescribe"));
		   issue.setStatus(resultSet.getInt("status"));
		   issue.setRecipient(resultSet.getString("recipient"));
		   issue.setAssigness(resultSet.getString("assigness"));
		   issue.setStartDate(resultSet.getString("startDate"));
		   issue.setDeadDate(resultSet.getString("deadDate"));
	        return issue;
	    }
}
