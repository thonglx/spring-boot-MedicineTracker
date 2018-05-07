package edu.sjsu.medical.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.sjsu.medical.dao.DAO;
import edu.sjsu.medical.model.Inventory;
import edu.sjsu.medical.model.IssueForm;
import edu.sjsu.medical.model.NewTransaction;
import edu.sjsu.medical.model.Transaction;
import edu.sjsu.medical.service.inter.GeneralServiceInterface;

@Service
public class GeneralService implements GeneralServiceInterface {
	@Autowired
	DAO dao;
	
	@Transactional
	public void issueMedicine(IssueForm issueForm) {
		 dao.issueMedicine(issueForm);
		 dao.updateInventoryWhenIssue(issueForm);
	}
	
	public List<Transaction> getAllTransaction() {
		 return dao.getAllTransaction();
	}

	@Override
	@Transactional
	public void newTransaction(NewTransaction newTransactionForm) {
		dao.newTransaction(newTransactionForm);
		dao.updateInventoryNewTransaction(newTransactionForm);
		dao.subtractInventoryNewTransaction(newTransactionForm);
	}

	@Override
	public String getNodeNameById(int Id) {
		return dao.getNodeNameById(Id);
	}

	@Override
	public List<Transaction> getTransactionByNodeId(int nodeId) {
		return dao.getTransactionByNodeId(nodeId);
	}
	
	@Override
	public List<Inventory> getInventoryByNodeId(int nodeId) {
		return dao.getInventoryByNodeId(nodeId);
	}
	
}
