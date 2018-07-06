package studentPackage;

import java.util.*;
import studentPackage.Sorting;

public class Student  {
 
	private int id;
	private String Name;
	private double CGPA;
	
	
	
	public Student(int id, String Name, double CGPA)
	{
		super();
		this.id = id;
		this.Name = Name;
		this.CGPA = CGPA;
	}
	
	public int GetId()
	{
	   return id;	
	}
		
	public String GetName()
	{
		return Name;
	}
	
	public double GetCGPA()
	{
		return CGPA;
	}
	}



	

