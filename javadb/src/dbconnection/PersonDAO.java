package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PersonDAO {  //DB����, �߰�(create), �б�(��ȸ)read, ����update, ����delete - crud
	private String driverClass = "oracle.jdbc.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String username = "system";
	private String password = "12345";
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	//DB ����
	public void connDB() {
		try {
			Class.forName(driverClass);
			conn = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//���� ����
	public void disconnectRS() { //select �϶� ���
		if(rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		if(pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}//����
	
	//���� ����
		public void disconnect() {  //select�� �ƴѰ�� - create, update, delete
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}//����
	
	//��ü ��� ��ȸ
	public ArrayList<Person> getListAll(){
		ArrayList<Person> list = new ArrayList<>();
		connDB();
		String sql = "SELECT * FROM person";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String id = rs.getString("userId");
				String pw = rs.getString("userPw");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				
				Person person = new Person();
				person.setUserId(id);
				person.setUserPw(pw);
				person.setName(name);
				person.setAge(age);
				
				list.add(person);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnectRS();
		}
		return list;
	}//getListAll() �ݱ�
	
	//��� �߰�
	public void create(Person person) {
		String userId = person.getUserId();
		String userPw = person.getUserPw();
		String name = person.getName();
		int age = person.getAge();
		
		connDB();
		String sql = "INSERT INTO person VALUES (?, ?, ?, ?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userId);
			pstmt.setString(2, userPw);
			pstmt.setString(3, name);
			pstmt.setInt(4, age);
			pstmt.executeUpdate();  //����! ����
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}		
	}//create �ݱ�
	
	public boolean delete(String userId) {
		connDB();
		String sql = "DELETE FROM person WHERE userid = ? ";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userId);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
}//class �ݱ�










