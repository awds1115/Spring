package com.human.exercise;

import java.util.ArrayList;

public interface iEmp {
	ArrayList<Employee> getEmpList();
	ArrayList<iCountry> getCntList();
	ArrayList<Employee> getDpList();
	void addMenu(String name,int price);
	void addRoom(String name, int type, int howmany, int howmuch);
	void insertType(int code, String name);
	ArrayList<Employee> getRmList();
	}
