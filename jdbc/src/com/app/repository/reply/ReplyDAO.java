package com.app.repository.reply;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.management.RuntimeErrorException;

import com.app.domain.reply.ReplyDTO;
import com.app.domain.reply.ReplyVO;
import com.app.jdbc.configuration.Configuration;

public class ReplyDAO {
	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	
//	댓글 작성
	public void insert(ReplyVO replyVO) {
		String query = "INSERT INTO TBL_REPLY "
				+ "(ID, REPLY_CONTENT, POST_ID, MEMBER_ID) "
				+ "VALUES(SEQ_POST.NEXTVAL, ?, ?, ?)";
		
		try {
			connection = Configuration.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, replyVO.getReplyContent());
			preparedStatement.setLong(2, replyVO.getPostId());
			preparedStatement.setLong(3, replyVO.getMemberId());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			System.err.println("insert(ReplyVO) SQL 오류");
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
	
//	댓글 전체 목록
	public ArrayList<ReplyDTO> selectAll() {
		ReplyDTO replyDTO = null;
		ArrayList<ReplyDTO> replys = new ArrayList<ReplyDTO>();
		//replies
		
		//지수(postTitle 필요없다고 함. 이유는?)
//		String query = "SELECT R.ID, R.REPLY_CONTENT, P.POST_TITLE, M.MEMBER_NAME, "
//				+ "R.CREATED_DATE, R.UPDATED_DATE "
//				+ "FROM TBL_MEMBER M JOIN TBL_REPLY R "
//				+ "ON M.ID = R.MEMBER_ID "
//				+ "JOIN TBL_POST P "
//				+ "ON P.ID = R.POST_ID"; 
		String query = "SELECT R.ID, R.REPLY_CONTENT, M.MEMBER_NAME, "
		+ "R.CREATED_DATE, R.UPDATED_DATE "
		+ "FROM TBL_MEMBER M JOIN TBL_REPLY R "
		+ "ON M.ID = R.MEMBER_ID";
		
		
		try {
			connection = Configuration.getConnection();
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				
				do {
					replyDTO = new ReplyDTO();
					replyDTO.setId(resultSet.getLong("ID"));
					replyDTO.setReplyContent(resultSet.getString("REPLY_CONTENT"));
//					replyDTO.setPostTitle(resultSet.getString("POST_TITLE"));
					replyDTO.setMemberName(resultSet.getString("MEMBER_NAME"));
					replyDTO.setCreatedDate(resultSet.getString("CREATED_DATE"));
					replyDTO.setUpdatedDate(resultSet.getString("UPDATED_DATE"));					
				
					replys.add(replyDTO);
					
				} while(resultSet.next());
				
			}
			
			
		} catch (SQLException e) {
			System.out.println("select(long) SQL 오류");
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
		return replys;
	}
	
//	댓글 수정
	public void update(ReplyVO replyVO) {
		String query = "UPDATE TBL_REPLY "
				+ "SET REPLY_CONTENT = ?, UPDATED_DATE = SYSDATE "
				+ "WHERE ID = ?";
		
		try {
			connection = Configuration.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, replyVO.getReplyContent());
			preparedStatement.setLong(2, replyVO.getId());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			System.out.println("update(ReplyVO) SQL 오류");
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
	
//	댓글 삭제
	public void delete(Long id) {
		String query = "DELETE FROM TBL_REPLY WHERE ID = ?";
		
		try {
			connection = Configuration.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, id);
			preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("delete(long) SQL 오류");
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
	
}





















