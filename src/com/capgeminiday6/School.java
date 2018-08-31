package com.capgeminiday6;

import java.util.Objects;

public class School {
	String Name;
	String City;
	String District;
	int Ranking;

	public School() {
		super();
		// TODO Auto-generated constructor stub
	}

	public School(String name, String city, String district, int ranking) {
		super();
		Name = name;
		City = city;
		District = district;
		Ranking = ranking;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getDistrict() {
		return District;
	}

	public void setDistrict(String district) {
		District = district;
	}

	public int getRanking() {
		return Ranking;
	}

	public void setRanking(int ranking) {
		Ranking = ranking;
	}

	@Override
	public String toString() {
		return "School[Name=" + Name + ",City=" + City + ",District= " + District + ",Ranking=" + Ranking + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(Name, City, District, Ranking);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		School s2 = (School) obj;
		return this.Name==s2.Name && this.City==s2.City && this.District==s2.District && this.Ranking==s2.Ranking;
	}
	
	
	
}
