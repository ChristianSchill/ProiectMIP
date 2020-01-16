package com.university.BTS.entity;

import com.university.BTS.enums.IssueTypeEnum;
import org.hibernate.annotations.Where;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="ISSUES")
@Where(clause = " TYPE = 1")

public class BugIssueEntity extends IssuesBase
{
	private Integer issueType = IssueTypeEnum.Bug.getValue();
	private Integer status;
	private Integer priority;
	
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Integer getIssueType() {
		return issueType;
	}

	public void setIssueType(Integer issueType) {
		this.issueType = issueType;
	}
	
}
