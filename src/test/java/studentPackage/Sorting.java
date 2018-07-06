package studentPackage;
 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import studentPackage.Student;

public class Sorting //implements Comparable<Student> 
{

	public static void main(String args[])
	{
		Scanner sn = new Scanner(System.in);
		int Data = Integer.parseInt(sn.nextLine());
	
	List<Student> StudentList = new ArrayList<Student>();
	
	System.out.println("enter the elements");
	while(Data>0)
	{
		int id = sn.nextInt();
		String Name = sn.next();
		double CGPA = sn.nextDouble();
		
		
		Student st = new Student(id, Name, CGPA);
		StudentList.add(st);
		
		
		Data--;
		
	}
	
	 Collections.sort(StudentList , new Comparator<Student>() {
         
          public int compare(Student s1, Student s2) {
               if(s2.GetCGPA()>s1.GetCGPA()){
                   return 1;
               }else if(s2.GetCGPA()<s1.GetCGPA()){
                   return -1;
               }
               return s1.GetName().compareTo(s2.GetName());
           }
   });
	
	 for(Student st: StudentList){
         System.out.println(st.GetName());
      }
	}

	public int compareTo(Sorting arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
