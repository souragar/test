package com.mediaiq.bi.server.service;

import java.util.List;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mediaiq.bi.server.domain.Book;
import com.mediaiq.bi.server.domain.LendRecords;

@Path("/lendRecords")
public interface LendService extends
		AbstractCrudService<LendRecords, Long> {
	
	@Path("/userRecord/{userName}")
	@Produces(MediaType.APPLICATION_JSON)
	List<LendRecords> findByPersonName(@PathParam("userName") String name);
	

}

