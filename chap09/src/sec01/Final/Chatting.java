package sec01.Final;

public class Chatting {
	void startChat(String chatId) {
		String nickName = chatId;
		// 메서드 안의 값
		// 로컬 클래스에서 사용하는 변수는 final이어야함
		class Chat{//로컬 클래스
			public void start() {
				while(true) {
					String inputData = "안녕하세여";
					String message = "[" +nickName+ "]"+inputData; 
					
					
					sendMessage(message);
				}
			}	
			void sendMessage(String message) {}
		}
		Chat chat = new Chat();
		chat.start();	
	}
}
