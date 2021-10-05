class ThreadObj extends Thread {
	Thread th;
	private String threadName;
	
	ThreadObj(String name) {
		this.threadName = name;
	}
	
    public void run() {
        System.out.println("This code is running in a thread "+threadName);
        try {
        for(int i = 0; i<5; i++) {
        	System.out.println("Thread: "+threadName+"-"+i);
        	Thread.sleep(50);
        }
        }catch(Exception e) {
        	System.out.println("Thread: "+threadName+" interrupted");
        }
        System.out.println("Thread " + threadName+" exiting...");
    }
    
    public void start() {
    	System.out.println("Starting Thread: "+threadName);
    	if(th==null) {
    		th = new Thread(this, threadName);
    		th.start();
    	}
    }
}


class Threading{
	public static void main(String[] args) {
		ThreadObj t1 = new ThreadObj("thread1");
		t1.start();
		ThreadObj t2 = new ThreadObj("thread2");
		t2.start();
	}
}