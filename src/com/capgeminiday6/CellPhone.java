package com.capgeminiday6;

import java.util.Objects;

public class CellPhone {
	String Company;
	String Description;
	String Model;
	String OperatingSystem;
	int Price;

	public CellPhone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CellPhone(String company, String description, String model, String operatingSystem, int price) {
		super();
		Company = company;
		Description = description;
		Model = model;
		OperatingSystem = operatingSystem;
		Price = price;
	}

	public String getCompany() {
		return Company;
	}

	public void setCompany(String company) {
		Company = company;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public String getOperatingSystem() {
		return OperatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		OperatingSystem = operatingSystem;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	@Override
	public String toString() {

		return "CellPhone[company=" + Company + ", Description=" + Description + ", operatingSystem=" + OperatingSystem
				+ "model=" + Model + " Price" + Price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(Company, Description, OperatingSystem, Price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CellPhone cp2 = (CellPhone) obj;
		return this.Company == cp2.Company && this.Description == cp2.Description
				&& this.OperatingSystem == cp2.OperatingSystem && this.Price == cp2.Price;
	}

}
