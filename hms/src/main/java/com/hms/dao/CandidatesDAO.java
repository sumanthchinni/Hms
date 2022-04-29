package com.hms.dao;

import java.util.List;

import javax.transaction.NotSupportedException;
import javax.transaction.SystemException;

import com.hms.entities.Candidates;

/*
 * 
 */
public interface CandidatesDAO {

	public abstract Candidates findCandidateById(int id);

	public abstract List<Candidates> findAllCandidates();

	public void addCandidates(Candidates candidates);
	
	public void deleteCandidates(Candidates candidates);

	public abstract Candidates updateCandidatesQuestionnaires(Candidates candidates);
	
	public abstract List<Candidates> findByDomainId(int id);

}
