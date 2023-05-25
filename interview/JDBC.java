package com.example.java.oops.interview;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {
	public static void main(String[] args) {
		try {
//			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Talent_Engine?useSSL=false","root","Odisha@123#");
			System.out.println("connection established");
			String query = "select * from Employee e inner join participants_Meeting pom on e.empId=pom.empId where meetingId=\"Java111\"";
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(query);
			System.out.println("-------Solution of first question-----------");
			while (rs.next()) {
				int id = rs.getInt("empId");
				String fname = rs.getString("firstName");
				String lname = rs.getString("lastName");
				String email = rs.getString("email");
				String projectcode = rs.getString("projectCode");
				System.out.println(id + "," + fname + "," + lname + "," + email + "," + projectcode);
			}
			String query1 = "select * from Employee e inner join participants_Meeting pom on e.empId=pom.empId where meetingId!=\"Java111\"";
			ResultSet rs1 = statement.executeQuery(query1);
			System.out.println("------------Solution of second question-------------");
			while (rs1.next()) {
				int id = rs1.getInt("empId");
				String fname = rs1.getString("firstName");
				String lname = rs1.getString("lastName");
				String email = rs1.getString("email");
				String projectcode = rs1.getString("projectCode");
				System.out.println(id + "," + fname + "," + lname + "," + email + "," + projectcode);
			}
			String query2 = "select * from Employee e inner join participants_Meeting pom on e.empId=pom.empId where meetingId in (\"Java111\",\"Java112\") and pom.assessmentScore<70";
			ResultSet rs2 = statement.executeQuery(query2);
			System.out.println("----------------Solution of third question----------------");
			while (rs2.next()) {
				int id = rs2.getInt("empId");
				String fname = rs2.getString("firstName");
				String lname = rs2.getString("lastName");
				String email = rs2.getString("email");
				String projectcode = rs2.getString("projectCode");
				System.out.println(id + "," + fname + "," + lname + "," + email + "," + projectcode);
			}
			connection.close();
		} catch (SQLException s) {
			System.out.println(s.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
