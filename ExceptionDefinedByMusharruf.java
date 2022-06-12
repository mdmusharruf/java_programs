package musharruf;
import java.util.Scanner;

public class ExceptionDefinedByMusharruf {

	public static void main(String[] args) {
		
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter your age :");
			
			int age = sc.nextInt();
			
			if(age<18) {
				throw new MusharrufException();
			}
			else if (age>18) {
				throw new MusharrufException("you are eligible to vote");
			}
			
		}
		
		catch (MusharrufException me) {
			System.out.println(me.getMessage());
		}
		
	}

}

class MusharrufException extends Exception{
	
	MusharrufException(){
		super("MusharrufException : You are under 18");
	}
	
	MusharrufException(String str){
		super(str);
	}
	
}
