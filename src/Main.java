import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		
		System.out.println("== 명언 앱 실행 ==");
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int lastId = 1;
			System.out.print("명령어 ) ");
			String cmd = sc.nextLine();
			 
			
			if (cmd.equals("등록")) {
				System.out.print("명언 : ");
				String title = sc.nextLine();
				System.out.print("작가 : ");
				String author = sc.nextLine();
				WiseSaying wiseSaying = new WiseSaying(lastId, title, author);
				wiseSaying.add(wiseSaying);
				System.out.printf("%d번 명언이 등록되었습니다\n", lastId);
				lastId++;
				
				
			
			} else if (cmd.equals("목록")) {
				
				System.out.println("번호  /  작가  /  명언");
				System.out.println("============================");
				for (int i = WiseSaying.size() -1; i >= 0; i--) {
					System.out.printf("%d  /  %s  /  %s  \n", lastId, title, author);
					
					
					
				}		
				sc.close();
			
			}
			
		}
		
		
	}
	
}
class WiseSaying {
	int lastId;
	String title;
	String author;

	private WiseSaying(int lastId, String title, String author) {
		this.lastId = lastId;
		this.title = title;
		this.author = author;
	}

	public int getLastId() {
		return lastId;
	}

	public void setLastId(int lastId) {
		this.lastId = lastId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}


}



