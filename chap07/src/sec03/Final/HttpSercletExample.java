package sec03.Final;

public class HttpSercletExample {

	public static void main(String[] args) {
		method(new LonginServlet()); // 로그인 합니다.
		method(new FileDownloadServlet()); // 파일 다운로드 합니다.
	}
	
	public static void method(HttpServlet servlet) {
		servlet.service();
	}

}
