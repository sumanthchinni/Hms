package com.hms.dao;

import java.util.List;

import com.hms.entities.Candidates;

/*
 * 
 */
public interface CandidatesDAO {

	public abstract Candidates findCandidateById(int id);

	public abstract List<Candidates> findAllCandidates();
	
	public abstract void addCandidates(Candidates candidates);
	
//	public abstract Candidates updateCandidates(Candidates candidates);

}
