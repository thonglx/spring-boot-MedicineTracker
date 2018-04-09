package edu.sjsu.medical.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import edu.sjsu.medical.model.IssueForm;
import edu.sjsu.medical.model.NewTransaction;
import edu.sjsu.medical.model.Transaction;
import edu.sjsu.medical.sql.SQLQueries;

@Repository
public class DAO {
	@Autowired
	private JdbcTemplate jtm;
	
	public String getNodeNameById(int Id) {
		    String nodeName = (String) jtm.queryForObject(
		    		SQLQueries.NODE_NAME, new Object[] { Id }, String.class);
		    return nodeName;
		}

	public void  issueMedicine(IssueForm issueForm) {
		jtm.update(SQLQueries.ISSUE, new Object[] { issueForm.getNodeId(),
				issueForm.getProductId(),issueForm.getNewAmount()  
			});
	}
	
	public void  newTransaction(NewTransaction newTransactionForm) {
		jtm.update(SQLQueries.NEW_TRANSACTION, new Object[] { newTransactionForm.getSellerId(),
																newTransactionForm.getBuyerId(),
																newTransactionForm.getProductId(),
																newTransactionForm.getAmount()
			});
	}
	
	public List<Transaction>  getAllTransaction() {
		return jtm.query(SQLQueries.ALL_TRANSACTIONS, new RowMapper<Transaction>(){  
			
			@Override  
			  public Transaction mapRow(ResultSet rs, int rownumber) throws SQLException {  
		      Transaction transaction = 
		    		new Transaction(rs.getInt("TRANSACTION_ID"), 
					rs.getString("ISSUER"), 
					rs.getString("SELLER"),
					rs.getString("BUYER"),
					rs.getDate("TIME_STAMP"),
					rs.getString("PRODUCT_NAME"),
					rs.getInt("AMOUNT")
					);
			return transaction;                    
			}
			    });  
			}  
	
	public List<Transaction>  getTransactionByNodeId(int nodeId) {
		String whereClause = " WHERE T.ISSUER = "+ nodeId + " OR T.SELLER  = " + nodeId + " OR T.BUYER = "+ nodeId;
		return jtm.query(SQLQueries.ALL_TRANSACTIONS + whereClause , new RowMapper<Transaction>(){  
			
			@Override  
			  public Transaction mapRow(ResultSet rs, int rownumber) throws SQLException {  
		      Transaction transaction = 
		    		new Transaction(rs.getInt("TRANSACTION_ID"), 
					rs.getString("ISSUER"), 
					rs.getString("SELLER"),
					rs.getString("BUYER"),
					rs.getDate("TIME_STAMP"),
					rs.getString("PRODUCT_NAME"),
					rs.getInt("AMOUNT")
					);
			return transaction;                    
			}
			    });  
			} 
	
	
	
}