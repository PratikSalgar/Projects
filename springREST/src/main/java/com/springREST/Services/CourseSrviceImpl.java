package com.springREST.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springREST.Dao.CourseDao;
import com.springREST.Entity.Courses;

@Service
public class CourseSrviceImpl implements CourseService{

	//1st Way to do CRUD operations
	
	@Autowired
	private CourseDao courseDao;
	
	//Get all Courses
	@Override
	public List<Courses> getCourses() {
		
		return this.courseDao.findAll();
	}
	
	//Get single Course
	@Override
	public Courses getCourseId(long cid) {
		
		return this.courseDao.findById(cid).get();
	}
	
	//Add Courses
	@Override
	public Courses addCourses(Courses courses) {
		
		return this.courseDao.save(courses);
	}

	//Update Courses 
	@Override
	public Courses updateCourse(Courses courses) {
		
		return this.courseDao.save(courses);
	}

	//Delete Courses
	@Override
	public void deleteCourse(long parseLonge) {
		Courses entity = courseDao.getOne(parseLonge);
		courseDao.delete(entity);
	}

	
	
	
	//2 nd way to do CRUD Operations
	
	
//	List<Courses> list;
//	
//	public CourseSrviceImpl()
//	{
//		list = new ArrayList<>();
//		list.add(new Courses(1,"Java core course"));
//		list.add(new Courses(2,"Python course"));
//	}
//	
//	
//	@Override
//	public List<Courses> getCourses() {
//		
//		return list;
//	}
//
//
//	@Override
//	public Courses getCourseId(long cid) {
//		Courses c = null;
//		
//		for(Courses courses : list)
//		{
//			if(courses.getCid()==cid)
//			{
//				c=courses;
//				break;
//			}
//		}
//		
//		return c;
//	}
//
//
//	@Override
//	public Courses addCourses(Courses courses) {
//		
//		list.add(courses);
//		
//		return courses;
//	}
//
//
//	@Override
//	public Courses updateCourse(Courses courses) {
//		list.forEach(e->{
//			if(e.getCid()==courses.getCid())
//			{
//				e.setName(courses.getName());
//			}
//		});
//		return courses;
//	}
//
//
//	@Override
//	public void deleteCourse(long parseLonge) {
//		list=this.list.stream().filter(e->e.getCid()!=parseLonge).collect(Collectors.toList());
//	}



}
