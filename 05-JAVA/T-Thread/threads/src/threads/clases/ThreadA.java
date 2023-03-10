package threads.clases;

public class ThreadA extends Thread{
	@Override
	public void run() {
		System.out.println("Thread start " + this.getName());
		for (int i = 0; i < 10; i++) {
			
			try {
				ThreadA.sleep(100);
//				cuando esta esto de sleep y solo es un proceso
//				te lo pone como TERMINATED, al parecer es
//				por que Java toma la pausa como una finalización
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		System.out.println("Thread end "+this.getName());
	}

	public ThreadA(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
}
