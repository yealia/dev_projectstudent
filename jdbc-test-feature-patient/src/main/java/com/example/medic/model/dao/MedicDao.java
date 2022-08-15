package main.java.com.example.medic.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import main.java.com.example.medic.model.dto.Medic;

public class MedicDao {

	public ArrayList<Medic> selectAll() {
		String sql = "SELECT * FROM PHA_STOCK";
		// 받은 결과값을 객체에 저장할 저장 공간을 만들기
		ArrayList<Medic> list = new ArrayList<Medic>();
		Connection connection;
		try {
			connection = getConnection();
			// 연결이 성공하면 커넥션값이 넘어온다.
			System.out.println("conn : " + connection);
			// 쿼리문을 실행할 statement 객체를 만듬
			Statement stmt = connection.createStatement();

			// 쿼리문을 전송하고, 실행할 결과를 resultset으로 받기
			ResultSet rset = stmt.executeQuery(sql);

			while (rset.next()) {
				Medic m = new Medic();
				m.setPhaNo(rset.getInt("PHA_NO"));
				m.setPhaName(rset.getString("PHA_NAME"));
				m.setPhaType(rset.getString("PHA_TYPE"));
				m.setPhaPrice(rset.getInt("PHA_PRICE"));
				m.setPhaStock(rset.getInt("PHA_STOCK"));

				list.add(m);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}

		return list;

	}

	public void insert(Medic medic) {
		String sql = "INSERT INTO PHA_STOCK (pha_no, pha_name, pha_type, pha_price, pha_stock) VALUES (?,?,?,?,?)";

		try (Connection connection = getConnection(); PreparedStatement pstmt = connection.prepareStatement(sql)) {
			pstmt.setInt(1, medic.getPhaNo());
			pstmt.setString(2, medic.getPhaName());
			pstmt.setString(3, medic.getPhaType());
			pstmt.setInt(4, medic.getPhaPrice());
			pstmt.setInt(5, medic.getPhaStock());

			System.out.println("log : insert execute 실행");
			pstmt.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public void update(Medic medic) {
//		String sql = "UPDATE PHA_STOCK SET PHA_STOCK = (PHA_STOCK + ?) WHERE PHA_NAME = ? ;";
		String sql = "UPDATE PHA_STOCK SET PHA_STOCK = (PHA_STOCK + ?) WHERE PHA_NAME = ? ";

			Connection connection;
			try {
				connection = getConnection();
				PreparedStatement pstmt = connection.prepareStatement(sql);
//				System.out.println("conn 연결 : " + connection);
//				pstmt.setString(1, medic.getPhaName());
				pstmt.setInt(1,medic.getPhaStock() );
				pstmt.setString(2, medic.getPhaName());
//				System.out.println("log : update execute 실행");
				pstmt.executeUpdate();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new RuntimeException(e);

			}
			
//		-----------------------------------
//			추가된 제품수량 하나만 출력하기 -- 성공! 눈물날뻘
			String sql2 = "SELECT * FROM PHA_STOCK WHERE PHA_NAME = ?";
			

			PreparedStatement pstmt2;
			ResultSet rset2 = null;

			String title1 ;
			int totalCount = 0;

//			System.out.println(medic.getPhaName());
			try {
				connection = getConnection();
				System.out.println("두번째 연결완료");
				pstmt2 = connection.prepareStatement(sql2);
//				pstmt2.setString(1, "PHA_);
				pstmt2.setString(1, medic.getPhaName());
				// sql 결과값을 가져왔다. 	
				rset2 = pstmt2.executeQuery();
//				System.out.println("rset값 " + rset2.getString("PHA_STOCK"));
//				System.out.println(rset2);
				while(rset2.next()) {
				title1= rset2.getString("PHA_NAME");
				totalCount = rset2.getInt("PHA_STOCK");
//					
//				System.out.println(title1);
//				System.out.println(count);

				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

			
			
			System.out.println("==============================");
			System.out.println("재고입고완료");
			System.out.println("입력하신 상품명 " + medic.getPhaName()+"가 " + +medic.getPhaStock()+" 개 추가되었습니다." );
			System.out.println("총 재고수량은 "+  totalCount+"개 입니다.");
			System.out.println();
			System.out.println();
			System.out.println("==================================");

			// SCAN의 수량을 입력

			
//			String sql = "SELECT PHA_STOCK FROM PHA_STOCK WHERE PHA_NAME = 우루사";


			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

	private Connection getConnection() throws SQLException {
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String username = "HOS";
		String password = "HOS";

		return DriverManager.getConnection(url, username, password);
	}

}
