package edu.sjsu.medical.sql;

public interface SQLQueries {
	public static final String ALL_PRODUCTS_INFO = "SELECT PRODUCT_ID,PRODUCT_NAME,EXPIRED_DATE,INGREDIENT,NOTICE FROM Tyro119H.PRODUCT;";
	public static final String ISSUE = "INSERT INTO Tyro119H.TRANSACTION  (ISSUER,ITEM,AMOUNT) VALUES(?,?,?)";
	public static String ALL_TRANSACTIONS = "SELECT T.TRANSACTION_ID, " + 
											"(SELECT N.NODE_NAME  " + 
											"        FROM   Tyro119H.NODE N  " + 
											"        WHERE  T.ISSUER = N.NODE_ID) ISSUER, " + 
											"(SELECT N.NODE_NAME  " + 
											"        FROM   Tyro119H.NODE N  " + 
											"        WHERE  T.SELLER = N.NODE_ID) SELLER, " + 
											"(SELECT N.NODE_NAME  " + 
											"        FROM   Tyro119H.NODE N  " + 
											"        WHERE  T.BUYER = N.NODE_ID) BUYER, " + 
											"        T.TIME_STAMP, " + 
											"        P.PRODUCT_NAME, " + 
											"        T.AMOUNT " + 
											"FROM Tyro119H.TRANSACTION T " + 
											"JOIN Tyro119H.PRODUCT P ON T.ITEM = P.PRODUCT_ID ";
	public static String NEW_TRANSACTION ="INSERT INTO Tyro119H.TRANSACTION (BUYER,SELLER,ITEM,AMOUNT) VALUES (?,?,?,?)";
}
