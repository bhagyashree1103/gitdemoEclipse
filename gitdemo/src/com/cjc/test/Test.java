package com.cjc.test;

import com.cjc.model.Employee;

public class Test {
public static void main(String[] args) {
	Employee e= new Employee();
	e.setId(1001);
	e.setName("bhagyashree");
	System.out.println(e.getId()+e.getName());
}
}
