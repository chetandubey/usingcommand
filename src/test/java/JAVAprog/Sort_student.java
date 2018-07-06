package JAVAprog;
 import java.util.Scanner;




public class Sort_student {

	public void Sort()
	{
		
	}
	
	
public static void main(String[] args) {

int IDarray[] = new int[50];
String NameArray[] = new String[50];
double CGPAarray[] = new double[50];
	
//Sort_student s = new Sort_student();
Scanner sc = new Scanner(System.in);  

System.out.println("Enter the no of students");
int noOfstud = sc.nextInt();

String name = "";
int ID=0;
double CGPA = 0.0;


System.out.println("enter the id(Numerical) Name(String) and CGPA(float)");
for(int i=0;i<noOfstud;i++)
{
ID = sc.nextInt();
IDarray[i] = ID;


name =sc.next();
NameArray[i] = name;


CGPA = sc.nextDouble();

CGPAarray[i] = CGPA;
}
// Bubble Sort by CGPA
int iDKEY;
String nAMEKEY;
double cGPAKEY;

for(int j = 0; j< noOfstud-1; j++)
{
	for(int k=0;k<noOfstud-j-1;k++)
	{
		if(CGPAarray[k]<CGPAarray[k+1])
		{
			cGPAKEY = CGPAarray[k];
			CGPAarray[k] = CGPAarray[k+1];
			CGPAarray[k+1] = cGPAKEY;
			
			nAMEKEY = NameArray[k];
			NameArray[k] = NameArray[k+1];
			NameArray[k+1] = nAMEKEY;
			
			iDKEY = IDarray[k];
			IDarray[k] = IDarray[k+1];
			IDarray[k+1] = iDKEY;
			
		}
	}
}
 iDKEY = 0;
 nAMEKEY = "";
 cGPAKEY = 0;
int i ;
// Bubble Sort by Name

for(i=0; i<=noOfstud-1; i++) {

if(CGPAarray[i] == CGPAarray[i+1])
{
	if(NameArray[i].compareTo(NameArray[i+1])>0)
	{

		
		
		nAMEKEY = NameArray[i+1];
		NameArray[i+1] = NameArray[i];
		NameArray[i] = nAMEKEY;
		
		cGPAKEY = CGPAarray[i+1];
		CGPAarray[i+1] = CGPAarray[i];
		CGPAarray[i] = cGPAKEY;
		
		iDKEY = IDarray[i+1];
		IDarray[i+1] = IDarray[i];
		IDarray[i] = iDKEY;
	}
}
}
iDKEY = 0;
nAMEKEY = "";
cGPAKEY = 0;


//bubble sort to add
//for(i=0 ; i<=noOfstud-1;i++)
//{
//	String s1 = NameArray[i];
//	String s2 = NameArray[i+1];
//	int s = (s1.compareTo(s2));
//System.out.println(s);
//	if(s==0)
//	{
//	if(IDarray[i]<IDarray[i+1])
//	{
//		nAMEKEY = NameArray[i+1];
//		NameArray[i+1] = NameArray[i];
//		NameArray[i] = nAMEKEY;
//		
//		cGPAKEY = CGPAarray[i+1];
//		CGPAarray[i+1] = CGPAarray[i];
//		CGPAarray[i] = cGPAKEY;
//		
//		iDKEY = IDarray[i+1];
//		IDarray[i+1] = IDarray[i];
//		IDarray[i] = iDKEY;
//
//	}
//	}
//}




// printing the elements
System.out.println("The Sorted names are");
for(i=noOfstud;i>=0;i++)
{
	System.out.println(IDarray[i]+ " " + NameArray[i] + " "+ CGPAarray[i]);
}

}

}

