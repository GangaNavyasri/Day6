package com.capgeminiday6.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.TreeSet;

import org.junit.jupiter.api.Test;

import com.capgeminiday6.Car;


class CarTest {

	@Test
	void testCar() {
		
		TreeSet<Car> car=new TreeSet<Car>();
		assertEquals(true, car.add(new Car("tata","nano",2005,300000)));
		assertEquals(true, car.add(new Car("bmw","x5",2006,1000000)));
		assertEquals(true, car.add(new Car("hyundai","santro",2009,700000)));
		
for( Car c:car) {
	System.out.println(c);
}
		
	}

}
