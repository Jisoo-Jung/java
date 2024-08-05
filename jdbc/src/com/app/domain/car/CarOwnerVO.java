package com.app.domain.car;

import java.util.Objects;

public class CarOwnerVO {
//    ID NUMBER CONSTRAINT PK_CAR_OWNER PRIMARY KEY,	
//    CAR_OWNER_NAME VARCHAR2(1000) NOT NULL,
//    CAR_OWNER_PHONE VARCHAR2(1000) NOT NULL,
//    CAR_OWNER_ADRESS VARCHAR2(1000) NOT NULL
	
	private Long id;
	private String name;
	private String phone;
	private String adress;
	private String createdDate;
	private String updatedDate;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public String getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}
	@Override
	public String toString() {
		return "CarOwnerVO [id=" + id + ", name=" + name + ", phone=" + phone + ", adress=" + adress + ", createdDate="
				+ createdDate + ", updatedDate=" + updatedDate + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CarOwnerVO other = (CarOwnerVO) obj;
		return Objects.equals(id, other.id);
	}
	
}
