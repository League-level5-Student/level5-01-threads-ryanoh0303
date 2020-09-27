package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Worker implements Runnable {
	ConcurrentLinkedQueue<Task> taskQueue;

	@Override
	public void run() {
		while(taskQueue.isEmpty()!=true) {
			Task task  = taskQueue.remove();
			task.perform();
		}
		
	}
	
	public Worker(ConcurrentLinkedQueue<Task> taskQueue) {
		this.taskQueue = taskQueue;
	}
	


}
