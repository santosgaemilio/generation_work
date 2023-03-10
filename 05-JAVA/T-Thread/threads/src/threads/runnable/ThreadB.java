package threads.runnable;

import java.util.Iterator;

public class ThreadB implements Runnable{
	private String name;
	@Override
	public void run() {
		System.out.println("Inicio del Thread "+getName());
		for (int i = 0; i < 10; i++) {
			System.out.println(i + " " +getName());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Final del Thread "+getName());
		
	}
	public ThreadB(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}

}
