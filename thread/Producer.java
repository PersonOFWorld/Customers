package com.javaHomeworks.thread;

public class Producer implements Runnable{
	
	Dish dish=null;
	Producer(Dish dish){
		this.dish=dish;
	}
	public void run(){
		while(dish.count<20){
			Apple apple=new Apple();
			dish.push(apple);
			System.out.println(Thread.currentThread().getName()+"削了"+apple+"   +");
		}
	}
}
