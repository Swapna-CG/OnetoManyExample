package com.example.springbootonetomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootonetomany.entity.Instructor;




@Repository
public interface InstructorRepository extends JpaRepository<Instructor, Long>{

}
