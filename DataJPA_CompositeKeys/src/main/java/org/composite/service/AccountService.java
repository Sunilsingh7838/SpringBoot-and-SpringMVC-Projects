package org.composite.service;

import java.util.Optional;

import org.composite.Entity.Account;
import org.composite.Entity.AccountPK;
import org.composite.repository.AccountRepository;
import org.springframework.stereotype.Service;
@Service
public class AccountService {
	private AccountRepository accRepo;

	public AccountService(AccountRepository accRepo) {
		this.accRepo = accRepo;
	}
	
	public void getDataUsingPK() {
		
		AccountPK pk = new AccountPK();
		pk.setAccId(101);
		pk.setAccType("CURRENT");
		pk.setHolderName("IBM");
		
		Optional<Account> findById = accRepo.findById(pk);
		if(findById.isPresent()) {
			System.out.println(findById.get());
		}
	}
		
		public void saveAccData() {
			AccountPK pk = new AccountPK();
			pk.setAccId(104);
			pk.setAccType("SAVING");
			pk.setHolderName("TCS");
			
			Account acc = new Account();
			acc.setBranchName("Ameerpreet");
			acc.setMinBAl(500.00);
			
			acc.setAccPK(pk);
			accRepo.save(acc);

		}
		
		public void saveAccData1() {
			AccountPK pk1 = new AccountPK();
			pk1.setAccId(105);
			pk1.setAccType("CURRENT");
			pk1.setHolderName("IBM");
			
			Account acc = new Account();
			acc.setBranchName("PORT");
			acc.setMinBAl(1000.00);
			
			acc.setAccPK(pk1);
			accRepo.save(acc);
			
		}
		
	
	

}
