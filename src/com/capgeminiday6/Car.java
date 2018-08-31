package com.capgeminiday6;

import java.util.Objects;


public class Car implements Comparable<Car>{
	String Make;
	String Model;
	int Year;
	int Price;

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(String make, String model, int year, int price) {
		super();
		Make = make;
		Model = model;
		Year = year;
		Price = price;
	}

	public String getMake() {
		return Make;
	}

	public void setMake(String make) {
		Make = make;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public int getYear() {
		return Year;
	}

	public void setYear(int year) {
		Year = year;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	@Override
	public String toString() {
		return "Car[Make=" + Make + ", model= " + Model + ", Year= " + Year + ", Price= " + Price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(Make, Model, Year, Price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car c2 = (Car) obj;
		return this.Make==c2.Make && this.Model==c2.Model && this.Year==c2.Year && this.Price==c2.Price;
	}
	@Override
		public int compareTo(Car c2) {
		return this.Make.compareTo(c2.Make);
		}
	
}
