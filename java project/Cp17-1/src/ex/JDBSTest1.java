package ex;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class JDBSTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub






			  
	
		Connection conn = null;
		 try{
		// 1. DB 드라이버 로드
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Oracle 드라이버 로드 성공");
	
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String user = "scott";
		String pw = "tiger";
		
		// 2. 데이터베이스에 접속
		conn = DriverManager.getConnection(url, user, pw);
		System.out.println("데이터베이스에 접속했습니다.");
		
		// 트랜잭션 설정
		conn.setAutoCommit(false);
		
		// 3. sql 로 데이터 처리
		
		// commit : 처리 완료
		conn.close();
		
		// 4. close
	      conn.close(); 
	      }catch(ClassNotFoundException e) {
	         e.printStackTrace();
	      } catch(SQLException e) {
	         try{
	         conn.rollback();
	         }catch(SQLException e1) {
	         e.printStackTrace();
	         }
	         
	      }
     
	   }

	
	}


