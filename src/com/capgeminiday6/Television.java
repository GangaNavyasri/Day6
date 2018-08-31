package com.capgeminiday6;

import java.util.Objects;

public class Television {
	String Company;
	String Type;
	boolean enable3D;
	int Price;

	public Television() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Television(String company, String type, boolean enable3d, int price) {
		super();
		Company = company;
		Type = type;
		enable3D = enable3d;
		Price = price;
	}

@Override
public String toString() {
	return "Television[Company="+Company+", Type="+Type+",Enabled3D="+enable3D+",Price= "+Price+"]";
}

@Override
public int hashCode() {
	return Objects.hash(Company, Type, enable3D, Price);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Television t2 = (Television) obj;
	return this.Company==t2.Company && this.enable3D==t2.enable3D && this.Price==t2.Price && this.Type==t2.Type;
}

}
