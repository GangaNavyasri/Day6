package com.capgeminiday6.tests;

import java.util.HashSet;

import org.junit.jupiter.api.Test;

import com.capgeminiday6.Car;
import com.capgeminiday6.CellPhone;
import com.capgeminiday6.Laptop;
import com.capgeminiday6.School;
import com.capgeminiday6.Television;

class HashSetTest {

	@Test
	void testLaptop() {

		HashSet<Laptop> lappy = new HashSet<>();
		lappy.add(new Laptop("Lenovo", "windows", "i3", "Ln45"));
		lappy.add(new Laptop("Apple", "ios", "i4", "IOS34"));
		lappy.add(new Laptop("Lenovo", "windows", "i3", "Ln45"));
		for (Laptop l : lappy) {
			System.out.println(l);
		}

	}

	@Test
	void testCar() {
		HashSet<Car> car = new HashSet<>();
		car.add(new Car("BMW", "BM218", 2000, 30000));
		car.add(new Car("BMW", "BM218", 2000, 30000));
		car.add(new Car("TATA", "nano", 2008, 22000));

		for (Car c : car) {
			System.out.println(c);
		}

	}

	@Test
	void testTelevision() {
		HashSet<Television> tv = new HashSet<>();
		tv.add(new Television("Sony", "LCD", true, 10000));
		tv.add(new Television("Sony", "LCD", true, 10000));
		tv.add(new Television("LG", "LED", true, 23000));

		for (Television t : tv) {
			System.out.println(t);
		}
	}

	@Test
	void testCellPhone() {
      
	HashSet<CellPhone> cell=new HashSet<>();
	 cell.add(new CellPhone("Redmi", "12Mpcam,3000MAh", "note5", "Andriod", 15000));
	 cell.add(new CellPhone("Redmi", "12Mpcam,3000MAh", "note5", "Andriod", 15000));
	 cell.add(new CellPhone("LAVA", "5Mpcam,2000MAh", "XL", "Andriod", 8000));

	for(CellPhone cp: cell) {
		System.out.println(cp);
		
	}
	
	}

	@Test
	void testSchool() {
      
	HashSet<School> school=new HashSet<>();
	 school.add(new School("Blue bells","gachibowli","Hyderabad",3));
	 school.add(new School("Blue bells","gachibowli","Hyderabad",3));
	 school.add(new School("Geeta school","madhapur","nizamaabad",2));


	for(School s: school) {
		System.out.println(s);
		
}
	}
}

