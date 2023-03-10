package threads.main;

import threads.clases.ThreadA;

public class ThreadAMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t  = new ThreadA("Thread 1");
		Thread t1 = new ThreadA("Thread 2");
//		Inicializa el hilo o lo instancia
//		Si haces state aqui te dice que está en new
		t.start();
		t1.start();
		//try {
			//ThreadA.sleep(1000);
//			cuando esta esto de sleep y solo es un proceso
//			te lo pone como TERMINATED, al parecer es
//			por que Java toma la pausa como una finalización
		//} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		//}
//		empieza el thread, el state te va a decir
//		RUNNABLE
		
//		Esto de trycatch con esto no entiendo, creo que le
//		da tiempo para que se ejecute y si no se puede
//		te manda la excepción
		System.out.println(t.getState());
		System.out.println(t1.getState());
	}

}
