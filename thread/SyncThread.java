/**
 * 
 */
package thread;

/**
 * @author logan
 *
 */
class Sync {

	/**
	 * @param args
	 */
		int peopleCount;
		public synchronized void increment() {
			peopleCount++;
		}
		public synchronized void decrement() {
			peopleCount++;
		}
	}
	class SyncThread {
		public static void main(String[] args) throws InterruptedException {
			 Sync obj = new Sync();
			
			Runnable aa = new Runnable() {
				public void run() {
					for(int i=1;i<=1000;i++) {
					obj.increment();
					obj.decrement();
					}
				}
			};
			
			Runnable bb = ()->{
				for(int i=0;i<2000;i++) {
					obj.increment();
					obj.decrement();
				}
			};
			Thread t1 = new Thread(aa);
			Thread t2 = new Thread(aa);
		//	Thread t3 = new Thread(aa);
			t1.start();
			t2.start();
			//t3.start();
			t1.join();
			t2.join();
		//	t3.join();
			System.out.println(obj.peopleCount);
			System.out.println("main thread is completed");
		}

	}
