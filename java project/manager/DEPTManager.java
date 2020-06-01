package manager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DEPTManager {

	static Scanner sc = new Scanner(System.in);

	static void deptManager1() {
		System.out.println("DEPT Manager Menu");
		System.out.println("=========================================");
		System.out.println("1. List  2. insert  3. search  4. delete ");
		System.out.println("=========================================");
		
		int select = sc.nextInt();
		
		
		switch (select) {
		case 1:
			System.out.println("전체 리스트 출력");
			deptShowAllData();
			break;
		case 2:
			System.out.println("부서 정보를 입력합니다.");
			deptInsert();
			break;
		case 3:
			System.out.println("부서 정보를 검색합니다. 검색할 부서의 부서명을 입력해주세요.");
			deptSearch();
			break;
		case 4:
			System.out.println("부서 정보를 삭제합니다. 삭제할 부서의 부서번호를 입력해주세요.");
			deptDelete();
			break;

		}
		
	}
	
	
	
	
	private static void deptDelete() {
		Connection conn = null;
		ResultSet rs = null;

		try {
			// 1. DB 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Oracle 드라이버 로드 성공");

			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "scott";
			String pw = "tiger";

			// 2. 데이터베이스에 접속
			conn = DriverManager.getConnection(url, user, pw);
			System.out.println("데이터베이스에 접속했습니다.");

			// 3. Statement : Connection
			Statement stmt = conn.createStatement();
			
			Scanner kb = new Scanner(System.in);
			
			System.out.println("부서의 부서번호를 입력해주세요. >> ");
			String searchDeptno = kb.nextLine();

			String sql = "delete * from dept";
			String sql1 = "delete from dept where deptno = "+ searchDeptno;

			// select 의 결과는 ResultSet 이 받는다.
			// excueQuary(sql문)
			rs = stmt.executeQuery(sql1);
			System.out.println("sql : "+ sql1);
			System.out.println();
			System.out.println();
			System.out.println();
			
			

			rs.close();
			stmt.close();
			
			// 4. close
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e.printStackTrace();
			}
		}
	}
		
	




	private static void deptSearch() {
		Connection conn = null;
		ResultSet rs = null;

		try {
			// 1. DB 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Oracle 드라이버 로드 성공");

			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "scott";
			String pw = "tiger";

			// 2. 데이터베이스에 접속
			conn = DriverManager.getConnection(url, user, pw);
			System.out.println("데이터베이스에 접속했습니다.");

			// 3. Statement : Connection
			Statement stmt = conn.createStatement();
			
			Scanner kb = new Scanner(System.in);
			
			System.out.println("부서의 이름을 입력해주세요. >> ");
			String searchName = kb.nextLine();

			String sql = "select * from dept";
			String sql1 = "select * from dept where dname = '"+ searchName+"'";

			// select 의 결과는 ResultSet 이 받는다.
			// excueQuary(sql문)
			rs = stmt.executeQuery(sql1);
			System.out.println("sql : "+ sql1);
			System.out.println();
			System.out.println();
			System.out.println();
			
			System.out.print("부서정보");
			System.out.print("---------------------------");
			System.out.print("부서번호\t부서이름\t지역");
			System.out.print("---------------------------");
			
			while (rs.next()) {
//				System.out.print(rs.getInt("deptno") + "\t");
//				System.out.print(rs.getString("dname") + "\t");
//				System.out.print(rs.getString("loc") + "\n");
				System.out.print(rs.getInt(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\n");
			}

			rs.close();
			stmt.close();
			
			// 4. close
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e.printStackTrace();
			}
		}
	}




	static Connection conn = null;
	static ResultSet rs = null;
	private static void deptShowAllData() {
		try {
			// 1. DB 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Oracle 드라이버 로드 성공");

			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "scott";
			String pw = "tiger";

			// 2. 데이터베이스에 접속
			conn = DriverManager.getConnection(url, user, pw);
			System.out.println("데이터베이스에 접속했습니다.");

			// 3. Statement : Connection
			Statement stmt = conn.createStatement();

			String sql = "select * from dept";

			// select 의 결과는 ResultSet 이 받는다.
			// excueQuary(sql문)
			rs = stmt.executeQuery(sql);

			// ResultSet : next() -> 행의 존재 유무 확인

			System.out.print("부서정보\n");
			System.out.print("---------------------------\n");
			System.out.print("부서번호\t부서이름\t지역\n");
			System.out.print("---------------------------\n");
			
			while (rs.next()) {
//				System.out.print(rs.getInt("deptno") + "\t");
//				System.out.print(rs.getString("dname") + "\t");
//				System.out.print(rs.getString("loc") + "\n");
				System.out.print(rs.getInt(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\n");
				
			}

			rs.close();
			stmt.close();
			
			// 4. close
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e.printStackTrace();
			}

		}
		
	}

	private static void deptInsert() {
		
		// JDBC 사용 객체
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		
		// 사용자 입력정보 변수
		System.out.println("부서 정보를 입력해주세요.");
		
		System.out.println("부서번호");
		int deptno = sc.nextInt();
		sc.nextLine();
		System.out.println("부서이름");
		String dname = sc.nextLine();
		System.out.println("지역");
		String loc = sc.nextLine();

		
		
		// 공백 입력에 대한 예외처리가 있어야 하나 이번 버전에서는 모두 잘 입력된것으로 처리합니다.		
		
		try {
			//0. 드라이버 LIB 추가
			//1. 데이터베이스 드라이버 로드
			//   Class.forName(드라이버 클래스 전체이름)
			//   Oracle : oracle.jdbc.driver.OracleDriver
			Class.forName("oracle.jdbc.driver.OracleDriver");

			
			
			//2. 데이터베이스 연결
			
			//String url = "jdbc:oracle:thin:@주소:포트:데이터베이스이름";
			// 주소 : localhost or 127.0.0.1
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "scott";
			String pw = "tiger";
			
			// Connection 객체 생성
			conn = DriverManager.getConnection(url, user, pw);
			
			//3. SQL 처리
			//   Statement or PreparedStatement
			//   pstmt = conn.prepareStatement(SQL 문장)

			String sql = "insert into dept"
					+ " (deptno, dname, loc) "
					+ " values (?, ?, ?)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			pstmt.setString(2, dname);
			pstmt.setString(3, loc);
			
			
			int resultCnt = pstmt.executeUpdate();
			
			if(resultCnt>0) {
				System.out.println("정상적으로 입력 되었습니다.");
				System.out.println(resultCnt + "행이 입력되었습니다.");
			} else {
				System.out.println("입력이 되지않았습니다. 확인후 재 시도해주세요.");
			}
			
			
			
			
			
			//4. 데이터베이스 연결 종료			
			//pstmt.close();
			//conn.close();
			
			
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {			
			e.printStackTrace();
		} finally {

			
			//4. 데이터베이스 연결 종료	
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
				
			
		}
		
		
		
		
	}


}