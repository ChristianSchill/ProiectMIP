package com.university.BTS.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.university.BTS.entity.BugIssueEntity;

@Repository
public interface BugDao extends JpaRepository<BugIssueEntity, Integer> {
	void delete(Integer developerId);


//	@Override
//	@Query(value="from BugIssueEntity b where b.issueType = 1")
//	public List<BugIssueEntity> findAll();
//	
	
}