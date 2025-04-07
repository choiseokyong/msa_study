package com.msaone.board.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class boardDao {
	final String driver = "org.mariadb.jdbc.Driver";
	final String DB_URL = "jdbc:mariadb://localhost:3307/kit";
	private Connection con;
	private ResultSet rs;
	private PreparedStatement pstmt;
	
	public ArrayList getList() {
		ArrayList list = new ArrayList();
		
		try {
			con = DriverManager.getConnection(DB_URL, "root", "1234");
			System.out.println("DB 연결 성공");
			
			String sql = "SELECT * FROM tb_test";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			int i = 0;
			
			while(rs.next()) {
				Map map = new HashMap();
				map.put("name", rs.getString(1));
				map.put("addr", rs.getString(2));
				list.add(i, map);
				System.out.println(rs.getString(1) + "\t" + rs.getString(2));
				i++;
			}
		} catch (SQLException e) {
			System.out.println("원인 : " + e.getMessage());
		}
		
		return list;
	}
}
