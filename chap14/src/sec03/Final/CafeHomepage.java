package sec03.Final;

import java.util.*;
import java.io.*;


class MainService {
    private List<Product> list = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private int counter;

    // 메뉴바
    public void showMemu() {
        while (true) {
            System.out.println("------------------------------------------------");
            System.out.println("1. 상품등록 | 2. 상품목록 | 3. 상품수정/삭제 | 4. 파일저장 | 5. 종료");
            System.out.println("------------------------------------------------");

            System.out.print("선택: ");
            String selectNo = scanner.nextLine();
            switch (selectNo) {
                case "1": registerProducts(); break;
                case "2": showProducts(); break;
                case "3": modifyOrDeleteProducts(); break;
                case "4": saveFile(); break;
                case "5": return;
            }
        }
    }

    // 1. 상품 등록
    public void registerProducts() {
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
            System.out.println("상품이 등록되었습니다!");
        } catch (Exception e) {
            System.out.println("등록 에러: " + e.getMessage());
        }
    }

    // 2. 상품 목록 출력
    public void showProducts() {
        if (list.isEmpty()) {
            System.out.println("등록된 상품이 없습니다.");
        } else {
            System.out.println("상품 목록:");
            for (Product product : list) {
                System.out.println("상품명: "+product.getName());
            }
            System.out.println("상세보기를 하시겠습니까?  Y | N");
            System.out.print("선택: ");
            String subMenu = scanner.nextLine();
            switch (subMenu) {
            	case"y":
            	case "Y": showDetail(); break;
            	case "n":
            	case "N": System.out.println("메인메뉴로 돌아갑니다.");break;
            	default: System.out.println("잘못된 선택입니다."); break;
        }
        }
    }
    public void showDetail() {
    	System.out.println("------------------------------");
    	System.out.println("상세 보기:");
      	for (Product product : list) {
      		System.out.println("상품명: "+product.getName());
      		System.out.println("가격: "+product.getPrice());
      		System.out.println("재고: "+product.getStock());
      		System.out.println("상품명: "+product.getName());
      		}
                    
    }

    
    // 3. 상품 수정/삭제 메뉴
    public void modifyOrDeleteProducts() {
        System.out.println("1. 상품 수정 | 2. 상품 삭제");
        System.out.print("선택: ");
        String subMenu = scanner.nextLine();

        switch (subMenu) {
            case "1": updateProducts(); break;
            case "2": deleteProducts(); break;
            default: System.out.println("잘못된 선택입니다."); break;
        }
    }

    // 3-1. 상품 수정
    public void updateProducts() {
        System.out.print("수정할 상품 번호 입력: ");
        int pno = Integer.parseInt(scanner.nextLine());
        for (Product product : list) {
            if (product.getPno() == pno) {
                System.out.print("새 상품명: ");
                product.setName(scanner.nextLine());

                System.out.print("새 가격: ");
                product.setPrice(Integer.parseInt(scanner.nextLine()));

                System.out.print("새 재고: ");
                product.setStock(Integer.parseInt(scanner.nextLine()));

                System.out.println("상품이 수정되었습니다.");
                return;
            }
        }
        System.out.println("해당 상품 번호를 찾을 수 없습니다.");
    }

    // 3-2. 상품 삭제
    public void deleteProducts() {
        System.out.print("삭제할 상품 번호 입력: ");
        int pno = Integer.parseInt(scanner.nextLine());
        Iterator<Product> iterator = list.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getPno() == pno) {
                iterator.remove();
                System.out.println("상품이 삭제되었습니다.");
                return;
            }
        }
        System.out.println("해당 상품 번호를 찾을 수 없습니다.");
    }

 // 4. 파일 저장
    public void saveFile() {
        System.out.print("저장할 파일 이름 입력 (예: products.txt): ");
        String fileName = scanner.nextLine();
        File file = new File(fileName); // File 객체 생성

        try {
            // 파일이 존재하지 않으면 새로 생성
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("새 파일이 생성되었습니다: " + file.getAbsolutePath());
            }

            // BufferedWriter를 사용해 파일에 쓰기
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                for (Product product : list) {
                    writer.write(product.toString());
                    writer.newLine();
                }
                System.out.println("상품 목록이 파일에 저장되었습니다: " + file.getAbsolutePath());
            }
        } catch (IOException e) {
            System.out.println("파일 저장 중 오류가 발생했습니다: " + e.getMessage());
        }
    }
}

public class CafeHomepage {
	public static void main(String[] args) throws Exception{
		MainService mainservice = new MainService();
		mainservice.showMemu();
	}

}
