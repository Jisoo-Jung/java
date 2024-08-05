package list.task.food;

import java.util.ArrayList;

import list.task.DBConnecter;

public class Restaurant {
//	- 음식 추가
	public void add(Food food) {
		DBConnecter.foods.add(food);
	}
	
//	- 음식 이름으로 음식 종류 조회
	public Food checkFoodName(String name) {
		ArrayList<Food> foods = (ArrayList<Food>) DBConnecter.foods.clone();
		
		for (int i = 0; i < foods.size(); i++) {
			if(foods.get(i).getName().equals(name)) {
				return foods.get(i);
			}
		}
		
		return null;
	}
	
//	- 사용자가 원하는 종류의 음식 전체 조회
	public ArrayList<Food> selectAll(){
//		foods 안에 있는 값을 모두 복사했으나, 안에 있는 값도 주소값이기 때문에 깊은 복사가 필요한다.
//		return (ArrayList<Food>) DBConnecter.foods.clone();
		
//		깊은 복사를 위해 저장소(DB)에 있는 Food 객체를 새로 만든 Food객체로 값을 옮겨 담아준다.
//		주소가 달라지기 때문에 이제 원본은 외부에서 바뀔 수 없다(immutable).
//		//얕은 복사, 깊은 복사 중 얕은 복사는 사실 여러 이슈가 많다고 함. 깊은 복사만 사용하라고 하심.
		//공부하는 것 때문에 clone()을 알려준 것이지, 실무에서는 깊은 복사만 사용한다고 하심.
		//Food 클래스에서 아래에 있는 초기화 생성자를 호출하여 생성자를 만든 것은 복사 때 사용하기 위해서
		//라는 뜻으로 이해했다. 맞을까? 그래서 정확한 용어로 뭐라고 정의해야 할까? 잘 모르겠다.
		ArrayList<Food> foods = new ArrayList<Food>();
		
		for (int i = 0; i < DBConnecter.foods.size(); i++) {
			foods.add(new Food(DBConnecter.foods.get(i)));
		}
		return foods;
	}
	
//	- 음식 종류 수정 후 가격 10% 상승
	public void update(Food food) {
		int targetIndex = DBConnecter.foods.indexOf(food);
		food.setPrice((int)(food.getPrice() * 1.1));
		DBConnecter.foods.set(targetIndex, food);
	}
	
//	- 사용자가 원하는 종류의 음식 개수 조회
	public ArrayList<Food> findByKind(String kind){
		ArrayList<Food> foods = (ArrayList<Food>) DBConnecter.foods.clone();
		ArrayList<Food> result = new ArrayList<Food>();
		
		for (int i = 0; i < foods.size(); i++) {
			if(foods.get(i).getKind().equals(kind)) {
				result.add(foods.get(i));
			}
		}
		
		return result;
	}
}

















