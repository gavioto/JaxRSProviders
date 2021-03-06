/*******************************************************************************
* Copyright (c) 2015 Composent, Inc. and others. All rights reserved. This
* program and the accompanying materials are made available under the terms of
* the Eclipse Public License v1.0 which accompanies this distribution, and is
* available at http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
*   Composent, Inc. - initial API and implementation
******************************************************************************/
package com.mycorp.examples.student;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/studentservice")
public interface StudentService {

	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/students")
	List<Student> getStudents();

	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/students/{studentId}")
	Student getStudent(@PathParam("studentId") String id);

	@POST
	@Produces(MediaType.APPLICATION_XML)
	@Path("/students/{studentName}")
	Student createStudent(@PathParam("studentName") String studentName);

	@PUT
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	@Path("/students")
	Student updateStudent(Student student);

	@DELETE
	@Path("/students/{studentId}")
	@Produces(MediaType.APPLICATION_XML)
	Student deleteStudent(@PathParam("studentId") String studentId);
}
