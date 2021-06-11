import java.util.Scanner;

public class ScannerTest{
	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int score=in.nextInt();
		if(score==100){
			System.out.println("½±ÀøBMW");
		}else if(score>80 && score<=99){
			System.out.println("½±Àøiphone");
		}else if(score>60 && score<=80){
			System.out.println("½±Àøipad");
		}else{
			System.out.println("Ã»ÓÐ½±Àø");
		}
		
	}
	
}