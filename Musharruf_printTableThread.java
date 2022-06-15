import java.util.Scanner;
public class Musharruf_printTableThread{
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		t1.start();
	}
}
class Thread1 extends Thread{
	public void run() {
		Scanner sc = new Scanner(System.in);
		Thread1 t1 = new Thread1();
		while(true) {
			System.out.println("\nEnter which table you want :");
			int n = sc.nextInt();
			if(n==0) {
				break;
			}
			else if(n!=0) {
				t1.printTable(n);
			}
		}
	}
	
	public void printTable(int val) {
		try {
			for(int j=1 ; j<=10 ; j++) {
				Thread.sleep(300);
				System.out.println( val + " * " + j + " = " + val*j );
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
