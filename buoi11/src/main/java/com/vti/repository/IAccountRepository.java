package com.vti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.vti.entity.Account;
import com.vti.entity.Account.AccountRole;

public interface IAccountRepository extends JpaRepository<Account, Integer>, JpaSpecificationExecutor<Account>{
	Account findByUsername(String username);
	
	Account findByEmail(String email);
	
	Account findById(int id);
	
	@Query("SELECT ac FROM Account ac WHERE ac.firstName =:firstNameParameter")
	Account findByFirstName(@Param("firstNameParameter") String firstName);
}
