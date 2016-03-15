package com.javaHomeworks.thread;

public class Test {

	public static void test() {
		Dish dish=new Dish();
		//实例化对象
		Producer producer=new Producer(dish);
		Customer customer=new Customer(dish);
		//创建线程
		Thread dad=new Thread(producer, "爸爸");
		Thread mama=new Thread(producer, "妈妈");
		
		Thread son1=new Thread(customer, "大儿子");
		Thread son2=new Thread(customer, "二儿子");
		Thread son3=new Thread(customer, "小儿子");
		//设置权限
		dad.setPriority(9);
		mama.setPriority(10);
		
		son1.setPriority(8);
		son2.setPriority(9);
		son3.setPriority(10);
		
		//启动线程
		mama.start();
		dad.start();
		son1.start();
		son2.start();
		son3.start();
	}
	public static void main(String[] args) {
		test();
	}
}
