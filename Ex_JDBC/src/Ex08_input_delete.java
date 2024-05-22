import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex08_input_delete {

	public static void main(String[] args) {
		// 아이디를 입력받아서 데이터를 삭제해보세요
		
		//sql : delete from member where id =
		
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
           //scanner 사용하기
           Scanner sc = new Scanner(System.in);
           System.out.print("id 입력 : ");
           String delete_id =sc.next();   
           
           //sql 통로 열기
           String sql = "delete from member where id=?";
           psmt = conn.prepareStatement(sql);

           psmt.setString(1, delete_id);
           
           //sql 통과 할 수 있는 코드
           int row = psmt.executeUpdate();
           if(row>0) {
        	   System.out.println("delete success");
           }else {
        	   System.out.println("delete fail");
        	   
           }
           
        } catch (ClassNotFoundException | SQLException e) {
           e.printStackTrace();
        }
        //통로 닫기
        finally {
           
              try {
                 if(psmt != null)psmt.close();
                 if(conn != null) conn.close();
              } catch (SQLException e) {
                 // TODO Auto-generated catch block
                 e.printStackTrace();
              }
           
        }

	}

}
