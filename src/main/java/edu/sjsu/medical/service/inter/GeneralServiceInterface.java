package edu.sjsu.medical.service.inter;

import java.util.List;

import edu.sjsu.medical.model.IssueForm;
import edu.sjsu.medical.model.NewTransaction;
import edu.sjsu.medical.model.Transaction;
import edu.sjsu.medical.model.Inventory;

public interface GeneralServiceInterface {
	public void issueMedicine(IssueForm issueForm);
	public List<Transaction> getAllTransaction();
	public void newTransaction(NewTransaction newTransactionFOrm);
	public String getNodeNameById(int Id);
	public List<Transaction> getTransactionByNodeId(int nodeId);
	List<Inventory> getInventoryByNodeId(int nodeId);
	
}
