package edu.sjsu.medical.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.sjsu.medical.dao.DAO;
import edu.sjsu.medical.model.IssueForm;
import edu.sjsu.medical.model.NewTransaction;
import edu.sjsu.medical.model.Transaction;
import edu.sjsu.medical.service.inter.GeneralServiceInterface;

@Service
public class GeneralService implements GeneralServiceInterface {
	@Autowired
	DAO dao;
	
	public void issueMedicine(IssueForm issueForm) {
		 dao.issueMedicine(issueForm);
	}
	
	public List<Transaction> getAllTransaction() {
		 return dao.getAllTransaction();
	}

	@Override
	public void newTransaction(NewTransaction newTransactionFOrm) {
		// TODO Auto-generated method stub
		
	}
}
