package mk.iwec.fileDataBaseExample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FileDatabaseExample {

	public static void main(String[] args) throws Exception {
		
		String csvFilePath = "students.csv";
		String jdbcUrl = "jdbc:sqlserver://DESKTOP-60LOJPU\\MSSQLSERVER01;databaseName=studentsDb;"
				+ "integratedSecurity=true;trustServerCertificate=true";
		Connection conn =null;
		String insertQuery ="insert into students (first_Name,last_Name,age) values (?,?,?)";
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").getConstructor().newInstance();
			conn= DriverManager.getConnection(jdbcUrl);
			
			BufferedReader br = new BufferedReader(new FileReader(csvFilePath));
			PreparedStatement ps = conn.prepareStatement(insertQuery);
			String line;
			br.readLine();
			while ((line = br.readLine()) != null) {
				String[] data = line.split(",");
				String firstName = data[0].trim();
				String lastName = data[1].trim();
				int age = Integer.parseInt(data[2].trim());
				
				ps.setString(1,firstName);
				ps.setString(2, lastName);
				ps.setInt(3, age);
				
				ps.executeUpdate();
			}
			
			
			} catch (Exception e) {
				e.printStackTrace();
			
		}finally {
			if (conn!= null) {
				conn.close();
			}
		}
	}

}
