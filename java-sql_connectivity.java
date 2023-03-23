/**
 * @author Sapt-pal & Souvik21122003
 * @version 100.1
 */
package accredix;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * @author Sapt-pal
 *
 */

public class accredix {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// 
		Scanner input = new Scanner(System.in);
		
		System.out.print("Hey");
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.print("Enter your MySQL Credentials below: ");
		System.out.print("Enter Username: ");
		String username = input.nextLine();
		System.out.print("Enter your password: ");
		String pswd = input.nextLine();
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307", username, pswd);
		if (conn != null) {
				System.out.println("MySQL Connection Successful");
		}
	}

}
