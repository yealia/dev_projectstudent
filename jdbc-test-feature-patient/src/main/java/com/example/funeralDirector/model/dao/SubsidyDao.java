package main.java.com.example.funeralDirector.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import main.java.com.example.funeralDirector.model.dto.SubsidyDto;

public class SubsidyDao {
	//이거 계정 연결하는거다 
		private Connection getConnection() throws SQLException {
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			String username = "HOS";
			String password = "HOS";
			System.out.println("연결완료");
			return DriverManager.getConnection(url, username, password);
		}
		
		//부조금 전체 정보 조회 
		public ArrayList<SubsidyDto> selectAll(){
			String sql = "SELECT * FROM SUBSIDY";
			//전체 조회할 꺼니깐 dto형태의 arrayList를 선언해야겠지!
			ArrayList<SubsidyDto> list = new ArrayList<>();
			Connection connection;
			
			try {
				connection = getConnection();
				
				Statement stmt = connection.createStatement();
				ResultSet rset = stmt.executeQuery(sql);
				System.out.println(rset);
				
				while(rset.next()) {
					SubsidyDto sd = new SubsidyDto();
					sd.setSubsidyName(rset.getString(1));
					sd.setSubsidy(rset.getInt(2));
					sd.setAccount_number(rset.getString(3));
					
					list.add(sd);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return list;
		}
		//부조금 전체 정보 조회 끝
}
