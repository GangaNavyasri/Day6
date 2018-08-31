package com.capgeminiday6;

import java.util.Objects;

public class Laptop {
	String Company;
	String OperatingSystem;
	String Processor;
	String Model;

	public Laptop() {
		super();
	}

	public Laptop(String company, String operatingSystem, String processor, String model) {
		super();
		Company = company;
		OperatingSystem = operatingSystem;
		Processor = processor;
		Model = model;
	}

	public String getCompany() {
		return Company;
	}

	public void setCompany(String company) {
		Company = company;
	}

	public String getOperatingSystem() {
		return OperatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		OperatingSystem = operatingSystem;
	}

	public String getProcessor() {
		return Processor;
	}

	public void setProcessor(String processor) {
		Processor = processor;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	@Override
	public String toString() {
		return "Laptop [company=" + Company + ", model=" + Model + ", operatingSystem=" + OperatingSystem
				+ ", processor=" + Processor + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		Laptop l2 = (Laptop) obj;
		return this.Company == l2.Company && this.Model == l2.Model && this.OperatingSystem == l2.OperatingSystem
				&& this.Processor == l2.Processor;
	}
	@Override
	public int hashCode() {
		return(Objects.hash(Company,Model,OperatingSystem,Processor));
	}
	//@Override
	public int compareTo(Laptop l2) {
		int result=this.Company.compareTo(l2.Company);
		if(result==0)
			return this.Model.compareTo(l2.Model);
		return result;
	}
}
