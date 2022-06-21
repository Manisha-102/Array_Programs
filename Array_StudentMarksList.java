package myPack;

import java.util.Scanner;
import java.lang.String;
public class Array_StudentMarksList {
    public void student_grade(){
        int Total_Student=5;
        Scanner sc=new Scanner(System.in);

        //using array for storing value
        int[] rollno=new int[Total_Student];
        String[] name=new String[Total_Student];
        int[] s1=new int[Total_Student];
        int[] s2=new int[Total_Student];
        int[] s3=new int[Total_Student];
        int[] s4=new int[Total_Student];
        int[] s5=new int[Total_Student];
        double[] p=new double[Total_Student];
        char[] g=new char[Total_Student];

        //using for loop for initializing the values
        for (int i=0;i<Total_Student;i++){
            System.out.println("Enter student"+(i+1)+"details");
            System.out.println("Enter roll no:-");
            rollno[i]=sc.nextInt();
            sc.nextLine();

            System.out.println("Enter name:-");
            name[i]=sc.nextLine();

            System.out.println("Enter s1 marks:-");
            s1[i]=sc.nextInt();

            System.out.println("Enter s2 marks:-");
            s2[i]=sc.nextInt();

            System.out.println("Enter s3 marks:-");
            s3[i]=sc.nextInt();

            System.out.println("Enter s4 marks:-");
            s4[i]=sc.nextInt();

            System.out.println("Enter s5 marks:-");
            s5[i]=sc.nextInt();

            //calculate percentage
            p[i]=(((s1[i]+s2[i]+s3[i]+s4[i]+s5[i])*100)/500.0);
            System.out.println("percentage:"+p[i]);

            //find grade
            if(p[i]<40){
                g[i]='D';
            }
            else if(p[i]<60){
                g[i]='C';
            }
            else if(p[i]<80){
                g[i]='B';
            }
            else{
                g[i]='A';
            }
        }

        System.out.println();
        //write details of total student by using for loop
        for (int i=0;i<Total_Student;i++){
            System.out.println(rollno[i]+"\t"+name[i]+"\t"+p[i]+"\t"+g[i]);
        }

    }

    public static void main(String[] args) {
        //create object 
        Array_StudentMarksList obj=new Array_StudentMarksList();
        obj.student_grade();
    }
}
