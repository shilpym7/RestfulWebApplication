package com.myapplication.rest.webservices.restfulwebservices.todo;

import java.util.Date;

public class Todo {
 private int id;
 private String username;
 private String description;
 
 protected Todo() {}
 public Todo(int id, String username, String description, Date targetdate, boolean isDone) {
	super();
	this.id = id;
	this.username = username;
	this.description = description;
	this.targetdate = targetdate;
	this.isDone = isDone;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getDescription() {
	return description;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + id;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Todo other = (Todo) obj;
	if (id != other.id)
		return false;
	return true;
}
public void setDescription(String description) {
	this.description = description;
}
public Date getTargetdate() {
	return targetdate;
}
public void setTargetdate(Date targetdate) {
	this.targetdate = targetdate;
}
public boolean isDone() {
	return isDone;
}
public void setDone(boolean isDone) {
	this.isDone = isDone;
}
private Date targetdate;
 private boolean isDone;
}
