package com.capgeminiday6.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.capgeminiday6.Car;
import com.capgeminiday6.CellPhone;
import com.capgeminiday6.Laptop;
import com.capgeminiday6.School;
import com.capgeminiday6.Television;

class CollectionTest {

	@Test
	void testCar() {
		ArrayList<Car> car = new ArrayList<Car>();
		assertEquals(true, car.add(new Car("BMW", "BM218", 2000, 30000)));
		assertEquals(true, car.add(new Car("TATA", "nano", 2008, 22000)));
		assertEquals(true, car.add(new Car("INNOVA", "IN543", 2002, 35000)));
        assertEquals(3,car.size());


	}

	@Test

	void testCellphone() {
		ArrayList<CellPhone> cell = new ArrayList<CellPhone>();
		assertEquals(true, cell.add(new CellPhone("Redmi", "12Mpcam,3000MAh", "note5", "Andriod", 15000)));
		assertEquals(true, cell.add(new CellPhone("LAVA", "5Mpcam,2000MAh", "XL", "Windows", 8000)));
		assertEquals(true, cell.add(new CellPhone("Moto", "14Mpcam,3200MAh", "G5plus", "ios", 20000)));
        assertEquals(3,cell.size());

	}

	@Test
	void testLaptop() {
		ArrayList<Laptop> lappy = new ArrayList<Laptop>();
		assertEquals(true, lappy.add(new Laptop("Lenovo", "windows", "i3", "Ln45")));
		assertEquals(true, lappy.add(new Laptop("Apple", "ios", "i5", "IOS34")));
		assertEquals(true, lappy.add(new Laptop("Dell", "windows", "i4", "D4S6")));
        assertEquals(3,lappy.size());
	}

	@Test
	void testTelevision() {
		ArrayList<Television> Tv = new ArrayList<Television>();
		assertEquals(true, Tv.add(new Television("Sony", "LCD", true, 10000)));
		assertEquals(true, Tv.add(new Television("LG", "LED", false, 20000)));
		assertEquals(true,Tv.add(new Television("Samsung","Plasma",true,25000)));
        assertEquals(3,Tv.size());

	}
	@Test
	void testSchool() {
		ArrayList<School> school=new ArrayList<School>();
		assertEquals(true,school.add(new School("Blue bells","gachibowli","Hyderabad",3)));
		assertEquals(true,school.add(new School("Geeta school","Madhapur","nizamabad",2)));
		assertEquals(true,school.add(new School("Little Flower","kukatpally","Zaheerabad",4)));
        assertEquals(3,school.size());


	}
}
