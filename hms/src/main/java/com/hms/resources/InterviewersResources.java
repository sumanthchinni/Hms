package com.hms.resources;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;

import com.hms.entities.Candidates;
import com.hms.entities.Interviewer;
import com.hms.service.InterviewersService;


@Path("/interviewers")
public class InterviewersResources {
	
	@Autowired
	private InterviewersService interviewerService;
	
	/*
	 * Fetches interviewer Detail By Id.
	 */
//	@GET
//	@Path("/{id}/{availability}")
//	@Produces(MediaType.APPLICATION_JSON)
//	public Interviewer getInterviewersById(@PathParam("id") int id,@PathParam("availability") String availability) {
//		return interviewerService.findInterviewerById(id,availability);
//	}

	/*
	 * All the interviewers details will be displayed.
	 */
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	public List<Interviewer> getAdmins() {
//		return interviewerService.findAllInterviewers();
//	}
	

	/*
	 * New interviewer can be added.
	 */
//	@POST
//	@Path("/addInterviewer")
//	@Consumes(MediaType.APPLICATION_JSON)
//	@Produces(MediaType.APPLICATION_JSON)
//	public Response addInterviewersResponse(Interviewer interviewer) {
//		interviewerService.addInterviewer(interviewer);
//		return Response.status(Status.CREATED).entity(interviewer).build();
//	}
	
	
	/*
	 * Assign
	 */
	@PUT
	@Path("/assign/{id}")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUpdateById(@PathParam("id") int candId, Interviewer interviewer) {
		Interviewer i = interviewerService.UpdateInterviewer(interviewer,candId);
		return Response.status(Status.OK).entity(i).build();
	}
	
	@POST
	@Path("/getInterviewers")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<Interviewer> algoInterviewers(Candidates candidates) {
		return interviewerService.preferredInterviewers(candidates);
	}

}