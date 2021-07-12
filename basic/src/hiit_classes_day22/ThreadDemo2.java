package hiit_classes_day22;

import java.util.Date;

public class ThreadDemo2 {
	 public static void main(String[] args) throws Exception{
		VaccinationCenter vc = new VaccinationCenter();
		Thread t = Thread.currentThread();
		t.setName("Afrid");
		System.out.println(new Date());
		System.out.println("before comming to class...");
		Thread Kala = new Thread(new JobToKala(vc),"Kala");
		Kala.start();
		//vc.getToken();
		System.out.println("take class....for 7-9 Golden batch..."+ new Date());
		
	}
}

class JobToKala implements Runnable{
	VaccinationCenter vc;
	public JobToKala(VaccinationCenter vc) {
		this.vc=vc;
	}
	@Override
	public void run() {
	System.out.println("the job given to kala is executed from this method...");
		try {
			vc.getToken();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

class VaccinationCenter{
	
	public void getToken() throws Exception {
		Thread t= Thread.currentThread();
		String name= t.getName();
		System.out.println(name +"..standing in queue for token...");
		Thread.sleep(10000);
		System.out.println("token recieved...."+ new Date());
		
	}
}