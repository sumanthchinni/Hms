package com.hms.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class InterviewerIdentity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(nullable = false)
	private int interviewers_id;
	
	@Column(nullable = false)
	private String availability;
	
	public InterviewerIdentity() {
		super();
	}

	public InterviewerIdentity(int interviewers_id, String slot) {
		super();
		this.interviewers_id = interviewers_id;
		this.availability = slot;
	}

	public int getInterviewers_id() {
		return interviewers_id;
	}

	public void setInterviewers_id(int interviewers_id) {
		this.interviewers_id = interviewers_id;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	@Override
	public int hashCode() {
		return Objects.hash(availability, interviewers_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InterviewerIdentity other = (InterviewerIdentity) obj;
		return Objects.equals(availability, other.availability) && interviewers_id == other.interviewers_id;
	}

	

}
