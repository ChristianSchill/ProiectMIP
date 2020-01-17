package com.university.BTS.entity;

import com.university.BTS.enums.IssueTypeEnum;
import org.hibernate.annotations.Where;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name="ISSUES")
@Table
@Where(clause = " TYPE = 2")
public class StoryIssueEntity extends IssuesBase
{
	private Integer issueType = IssueTypeEnum.Story.getValue();
	private Integer status;
	private Integer point;
	private Integer assignedWeek;

	public Integer getPoint() {
		return point;
	}

	public void setPoint(Integer point) {
		this.point = point;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getIssueType() {
		return issueType;
	}

	public void setIssueType(Integer issueType) {
		this.issueType = issueType;
	}

	public Integer getAssignedWeek() {
		return assignedWeek;
	}

	public void setAssignedWeek(Integer assignedWeek) {
		this.assignedWeek = assignedWeek;
	}
	
	
}
