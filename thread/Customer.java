package com.javaHomeworks.thread;

public class Customer implements Runnable {

	Dish dish = null;

	Customer(Dish dish) {
		this.dish = dish;
	}

	public void run() {
		while(dish.count<20){
			Apple apple = dish.pop();
			System.out.println(Thread.currentThread().getName() + "吃了" + apple+"   -");
			try {
				if (Thread.currentThread().getName() == "大儿子") {
					Thread.sleep(1000);
				}
				if (Thread.currentThread().getName() == "二儿子") {
					Thread.sleep(2000);
				} else {
					Thread.sleep(3000);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
