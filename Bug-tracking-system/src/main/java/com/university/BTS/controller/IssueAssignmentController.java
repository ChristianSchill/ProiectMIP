package com.university.BTS.controller;

import com.university.BTS.entity.StoryIssueEntity;
import com.university.BTS.service.IssueAssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/assign")

public class IssueAssignmentController {
	
	@Autowired
	private IssueAssignmentService assignmentService;
	
	@RequestMapping(value="/make", method = RequestMethod.GET)
	public void makeAssignment() {
		assignmentService.makeAssignment();
	}
	
	@RequestMapping(value="/summary", method = RequestMethod.GET)
	public List<String> viewAssignment() {
		return assignmentService.getAssignmentSummary();
	}
	
	@RequestMapping(value="/list", method = RequestMethod.GET)
	public Map<Integer, List<StoryIssueEntity>> getAssignmentList() {
		return assignmentService.getAssignmentList();
	}
}
