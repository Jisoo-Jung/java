package com.app.jdbc.configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Configuration {

   public static Connection getConnection() {
      Connection connection = null;
      
      String userName = "scott";//DB서버에 로그인할 계정
      String password = "1234";//DB서버에 로그인할 비밀번호
      String url = "jdbc:oracle:thin:@localhost:1521:XE";//프로토콜, 서버주소, 서버포트, DB이름
      
      try {
    	  //준비된 JDBC 드라이버 파일을 사용할 수 있도록 메모리에 로딩해야 함.
          //JDBC드라이버를 메모리에 동적으로 로딩하기 위하여 Class.forName()을 이용함.
         Class.forName("oracle.jdbc.driver.OracleDriver");
//			forName() 메소드 소괄호 안에 JDBC 드라이버 파일 안에서 드라이버 Interface를 상속하고 있는
//			클래스 이름을 패키지 이름과 함께 작성함.(오타 없어야 함!)
         //Class.forName()에 의해 'JDBC 드라이버 파일'의 '드라이버 Interface를 상속한 클래스'가 
         //동적으로 로딩될 때 자동으로 JDBC 드라이버 instance가 생성되어 준비가 완료됨.
         connection = DriverManager.getConnection(url, userName, password);
      } catch (ClassNotFoundException e) {
         System.out.println("드라이버 로딩 실패");
         e.printStackTrace();
      } catch (SQLException e) {
         System.out.println("연결 정보 오류");
         e.printStackTrace();
      }
      
      return connection;
   }
   
}
