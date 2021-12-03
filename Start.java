package stu_ManApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.student.manage.Student;
import com.student.manage.StudentDao;

public class Start {

	public static void main(String[] args)  throws IOException {
		
		System.out.println("Welcome to  student managerment App");
		BufferedReader br=new  BufferedReader(new InputStreamReader(System.in));
		
		while ( true )
		{
			System.out.println("Press 1 to ADD Student ");
			System.out.println("Press 2 to Delete student");
			System.out.println("press 3 to Display student ");
			System.out.println("press 4 to exit app");
			int c=Integer.parseInt(br.readLine());
			
			if(c==1)
			{
				//add student..
				System.out.println("Enter user name:");
				String name=br.readLine();
				
				
				System.out.println("Enter user phone");
				String phone =br.readLine();
				
				System.out.println("Enter user City");
				String  city= br.readLine();
				
				//create Student object to store student 
				Student st= new Student(name,phone,city);
				
			  	boolean answer =StudentDao.insertStudentToDB(st);
			  	if (answer)
			  	{
			  		System.out.println("Student is added successfully...");
			  	}
			  	else
			  	{
			  		System.out.println("Something went worong try again...");
			  	}
			  			System.out.println(st);
					
			}
			else if(c==2)
			{
				//delete student ..
				
			}
			else if (c==3)
				
			{
				//display student ..
				
			}
			else if(c==4)
			{
				
				//exit
				break;
			
			}
			else
			{
				
			}
			
		}
		System.out.println("Thankyou for using my applicatio.....");
		System.out.println("See you soon .. bye bye");
		
		
		

	}

}
