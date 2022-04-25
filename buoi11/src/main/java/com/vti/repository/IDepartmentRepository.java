package com.vti.repository;

import com.vti.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.vti.entity.Department;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IDepartmentRepository extends JpaRepository<Department, Integer>, JpaSpecificationExecutor<Department>{


    Department findByName(String name);

//    Department findByEmail(String email);
//
//    Department findById(int id);

//    @Query("SELECT ac FROM Account ac WHERE ac.firstName =:firstNameParameter")
//    Department findByFirstName(@Param("firstNameParameter") String firstName);
}
