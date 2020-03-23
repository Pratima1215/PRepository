package com.sms.dao.impl;

import java.util.Scanner;

import com.sms.bean.Student;

public class StudentDaoImpl {
Scanner sc=new Scanner(System.in);
Student addStudents[]=new Student[3];	
public	void addStudents()
	{
		for(int i=0;i<addStudents.length;i++)
		{
System.out.println("Enter The Student Number :");
int sno=sc.nextInt();
System.out.println("Enter Studnet Name :");
String sname=sc.next();
System.out.println("Enter Student Address");
String sadd=sc.next();
Student sb=new Student(sno,sname,sadd);
addStudents[i]=sb;
		System.out.println("Student Record Success Fully");
		}//end for loop
		
	}//end of students
	
public Student [] viewAllStudents()
{
	return addStudents;
}

public Student viewStudent(int sno)
{
	for(Student sb :  addStudents)
	{
		if(sb.getSno()==sno)
		{
			return sb;
			
		}
	}
	
	return null;
}

public void updateStudent(int sno)
{
	int k=0;
	for(Student sb :  addStudents)
	{
		if(sb.getSno()==sno)
		{
			k++;
	System.out.println("Do You Want Update 1)SName 2)Sadd");
	int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter Student Name :");
			String name=sc.next();
		sb.setSname(name);
		System.out.println("Student Name Updated Success fully");
		break;
		case 2:
			System.out.println("Enter Student Address :");
			String add=sc.next();
		sb.setSadd(add);
		System.out.println("Student address Updated Success fully");
		break;
		}//end of switch
		
		}//end of if
	}//end of while
	
	if(k==0)
		System.out.println("Given Record not found");
	}

public void deleteStudent(int dno)
{
	int i=0;
	int k=0;
	for(Student sb :  addStudents)
	{
		if(sb.getSno()==dno)
		{
			k++;
			addStudents[i]=null;
	System.out.println("Student Record deleted success fully");
			i++;
		}
		else
		{
			addStudents[i]=sb;
i++;
		}
	}
	
	
	if(k==0)
		System.out.println("Given Record not found");
}
	
	
	
	
	




}
	
	
	

