package com.hari.main;

import java.util.Scanner;

import com.hari.model.Employee;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int ch;
String dept="";
String email="";
Employee emp=new Employee("hari","priya");
Scanner sc=new Scanner(System.in);
System.out.println("please enter the Department of the fallowing");
System.out.println("1.technical\n2.admin\n3.hr\n4.legal");
System.out.println("enter your choice:");
ch=sc.nextInt();
switch(ch)
{
case 1:dept="technical";break;
case 2:dept="admin";break;
case 3:dept="hr";break;
case 4:dept="legal";break;

}
Credential cr=new Credential();
email=cr.generateEmailAddress(emp,dept);
cr.showCredentials(emp,email);
	}
	}



