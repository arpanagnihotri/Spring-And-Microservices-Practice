package com.college.repository;
import com.college.entity.*;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

@Repository
public interface CollegeRepo extends CrudRepository<College,Integer> {

}
