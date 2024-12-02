package sec01.exam05;

import java.util.*;
class Food {
    public String name;
    public int price;
    public int people;

    public Food(String name, int price, int people) {
        this.name = name;
        this.price = price;
        this.people = people;

        // 주문이 잘못된 경우 처리
        if (people == 0) {
            System.out.println("주문이 잘못됐습니다.");
        } else {
            this.price = price * people; // 가격을 인원 수에 따라 계산
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Food) {
            Food food = (Food) obj;
            return food.name.equals(name) && (food.price == price) && (food.people == people);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return name.hashCode() + price;
    }

    
    @Override
    public String toString() {
        return "{ 음식 = " + name +" "+people+"인분 , 가격=" + price +"}";
    }
}



public class FoodExample {

	public static void main(String[] args) {
		Set<Food> set = new HashSet<Food>();
		
		set.add(new Food("김밥",3000,2));
		set.add(new Food("김밥",3000,3));
		set.add(new Food("떡볶이",3000,3));
		
		System.out.println("총 객체 수 :"+set.size());
		
		//Iterator
		Iterator<Food> iterator = set.iterator();
		while(iterator.hasNext()) {
				Food elemet = iterator.next();
				System.out.println("\t" + elemet);
			}
				
			
				
		System.out.println("총 객체 수 :"+set.size());
	
			set.clear();
			if(set.isEmpty()) {System.out.println("비어있음");}
	
	}
}

