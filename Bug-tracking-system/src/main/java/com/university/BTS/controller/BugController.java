package com.university.BTS.controller;

import com.university.BTS.entity.BugIssueEntity;
import com.university.BTS.service.BugService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;


@RestController
@RequestMapping("/bug")

public class BugController {
	
	@Autowired
	private BugService bugService;
	
	@RequestMapping(value = "list", method=RequestMethod.GET)
	public List<BugIssueEntity> getBugs() {
		return bugService.getBugs();
	}
	
	@RequestMapping(value = "create", method = RequestMethod.POST)
    public BugIssueEntity create(@RequestBody BugIssueEntity bug) {
        return bugService.add(bug);
    }
	
	@RequestMapping(value = "update/{id}", method = RequestMethod.PUT)
    public BugIssueEntity update(@RequestBody BugIssueEntity bug) {
        return bugService.update(bug);
    }

	@RequestMapping(value = "delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable(value = "id") Integer bugId) {
		bugService.delete(bugId);
	}

	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	public BugIssueEntity getBug(@PathVariable(value = "id") Integer bugId) {
		return bugService.getBug(bugId);
	}
	
	@RequestMapping(value="list/status", method = RequestMethod.GET)
	public HashMap<Integer, String> getStatusMap() {
		return bugService.getBugStatusMap();
	}
	
	@RequestMapping(value="list/priorities", method = RequestMethod.GET)
	public HashMap<Integer, String> getPriorityMap() {
		return bugService.getBugPriorityMap();
	}
	
}
