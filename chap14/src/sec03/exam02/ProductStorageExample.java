package sec03.exam02;

import java.io.*;
import java.util.*;

class Product {
	private int pno;
	private String Title;
	private int price;
	private int stock;
	
	public int getPno() {return pno;}
	public void setPno(int pno) {this.pno = pno;}
	public String getName() {return Title;}
	public void setName(String name) {this.Title = name;}
	public int getPrice() {return price;}
	public void setPrice(int price) {this.price = price;}
	public int getStock() {return stock;}
	public void setStock(int stock) {this.stock = stock;}
}

class ProductStorage{
	private List<Product> list = new ArrayList<>();
	private Scanner scanner = new Scanner(System.in);
	private int counter;
	
	public void showMemu() {
		while(true) {
			System.out.println("------------------------");
			System.out.println("1. 등록 | 2. 목록 | 3. 종료");
			System.out.println("------------------------");
			
			System.out.print("선택: ");
			String selectNo = scanner.nextLine();
			switch(selectNo) {
			case "1": registerProduct(); break;
			case "2": showProducts(); break;
			case "3": return;
			}
		}
	}
	
	public void registerProduct() {
		try {
			Product product = new Product();
			product.setPno(++counter);
			
			System.out.print("상품명: ");
			product.setName(scanner.nextLine());
			
			System.out.print("가격: ");
			product.setPrice(Integer.parseInt(scanner.nextLine()));
			
			System.out.print("재고: ");
			product.setStock(Integer.parseInt(scanner.nextLine()));
			
			list.add(product);
		}catch(Exception e) {
			System.out.println("등록 에러: "+e.getMessage());
		}
	}
	
	public void showProducts(){
		for(Product p : list) {
			System.out.println(p.getPno()+"\t"+p.getName()+"\t"+p.getPrice()+"\t"+p.getStock());
		}
	}
}
//본문
public class ProductStorageExample {
	public static void main(String[] args) throws Exception {
		ProductStorage productStorage = new ProductStorage();
		productStorage.showMemu();
	}
}
