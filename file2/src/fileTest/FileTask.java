package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTask {
//	public static void main (String[] args) {
//		생선 종류를 출력한 뒤
//		입력받은 내용을 모두 출력한다.
//		현재 경로에 fish.txt 이름의 파일로 생성한다.
//		생선은 3개 출력한다.
		
		 public static void main(String[] args) throws IOException {
//			 BufferedWriter fishKind = new BufferedWriter(new FileWriter("fish.txt"));
//			 
//			 fishKind.write("고등어");
//			 fishKind.newLine();
//			 fishKind.write("갈치");
//			 fishKind.newLine();
//			 fishKind.write("조기");
//			 fishKind.newLine();
//			 
//			 fishKind.close();
			 
		      BufferedReader fishKind = null;
		      String line = null;
		      try {
		    	  fishKind = new BufferedReader(new FileReader("fish.txt"));
		         
		         while((line = fishKind.readLine()) != null) {
		            System.out.println(line);
		         }
		      } catch (FileNotFoundException e) {
		         System.out.println("존재하지 않는 파일입니다.");
		      }
		      fishKind.close();
			 
			 
			 
		   }
	
		
		
	}
