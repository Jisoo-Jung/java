package com.app.repository.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import com.app.domain.post.PostVO;
import com.app.jdbc.configuration.Configuration;

public class PostDAO {
	private Connection connection; 
	//DBMS에 접속(연결)
	private PreparedStatement preparedStatement;
	//
	private ResultSet resultSet;
	
//  추가하기
	public void insert(PostVO postVO) {
		String query = "INSERT INTO TBL_POST "
				+ "(ID, POST_TITLE, POST_CONTENT, MEMBER_ID) "
				+ "VALUES(SEQ_POST.NEXTVAL, ?, ?, ?)";
		
		connection = Configuration.getConnection();
		
		
		try {
		connection = Configuration.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, postVO.getPostTitle());
			preparedStatement.setString(2, postVO.getPostContent());
			preparedStatement.setInt(3, postVO.getMemberId());
			
			preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(preparedStatement != null) {
	               preparedStatement.close();
	            }
	            if(connection != null) {
	               connection.close();
	            }
			} catch (SQLException e) {
				throw new RuntimeException();
			}    
		}
		
	}
	
	//try catch 전체 잡는 법 - 단축키 
	//한꺼번에 글자 쓰는 것 - 단축키 
	
//	조회하기
	public PostVO select(Long id) {
		PostVO postVO = new PostVO();
		String query = "SELECT ID, POST_TITLE, POST_CONTENT, MEMBER_ID "
				+ "FROM TBL_POST "
				+ "WHERE ID = ?";
		
		try {
			connection = Configuration.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, id);
			
			
			resultSet = preparedStatement.executeQuery();
			
			resultSet.next();
			postVO.setId(resultSet.getLong("ID"));
			postVO.setPostTitle(resultSet.getString("POST_TITLE"));
			postVO.setPostContent(resultSet.getString("POST_CONTENT"));
			postVO.setMemberId(resultSet.getInt("MEMBER_ID"));
			postVO.setCreatedDate(resultSet.getString("CREATED_DATE"));
			postVO.setUpdatedDate(resultSet.getString("UPDATED_DATE"));
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) {
					resultSet.close();
				}
				
				if(preparedStatement != null) {
	               preparedStatement.close();
	            }
	            if(connection != null) {
	               connection.close();
	            }
			} catch (SQLException e) {
				throw new RuntimeException();
			}    
		}
		return postVO;
	}
//	수정하기
	public void update(PostVO postVO) {
		String query = "UPDATE TBL_POST "
				+ "SET POST_TITLE = ?, POST_CONTENT = ?, MEMBER_ID = ? "
				+ "WHERE ID = ?";
		
		try {
		     connection = Configuration.getConnection();
	         preparedStatement = connection.prepareStatement(query);
	         
	         preparedStatement.setString(1, postVO.getPostTitle());
	         preparedStatement.setString(2, postVO.getPostContent());
	         preparedStatement.setInt(3, postVO.getMemberId());
	         preparedStatement.setLong(4, postVO.getId());
	         
	         preparedStatement.executeUpdate();
	         
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(preparedStatement != null) {
	               preparedStatement.close();
	            }
	            if(connection != null) {
	               connection.close();
	            }
			} catch (SQLException e) {
				throw new RuntimeException();
			}    
		}
	}
	
//	삭제하기
	public void delete(Long id) {
		String query = "DELETE FROM TBL_POST WHERE ID = ?";
		
		try {
		     connection = Configuration.getConnection();
	         preparedStatement = connection.prepareStatement(query);
	         
	         preparedStatement.setLong(1, id);
	         
	         preparedStatement.executeUpdate();
	         
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(preparedStatement != null) {
	               preparedStatement.close();
	            }
	            if(connection != null) {
	               connection.close();
	            }
			} catch (SQLException e) {
				throw new RuntimeException();
			}    
		}
	}
	
//	전체 조회하기
	public ArrayList<PostVO> selectAll() {
		ArrayList<PostVO> posts = new ArrayList<PostVO>();
		PostVO postVO = null;
		String query = "SELECT ID, POST_TITLE, POST_CONTENT, MEMBER_ID "
				+ "FROM TBL_POST";
		
		try {
			connection = Configuration.getConnection();
			preparedStatement = connection.prepareStatement(query);
			
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				do {
					postVO = new PostVO();		
					postVO.setId(resultSet.getLong("ID"));
					postVO.setPostTitle(resultSet.getString("POST_TITLE"));
					postVO.setPostContent(resultSet.getString("POST_CONTENT"));
					postVO.setMemberId(resultSet.getInt("MEMBER_ID"));
					postVO.setCreatedDate(resultSet.getString("CREATED_DATE"));
					postVO.setUpdatedDate(resultSet.getString("UPDATED_DATE"));
					
					posts.add(postVO);
			
				} while(resultSet.next());
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) {
					resultSet.close();
				}
				
				if(preparedStatement != null) {
	               preparedStatement.close();
	            }
	            if(connection != null) {
	               connection.close();
	            }
			} catch (SQLException e) {
				throw new RuntimeException();
			}    
		}
		return posts;
	}
}
