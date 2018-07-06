package studentPackage;


import java.util.Scanner;

public class Students {

 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  int N=sc.nextInt();//total no. of student
  int ID[]=new int[N];
  float CGPA[]= new float[N];
  String Name[]= new String[N];
  for(int i=0;i<N;i++)
  {
   ID[i]=sc.nextInt();//Store student's id
   Name[i]=sc.next();//store student's name
   CGPA[i]=sc.nextFloat();//store student's cpga
  }
  for (int j = 1; j < N; j++) //sort by id(insertion sort)
  {  
            float key = CGPA[j];  
            String temp=Name[j];
            int t=ID[j];
            int i = j-1;  
            while ( (i > -1) && ( CGPA [i] > key ) ) {  
                CGPA [i+1] = CGPA [i];  
                Name[i+1]=Name[i];
                ID[i+1]=ID[i];
                i--;  
            }  
            CGPA[i+1] = key; 
            Name[i+1]=temp;
            ID[i+1]=t;
        }  
  String temp;
  int t;
  float key;
  for(int i=0;i<N-1;i++)//sort by alphabetically
  {
   if(CGPA[i]==CGPA[i+1])
   {
    
                 if(Name[i+1].compareTo(Name[i])>0)
                 {
                     temp=Name[i+1];
                     Name[i+1]=Name[i];
                     Name[i]=temp;
                     key=CGPA[i+1];
                     CGPA[i+1]=CGPA[i];
                     CGPA[i]=key;
                     t=ID[i+1];
                     ID[i+1]=ID[i];
                     ID[i]=t;          
                 }
             }
   }
  
   for(int i=N-1;i>=0;i--)//output student sort by CGPA but if CGPA is same then sort alphabetically
   {
    System.out.println(ID[i]+" "+Name[i]+" "+CGPA[i]);
   }
  
 }

}