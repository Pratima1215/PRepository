package com.sms.client;

import java.util.Scanner;

import com.sms.bean.Student;
import com.sms.dao.impl.StudentDaoImpl;

public class StudentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
StudentDaoImpl daoImpl=new StudentDaoImpl();
		while(true)
		{
System.out.println("`````````````````````````````````````````");
System.out.println("         1)AddStudent                    ");
System.out.println("         2)ViewAllStudents               ");
System.out.println("         3)ViewStudent                   ");
System.out.println("         4)updateStudent                 ");
System.out.println("         5)DeleteStudent                  ");
System.out.println("         6)Exit                          ");
System.out.println("`````````````````````````````````````````");
System.out.println("Enter The Choice ?");
int choice=sc.nextInt();
switch(choice)
{
case 1:
	daoImpl.addStudents();
break;
case 2:
	 Student [] viewRecords=daoImpl.viewAllStudents();
	 System.out.println("SNO\tSNAME\tSADD");
	 for(Student s : viewRecords)
	 {
		 if(s!=null)
		 System.out.println(s.getSno()+"\t"+s.getSname()+"\t"+s.getSadd());
	 }
	break;
case 3:
System.out.println("Enter Student Number :");
int sno=sc.nextInt();
Student s=daoImpl.viewStudent(sno);
System.out.println("SNO\tSNAME\tSADD");
if(s!=null)
	 System.out.println(s.getSno()+"\t"+s.getSname()+"\t"+s.getSadd());
else
	System.out.println("Given Record not found");
break;
case 4: 
	System.out.println("Enter Student Number :");
	int uno=sc.nextInt();
	daoImpl.updateStudent(uno);
	break;
case 5:
	System.out.println("Enter Student Number :");
	int dno=sc.nextInt();
	daoImpl.deleteStudent(dno);
	break;
case 6:
	System.out.println("Thx for using app");
	System.exit(0);
	break;
	default:
		System.out.println("Choose 1 to 5 between");
}//end of switch






	}//end of while
		

	}
}
