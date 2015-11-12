package src.Algorithms2;

import java.util.Vector;

public class VectorSynTest_安全 {
	private static Vector<Integer> vector = new Vector<Integer>();
	public static void main(String[] args){
		while(true)
		{
			for(int i = 0;i<10;i++){
				vector.add(i);
				System.out.println("********************");
			}
			Thread removeThread = new Thread(new Runnable()
			{
				@Override
				public void run() {
					synchronized (vector) {
						for(int i = 0;i<vector.size();i++){
							vector.remove(i);
						}
					}
				}
			});
			Thread printThread = new Thread(new Runnable() {
				@Override
				public void run() {
					synchronized (vector) {
						for(int i = 0;i<vector.size();i++){
							try{
								System.out.println((vector.get(i)));
							}catch(Exception e){
								System.exit(0);
								System.out.println(e);
							}
						}
					}
				}
			});
			removeThread.start();
			printThread.start();
//			System.out.println("active threads = "+Thread.activeCount());
//			if(Thread.activeCount() >100){
//				System.exit(0);
//			}
			while(Thread.activeCount() > 20);
		}
	}
}































