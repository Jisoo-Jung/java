package com.app.domain.car;

import java.util.Objects;

public class CarVO {
//    CAR_BRAND VARCHAR2(1000) CONSTRAINT UK_CAR UNIQUE NOT NULL,
//    CAR_MODEL VARCHAR2(1000) NOT NULL,
//    CAR_PRICE NUMBER DEFAULT 0,
//    CAR_RELEASE_DATE DATE,
//    CAR_OWNER_ID NUMBER NOT NULL,
//    CONSTRAINT FK_CAR_CAR_OWNER FOREIGN KEY(CAR_OWNER_ID)
//	REFERENCES TBL_CAR_OWNER(ID)
	
	private Long id;
	private String carBrand;
	private String carModel;
	private int carPrice;
	private String carRelease;
	private int carOwner;
	private String createdDate;
	private String updatedDate;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCarBrand() {
		return carBrand;
	}
	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public int getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(int carPrice) {
		this.carPrice = carPrice;
	}
	public String getCarRelease() {
		return carRelease;
	}
	public void setCarRelease(String carRelease) {
		this.carRelease = carRelease;
	}
	public int getCarOwner() {
		return carOwner;
	}
	public void setCarOwner(int carOwner) {
		this.carOwner = carOwner;
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
		return "CarVO [id=" + id + ", carBrand=" + carBrand + ", carModel=" + carModel + ", carPrice=" + carPrice
				+ ", carRelease=" + carRelease + ", carOwner=" + carOwner + ", createdDate=" + createdDate
				+ ", updatedDate=" + updatedDate + "]";
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
		CarVO other = (CarVO) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
