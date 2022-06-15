public class Musharruf_ThreadWelcome{
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		t1.start();
	}
}

class Thread1 extends Thread{
	public void run() {
		try {
			Thread.sleep(300);
			System.out.print("Welcome ");
			Thread2 t2 = new Thread2();
			t2.start();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}

class Thread2 extends Thread{
	public void run() {
		try {
			Thread.sleep(300);
			System.out.print("to ");
			Thread3 t3 = new Thread3();
			t3.start();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}

class Thread3 extends Thread{
	public void run() {
		try {
			Thread.sleep(300);
			System.out.print("my ");
			Thread4 t4 = new Thread4();
			t4.start();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}

class Thread4 extends Thread{
	public void run() {
		try {
			Thread.sleep(300);
			System.out.print("Github ");
			Thread5 t5 = new Thread5();
			t5.start();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}

class Thread5 extends Thread{
	public void run() {
		try {
			Thread.sleep(300);
			System.out.print("Repository :) ");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
