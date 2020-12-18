import java.io.*;
import java.util.Scanner;
class Task11
{
    public static void main(String []args){
    
    {int i,k=0;
      Double j=0.0;
        //Double totmarks,avgmarks;
        System.out.println("Enter the total number of students");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
     System.out.println("Enter the name of sudent");
      String[] name=new String[n];
      System.out.println("Enter the roll no ");
      int[] rollno=new int[n];
      System.out.println("Enter the marks of Maths\t\t Science\t\t English\t\tLanguage\t\t Social studies");
      Double[] maths=new Double[n];
      Double[] Science=new Double[n];
      Double[] English=new Double[n];
      Double[] Language=new Double[n];
      Double[] Social=new Double[n];
      Double[] totmarks=new Double[n];
      Double[] avgmarks=new Double[n];
     // 
     // 
     for(i=0;i<n;i++){
         System.out.println("Enter student:("+(i+1)+")rollno,name,maths,Science,English,Language,Social");
         rollno[i]=scan.nextInt();
         name[i]=scan.next();
         maths[i]=scan.nextDouble();
         Science[i]=scan.nextDouble();
         Language[i]=scan.nextDouble();
         English[i]=scan.nextDouble();
         Social[i]=scan.nextDouble();
         avgmarks[i]=scan.nextDouble();
         totmarks[i]=scan.nextDouble();
         totmarks[i]=(maths[i]+Science[i]+English[i]+Language[i]+Social[i]);
         avgmarks[i]=totmarks[i]/5;
         if( j<totmarks[i]){
             j=totmarks[i];
             k=i;
         }
     }
     System.out.println("The roll number and name of top scorer in class are: "+rollno[i]+" and "+name[i]+" repectively");
    }
}
}
