import java.util.*;
class stdmarks{
              public static void main (){
                  System.out.println("Enter the name of the student");        
                  Scanner sc =new Scanner(System.in);        
                  String name =sc.nextLine();
                  System.out.println("Enter the section of the student");
                  char section=sc.next().charAt(0);
                  Scanner sc1 =new Scanner(System.in); 
                  System.out.println("Enter roll no of the student");
                  String roll=sc1.nextLine();
                  System.out.println("Enter the age of the student");
                  int age=sc.nextInt();
                  int marks[]=new int[10];
                  int total=0;String grade="";String remarks="";
                  /*marks[0]=mathematics,marks[1]=physics;marks[2]=chemistry;marks[3]=english,marks[4]=biology;marks[5]=environmental sciences,*/
                  for(int i=0;i<6;i++){
                     System.out.println("Enter the marks for subject with code 0"+(i+1));
                      marks[i]=sc.nextInt();
                     
                  }
                for(int i=0;i<6;i++)
                {
                    total+=marks[i];
                }
                double percentage=total/6.0;
                if(percentage<35.0)
                {
                    grade="F";
                    remarks="Fail";
                }
                else if(percentage>=35.0&&percentage<50.0)
                {
                    grade="E";
                    remarks="Pass";
                }
                else if(percentage>=50.0&&percentage<60.0)
                {
                    grade="D";
                    remarks="Pass";
                }
                else if(percentage>=60.0&&percentage<70.0)
                {
                    grade="C";
                    remarks="Pass";
                }
                else if(percentage>=70.0&&percentage<80.0)
                {
                    grade="B";
                    remarks="Pass";
                }
                else if(percentage>=80.0&&percentage<90.0)
                {
                    grade="A";
                    remarks="Pass";
                }
                else if(percentage>=90.0)
                {
                    grade="EX";
                    remarks="Pass";
                }
                System.out.println("************************************************************************************");
                System.out.println("***************************MARKSHEET*******************************");
                System.out.println("************************************************************************************");
                System.out.println("Name:"+name); 
                System.out.println("Section:"+section);
                System.out.println("Roll No:"+roll);
                System.out.println("Age:"+age);
                System.out.println("Marks in Mathematics :"+marks[0]);
                System.out.println("Marks in Physics :"+marks[1]);
                System.out.println("Marks in Chemistry:"+marks[2]);
                System.out.println("Marks in English :"+marks[3]);
                System.out.println("Marks in Biology :"+marks[4]);     
                System.out.println("Marks in Environmental Sciences :"+marks[5]);
                System.out.println("Grade:"+grade);
                System.out.println("Remarks :"+remarks);
                System.out.println("************************************************************************************"); 
                System.out.println("********END*********"); 
  }
}
                 
