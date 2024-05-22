import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex10_input_select {

	public static void main(String[] args) {
		Connection conn = null;
        PreparedStatement psmt = null;
        ResultSet rs = null;
        
        //동적 로딩 
        try {
           Class.forName("oracle.jdbc.driver.OracleDriver");
           
           //DB연결
           String user = "service";
           String pw = "12345";
           String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
           conn = DriverManager.getConnection(url,user, pw);
           
           if(conn!= null) {
              System.out.println("연결 성공");
           }else {
              System.out.println("연결 실패");
           }
           
           //sql문 통로
           String sql = "select * from member where id =?";
           psmt = conn.prepareStatement(sql);
           
           //scanner 통해서 입력 받아 보겠습니다
           Scanner sc = new Scanner(System.in);
           String input_id=sc.next();
           
           psmt.setString(1, input_id);
           
           //sql 통과코드
           rs = psmt.executeQuery();
           while(rs.next()) {
        	   String get_id=rs.getString("id");
        	   String get_pw=rs.getString("pw");
        	   String get_name=rs.getString("name");
        	   int get_age=rs.getInt("age");
        	   
        	   System.out.println(("id : ")+get_id);
        	   System.out.println(("pw : ")+get_pw);
        	   System.out.println(("name : ")+get_name);
        	   System.out.println(("age : ")+get_age);
        	   System.out.println("====================="); 
           }
                    
        } catch (ClassNotFoundException | SQLException e) {
           e.printStackTrace();
        }
        //통로 닫기
        finally {
           
              try {
                 if(rs != null)rs.close();
                 if(psmt != null)psmt.close();
                 if(conn != null) conn.close();
              } catch (SQLException e) {
                 // TODO Auto-generated catch block
                 e.printStackTrace();
              }
           
        }

	}

}
