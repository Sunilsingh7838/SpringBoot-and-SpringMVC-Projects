package org.composite.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "BANK_ACCOUNTS")
public class Account {

	@Column(name = "BRANCH_NAME")
	private String branchName;
	
	@Column(name = "MIN_BAL")
	private double minBAl;
	
	@EmbeddedId
	private AccountPK accPK;

	public AccountPK getAccPK() {
		return accPK;
	}

	public void setAccPK(AccountPK accPK) {
		this.accPK = accPK;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public double getMinBAl() {
		return minBAl;
	}

	public void setMinBAl(double minBAl) {
		this.minBAl = minBAl;
	}
	
}
