<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="ck" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<%@ include file="header.jsp" %>
</head>
<body>
	<%@ include file="navbar.jsp" %>
	
	<div class="container">
		<div class="row">
			<div class="col-sm-12">
				<ck:choose>
					<ck:when test="${mode == 'NEW'}">
						<br/>
						<h3>New Student</h3>
					</ck:when>
					<ck:when test="${mode == 'VIEW'}">
						<br/>
						<h3>List Students</h3>
					</ck:when>
				</ck:choose>
			</div>
		</div>
		<ck:choose>
			<ck:when test="${mode == 'NEW'}">
				<div class="row">
					<div class="col-sm-12">
						<a class="btn btn-success" href="#">Back</a>
						<br/>
						<br/>
					</div>
				</div>
				<form action="/student/savestudent" method="POST">
					<div class="form-group row">
					    <label for="name" class="col-sm-2 col-form-label">Name</label>
					    <div class="col-sm-4">
					      <input type="text" class="form-control" id="name" name="name" placeholder="Name">
					    </div>
				  	</div>
				  	<div class="form-group row">
					    <label for="gender" class="col-sm-2 col-form-label">Gender</label>
					    <div class="col-sm-4">
					      <select class="form-control" id="gender" name="gender">
					      	<option value="1">Female</option>
					      	<option value="0">Male</option>
					      </select>
					    </div>
				  	</div>
				  	<div class="form-group row">
					    <label for="pob" class="col-sm-2 col-form-label">Place of Birth</label>
					    <div class="col-sm-4">
					      <input type="text" class="form-control" id="pob" name="pob" placeholder="Place of Birth">
					    </div>
				  	</div>
				  	<div class="form-group row">
					    <label for="phone" class="col-sm-2 col-form-label">Phone Number</label>
					    <div class="col-sm-4">
					      <input type="text" class="form-control" id="phone" name="phone" placeholder="Phone Number">
					    </div>
				  	</div>
				  	<div class="form-group row">
					    <label for="email" class="col-sm-2 col-form-label">Email Address</label>
					    <div class="col-sm-4">
					      <input type="email" class="form-control" id="email" name="email" placeholder="Email Address">
					    </div>
				  	</div>
				  	<div class="form-group row">
					    <label for="btnsubmit" class="col-sm-2 col-form-label"> </label>
					    <div class="col-sm-4">
					      	<button type="submit" class="btn btn-primary">Save</button>
					    </div>
				  	</div>
				</form>
			</ck:when>
			<ck:when test="${mode == 'VIEW'}">
				<table class="table">
				  <thead>
				    <tr>
				      <th scope="col">#</th>
				      <th scope="col">Name</th>
				      <th scope="col">Gender</th>
				      <th scope="col">Place of Birth</th>
				      <th scope="col">Phone</th>
				      <th scope="col">Email</th>
				      <th scope="col">Edit</th>
				      <th scope="col">Delete</th>
				    </tr>
				  </thead>
				  <tbody>
				  	<ck:forEach var="stu" items="${stuList}">
				  		<tr>
				  			<td>${stu.id}</td>
				  			<td>${stu.name}</td>
				  			<td>${stu.gender == 1? "Female" : "Male"}</td>
				  			<td>${stu.pob}</td>
				  			<td>${stu.phone}</td>
				  			<td>${stu.email}</td>
				  			<td>#</td>
				  			<td><a href="/student/delete?deleteID=${stu.id}">Delete</a></td>
				  		</tr>
				  	</ck:forEach>
				  </tbody>
				</table>
			</ck:when>
		</ck:choose>
	</div>
</body>
</html>