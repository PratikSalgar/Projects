package com.springREST.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springREST.Entity.Courses;

public interface CourseDao extends JpaRepository<Courses, Long>{

}
