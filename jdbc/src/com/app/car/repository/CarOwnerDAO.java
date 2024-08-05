package com.app.car.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.app.domain.car.CarOwnerVO;
import com.app.jdbc.configuration.Configuration;

public class CarOwnerDAO {
//	  private Connection connection;
//	   private PreparedStatement preparedStatement;
//	   private ResultSet resultSet;
//	   
//	//   추가하기
//	   public void insert(CarOwnerVO carOwnerVO) {
//	      String query = "INSERT INTO TBL_CAR_OWNER "
//	      		+ "(ID, CAR_OWNER_NAME, CAR_OWNER_PHONE, CAR_OWNER_ADRESS) "
//	      		+ "VALUES(SEQ_MEMBER.NEXTVAL, ?, ?, ?)";
//	      
//	      try {
//	         connection = Configuration.getConnection();
//	         preparedStatement = connection.prepareStatement(query);
//	         preparedStatement.setString(1, carOwnerVO.getName());
//	         preparedStatement.setString(2, carOwnerVO.getPhone());
//	         preparedStatement.setString(3, carOwnerVO.getAdress());
//	         
//	         preparedStatement.executeUpdate();
//	         
//	      } catch (SQLException e) {
//	         e.printStackTrace();
//	      } finally {
//	         try {
//	            if(preparedStatement != null) {
//	               preparedStatement.close();
//	            }
//	            if(connection != null) {
//	               connection.close();
//	            }
//	         } catch (SQLException e) {
//	            throw new RuntimeException();
//	         }
//	      }
//	   }
//	   
//	//   조회하기
//	   public CarOwnerVO select(Long id) {
//	      CarOwnerVO carOwnerVO = new CarOwnerVO();
//	      String query = "SELECT ID, CAR_OWNER_NAME, CAR_OWNER_PHONE, CAR_OWNER_ADRESS "
//	      		+ "FROM TBL_CAR_OWNER "
//	    		+ "WHERE ID = ?";
//	      
//	      try {
//	         connection = Configuration.getConnection();
//	         preparedStatement = connection.prepareStatement(query);
//	         preparedStatement.setLong(1, id);
//	         
//	         resultSet = preparedStatement.executeQuery();
//	         
//	         resultSet.next();
//	         carOwnerVO.setId(resultSet.getLong("ID"));
//	         carOwnerVO.setName(resultSet.getString("CAR_OWNER_NAME"));
//	         carOwnerVO.setPhone(resultSet.getString("CAR_OWNER_PHONE"));
//	         carOwnerVO.setAdress(resultSet.getString("CAR_OWNER_ADRESS"));
//	         carOwnerVO.setCreatedDate(resultSet.getString("CREATED_DATE"));
//	         carOwnerVO.setUpdatedDate(resultSet.getString("UPDATED_DATE"));
//	         
//	      } catch (SQLException e) {
//	         e.printStackTrace();
//	      } finally {
//	         try {
//	            if(resultSet != null) {
//	               resultSet.close();
//	            }
//	            if(preparedStatement != null) {
//	               preparedStatement.close();
//	            }
//	            if(connection != null) {
//	               connection.close();
//	            }
//	         } catch (SQLException e) {
//	            throw new RuntimeException();
//	         }
//	      }
//	      return carOwnerVO;
//	   }
//	   
//	//   수정하기
//	   public void update(CarOwnerVO carOwnerVO) {
//	      String query = "UPDATE TBL_CAR_OWNER "
//	      		+ "SET CAR_OWNER_NAME = ?, CAR_OWNER_PHONE = ?, CAR_OWNER_ADRESS = ? "
//	      		+ "WHERE ID = ?";
//	      
//	      try {
//	         connection = Configuration.getConnection();
//	         preparedStatement = connection.prepareStatement(query);
//	         
//	         preparedStatement.setString(1, carOwnerVO.getName());
//	         preparedStatement.setString(2, carOwnerVO.getPhone());
//	         preparedStatement.setString(3, carOwnerVO.getAd());
//	         preparedStatement.setLong(4, carOwnerVO.getName());
//	         
//	         preparedStatement.executeUpdate();
//	         
//	      } catch (SQLException e) {
//	         e.printStackTrace();
//	      } finally {
//	         try {
//	            if(preparedStatement != null) {
//	               preparedStatement.close();
//	            }
//	            if(connection != null) {
//	               connection.close();
//	            }
//	         } catch (SQLException e) {
//	            throw new RuntimeException();
//	         }
//	      }
//	   }
//	   
//	//   삭제하기
//	   public void delete(Long id) {
//	      String query = "DELETE FROM TBL_MEMBER WHERE ID = ?";
//	      
//	      try {
//	         connection = Configuration.getConnection();
//	         preparedStatement = connection.prepareStatement(query);
//	         
//	         preparedStatement.setLong(1, id);
//	         
//	         preparedStatement.executeUpdate();
//	         
//	      } catch (SQLException e) {
//	         e.printStackTrace();
//	      } finally {
//	         try {
//	            if(preparedStatement != null) {
//	               preparedStatement.close();
//	            }
//	            if(connection != null) {
//	               connection.close();
//	            }
//	         } catch (SQLException e) {
//	            throw new RuntimeException();
//	         }
//	      }
//	   }
//	   
//	//   전체 조회하기
//	   public ArrayList<MemberVO> selectAll() {
//	      ArrayList<MemberVO> members = new ArrayList<MemberVO>();
//	      MemberVO memberVO = null;
//	      String query = "SELECT ID, MEMBER_EMAIL, MEMBER_PASSWORD, MEMBER_NAME, "
//	            + "MEMBER_AGE, MEMBER_GENDER "
//	            + "FROM TBL_MEMBER";
//	      
//	      try {
//	         connection = Configuration.getConnection();
//	         preparedStatement = connection.prepareStatement(query);
//	         
//	         resultSet = preparedStatement.executeQuery();
//	         
//	         if(resultSet.next()) {
//	            do {
//	               memberVO = new MemberVO();
//	               memberVO.setId(resultSet.getLong("ID"));
//	               memberVO.setMemberEmail(resultSet.getString("MEMBER_EMAIL"));
//	               memberVO.setMemberPassword(resultSet.getString("MEMBER_PASSWORD"));
//	               memberVO.setMemberName(resultSet.getString("MEMBER_NAME"));
//	               memberVO.setMemberAge(resultSet.getInt("MEMBER_AGE"));
//	               memberVO.setMemberGender(resultSet.getInt("MEMBER_GENDER"));
//	               memberVO.setCreatedDate(resultSet.getString("CREATED_DATE"));
//	               memberVO.setUpdatedDate(resultSet.getString("UPDATED_DATE"));
//	               
//	               members.add(memberVO);
//	               
//	            } while(resultSet.next());
//	         }
//	         
//	      } catch (SQLException e) {
//	         e.printStackTrace();
//	      } finally {
//	         try {
//	            if(resultSet != null) {
//	               resultSet.close();
//	            }
//	            if(preparedStatement != null) {
//	               preparedStatement.close();
//	            }
//	            if(connection != null) {
//	               connection.close();
//	            }
//	         } catch (SQLException e) {
//	            throw new RuntimeException();
//	         }
//	      }
//	      return members;
//	   }
}
