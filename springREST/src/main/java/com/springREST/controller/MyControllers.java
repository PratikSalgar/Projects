package com.springREST.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springREST.Entity.Courses;
import com.springREST.Services.CourseService;

@RestController
public class MyControllers 
{
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/course")
	public List<Courses> getCourses()
	{
		return this.courseService.getCourses();
	}
	
	@GetMapping("/course/{cid}")
	public Courses getCourseId(@PathVariable String cid)
	{
		return this.courseService.getCourseId(Long.parseLong(cid));
	}
	
	@PostMapping("/course")
	public Courses addCourse(@RequestBody Courses courses)
	{
		return this.courseService.addCourses(courses);
	}
	
	@PutMapping("/course")
	public Courses updateCourse(@RequestBody Courses courses)
	{
		return this.courseService.updateCourse(courses);
	}
	
	@DeleteMapping("/course/{cid}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String cid)
	{
		try
		{
			 this.courseService.deleteCourse(Long.parseLong(cid));
			 return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
