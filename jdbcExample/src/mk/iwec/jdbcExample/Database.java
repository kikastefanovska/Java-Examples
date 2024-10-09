package mk.iwec.jdbcExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
	private Connection conn;
	private Statement st;
	
	public Database() {
		String url = "jdbc:sqlserver://DESKTOP-60LOJPU\\MSSQLSERVER01;databaseName=iwecDatabase;"
				+ "integratedSecurity=true;trustServerCertificate=true";
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").getConstructor().newInstance();
			conn = DriverManager.getConnection(url);	
			st = conn.createStatement();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void close() {
		try {
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void insert() {
		try {
			st.executeUpdate("insert into students (first_name, last_name) values ('Dusan', 'Krstic')");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void insertPS(String first_name, String last_name) {
		try(PreparedStatement ps = conn.prepareStatement("insert into students (first_name, last_name) values (?, ?)")){
			ps.setString(1, first_name);
			ps.setString(2, last_name);
			ps.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void select(){
		try {
			ResultSet rs = st.executeQuery("select * from students");
			while(rs.next()) {
				System.out.println(rs.getString("first_name") + ' ' + rs.getString("last_name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void update() {
		try {
			st.executeUpdate("update students set first_name='Ana' where id = 1");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void updatePS(int id, String first_name, String last_name) {
		try(PreparedStatement ps = conn.prepareStatement("update students set first_name = ?, last_name = ? where id = ?")){
			ps.setString(1, first_name);
			ps.setString(2, last_name);
			ps.setInt(3, id);
			ps.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void delete() {
		try {
			st.executeUpdate("delete from students where id=2");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deletePS(int id) {
		try (PreparedStatement ps = conn.prepareStatement("delete from students where id=?")){
			ps.setInt(1, id);
			ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

