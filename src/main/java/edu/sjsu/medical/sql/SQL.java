package edu.sjsu.medical.sql;

public interface SQL {
public static String INSERT_REVIEW = "INSERT INTO Tyro119H.TESTING (FEEDBACK,RATING,NAME,PRODUCT,IMAGE) VALUES (?, ?, ? ,?,?) " ;
public static String GET_REVIEW = "SELECT * FROM Tyro119H.TESTING  ";
public static String GET_AVERAGE = "SELECT ROUND(AVG(RATING),2) FROM Tyro119H.TESTING WHERE PRODUCT = ?";
}
