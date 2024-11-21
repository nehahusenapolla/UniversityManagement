package com.codegnan.university.management;

import java.util.ArrayList;
import java.util.List;

public class Professor {
	private String name;
	private List<Course> assignedCourses;

	public Professor(String name) {
		this.name=name;
		this.assignedCourses=new ArrayList<>();
		
	}
	public String getName() {
		return name;
	}
    public void assignCourse(Course course) {
    	if(!assignedCourses.contains(course)) {
    		assignedCourses.add(course);
    	}
		
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public List<Course> getAssignedCourses() {
		return assignedCourses;
	}

    @Override
	public String toString() {
		return name;
	}
	

}
