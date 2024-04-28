package com.tap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tap.entity.Student;

//no need to specify repository, jparepository already take care of it
//because it already annotated with repository 
//bydefault provide a transaction all its method @transactional

public interface StudentRepository extends JpaRepository<Student, Long>{

	
}
