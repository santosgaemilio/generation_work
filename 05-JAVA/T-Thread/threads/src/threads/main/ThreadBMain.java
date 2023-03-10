package threads.main;

import threads.runnable.ThreadB;

public class ThreadBMain {

	public static void main(String[] args) {
		Runnable t2 = new ThreadB("Nana");
		t2.run();
//		Este run no actua como ascincrono, tiene como que importancia
//		Siempre se ejecuta antes que los demás Threads
//		Todo los que tienen el método start actuan en paralelo
		Thread t2S = new Thread(t2);
		t2S.start();
		ThreadB t1 = new ThreadB("Coco");
		Thread st = new Thread(t1);
		st.start();
		
		Thread t3 = new Thread(new ThreadB("Pepe"));
		t3.start();
	}

}
