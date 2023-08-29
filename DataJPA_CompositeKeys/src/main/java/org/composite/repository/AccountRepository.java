package org.composite.repository;

import org.composite.Entity.Account;
import org.composite.Entity.AccountPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, AccountPK>{

	
	

}
