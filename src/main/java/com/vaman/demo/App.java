package com.vaman.demo;

import com.vaman.demo.app.Calc;

public class App {
	public static void main(String[] args) {

		System.out.println("Hello World!");

		Calc calc = new Calc();
		int sum = calc.addNums(10, 20);
		System.out.println(sum);

	}
}
