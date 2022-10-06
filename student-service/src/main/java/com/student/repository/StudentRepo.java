package com.student.repository;
import com.student.entity.*;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface StudentRepo extends CrudRepository<Student,Integer>{

}
