package list.task.fruit;

import java.util.ArrayList;

import list.task.DBConnecter;

public class Page {
	public static void main(String[] args) {
		//- 과일 추가
		//- 과일 삭제
		//- 과일 가격이 평균 가격보다 낮은 지 검사
		//- 과일 전체 조회
		//- 과일 이름으로 가격 조회
		
		Fruit banana = new Fruit("바나나", 1000);
		Fruit melon = new Fruit("멜론", 5000);
		
		Market market = new Market();
		
		//과일 추가하여 DBConnect에 저장.
		
		market.add(melon);
		
		market.add(melon);
		
		market.add(banana);
		
		
		ArrayList<Fruit> fruits = market.allFind();
		System.out.println(fruits);
		
		//과일 삭제하여 DBConnect 저장.
		market.remove(melon);
		
		fruits = market.allFind();
		System.out.println(fruits);
//		
		market.check(melon);
		market.check(banana);
//		
		System.out.println(market.findPrice(melon));

		
	}
}

