package list.task.fruit;

import java.util.Objects;

//과일 정보를 담을 클래스 선언(Fruit)
//- 과일 이름(중복 없음)
//- 과일 가격
//
//CRUD관련 기능을 담아놓을 클래스 선언(Market)
//- 과일 추가
//- 과일 삭제
//- 과일 가격이 평균 가격보다 낮은 지 검사
//- 과일 전체 조회
//- 과일 이름으로 가격 조회

public class Fruit {

	private String name;
	private int price;
	
	public Fruit() {;}

	public Fruit(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruit other = (Fruit) obj;
		return name == other.name; //이해 안됨.
	}
	
	
}


