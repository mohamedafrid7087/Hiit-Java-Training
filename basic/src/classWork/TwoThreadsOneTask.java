package classWork;

public class TwoThreadsOneTask {
	public static void main(String[] args) {
		
		Cannon bofors=new Cannon();
		ShootingTask st=new ShootingTask(bofors);
		
		Thread naina=new Thread(st,"naina");
		Thread shabeer=new Thread(st,"shabeer");
		
		naina.start();
		shabeer.start();
	}
}

class ShootingTask implements Runnable{
	Cannon gun;
	public ShootingTask(Cannon gun) {
		this.gun=gun;
	}
	@Override
	public void run() {
		Thread t=Thread.currentThread();
		if(t.getName().equals("naina")) {
			for(int i=0;i<5;i++) {
				gun.fill();
			}
		}
		else if(t.getName().equals("shabeer")) {
			for(int i=0;i<5;i++) {
				gun.shoot();
			}
		}
	}
}
class Cannon{
	
	public void fill() {
		Thread t = Thread.currentThread();
		String name= t.getName();
		System.out.println(name+" fills the gun........");
	}
	
	public void shoot() {
		Thread t= Thread.currentThread();
		String name = t.getName();
		System.out.println(name+" fires the gun.....");
	}
}

