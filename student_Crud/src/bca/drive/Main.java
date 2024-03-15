package bca.drive;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import bca.model.Student;


public class Main {


	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/Adjava";
		String username ="root";
		String password ="tan89553";
		Connection con =DriverManager.getConnection(url,username,password);
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        
        while(true) {
        	menu();
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1: s.addStudent(con,sc);
				break;
				
			case 2: s.displayStudent(con);
				break;
				
			case 3: s.updateStudentName(con,sc);
				break;
				
			case 4: s.deleteStudent(con, sc);
				break;
				
			case 5:
				System.out.println("Exit...");
				System.out.println("Thank You for visting");
				System.exit(0);
			default:
				System.out.println("Wrong Choice...");
			}
		}
		
	}
	
	public static void menu() {
		System.out.println("------------Menu-----------");
		System.out.println("1. Add New Student");
		System.out.println("2. Display All Students");
		System.out.println("3. Update Name of Student");
		System.out.println("4. Delete a Student");
		System.out.println("5. Exit");
		System.out.println("Your Choice...");
	}
        
        
	

}
