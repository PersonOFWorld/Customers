package com.javaHomeworks.thread;

public class Dish {

	int index=0;
	int count=0;
	Apple[] apple=new Apple[5];
	
	public synchronized void push(Apple app){
		while(index==apple.length){
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.notify();
		apple[index]=app;
		this.index++;
		this.count++;
	}
	
	public synchronized Apple pop(){
		while(index==0){
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.notify();
		this.index--;
		return apple[index];
	}
}
