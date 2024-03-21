package com.springREST.Services;

import java.util.List;

import com.springREST.Entity.Courses;

public interface CourseService 
{
	public List<Courses> getCourses();
	
	public Courses getCourseId(long cid);
	
	public Courses addCourses(Courses courses);
	
	public Courses updateCourse(Courses courses);
	
	public void deleteCourse(long parseLonge);
}
