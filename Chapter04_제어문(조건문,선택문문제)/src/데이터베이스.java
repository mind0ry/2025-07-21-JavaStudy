import java.util.*;
import java.sql.*;
public class 데이터베이스 {

	public static void main(String[] args) 
	throws Exception 
	{
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@211.238.142.124:1521:xe";
		Connection conn = DriverManager.getConnection(url, "hr", "happy");
		
		String sql = "SELECT title, singer FROM genie_music";
		PreparedStatement ps = conn.prepareStatement(sql); // 오라클 전송
		ResultSet rs = ps.executeQuery();
		// sql을 실행한 결과 요청
		while(rs.next()) {	// 데이터 개수 만큼 반복 수행
			String title = rs.getString(1);
			String singer = rs.getString(2);
			if (singer.contains("임영웅"))
				System.out.println(title + " " + singer);
			}
		}
	}

