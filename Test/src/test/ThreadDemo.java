package test;

public class ThreadDemo {
	Object object;
	int i=30;
	
	public static void main(String[] args) {
		ThreadDemo test=new ThreadDemo();
		test.new MyThread2("thread2").start();
		test.new MyThread1("thread1").start();
		test.new MyThread3("thread3").start();
	}
	
	public synchronized void startData(Object object,String threadName){
		i--;
		System.out.println(threadName+"-ÕýÔÚÖ´ÐÐ-"+i);
	}
	
	class MyThread1 extends Thread{
		String s1;
		public MyThread1(String s) {
			this.s1=s;
		}
		
		@Override
		public void run() {
			for(int i=0;i<10;i++){
				startData(object ,s1);
			}
			
		}
	}
	
	class MyThread2 extends Thread{
		String s2;
		public MyThread2(String s) {
			this.s2=s;
		}
		
		
		@Override
		public void run() {
			for(int i=0;i<10;i++){
				startData(object ,s2);
			}
		}
	}
	
	class MyThread3 extends Thread{
		String s3;
		public MyThread3(String s) {
			this.s3=s;
		}
		
		
		@Override
		public void run() {
			for(int i=0;i<10;i++){
				startData(object ,s3);
			}
		}
	}
	
}
