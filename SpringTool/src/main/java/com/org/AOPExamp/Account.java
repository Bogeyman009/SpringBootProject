package com.org.AOPExamp;

public class Account {
private String name;
private String code;

public Account() {
	super();
	// TODO Auto-generated constructor stub
}
public Account(String name, String code) {
	super();
	this.name = name;
	this.code = code;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCode() {
	return code;
}
public void setCode(String code) {
	this.code = code;
}
@Override
public String toString() {
	return "Account [name=" + name + ", code=" + code + "]";
}

}
