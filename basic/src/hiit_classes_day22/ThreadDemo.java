package hiit_classes_day22;

public class ThreadDemo {
	public static void main(String[] args) throws Exception{
			Thread t = Thread.currentThread();
			t.setName("this is my thread....");
			t.setPriority(10);
			System.out.println("now thread will sleep for 5 second...");
			System.out.println(t);
			vaccinationCenter();
			System.out.println("start the class...");
			for(int i=0;i<5;i++)  {
				System.out.println(i);
				Thread.sleep(5000);

	}
}
	
	static void vaccinationCenter()throws Exception {
		System.out.println("method called...");
		Thread.sleep(5000);
	}
}
