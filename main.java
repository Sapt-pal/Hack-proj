import java.util.*;
class stdmarks{

              public static void main (String args[]){
              
              
                  System.out.println("Enter the name of the student: ");        
                  Scanner sc =new Scanner(System.in);        
                  String name =sc.nextLine();
                  System.out.println("Enter the section of the student: ");
                  char section=sc.next().charAt(0);
                  System.out.println("Enter roll no of the student: ");
                  Scanner input=new Scanner(System.in);
                  String roll=input.nextLine();
                  System.out.println("Enter the age of the student: ");
                  int age=sc.nextInt();
                  int marks[];
                  int t=0;
                  marks=new int[10];
                  /*marks[0]=mathematics,marks[1]=physics;marks[2]=chemistry;marks[3]=english,marks[4]=biology;marks[5]=environmental sciences,*/
                  for(int i=0;i<6;i++){
                     System.out.println("Enter the marks for subject with code: "+i);
                      marks[i]=sc.nextInt();
                     
                  }
                System.out.println("Enter the grade of the student: ");
                char grade=sc.next().charAt(0);
                System.out.println("Enter the remarks pass or fail: ");
                Scanner in1=new Scanner (System.in);
                String remarks=in1.nextLine(); 
                
                
                System.out.println("************************************************************************************");
                System.out.println("***************************MARKSHEET*******************************");
                System.out.println("************************************************************************************");
                System.out.println("Name: "+name); 
                System.out.println("Section: "+section);
                System.out.println("Roll No: "+roll);
                System.out.println("Age: "+age);
                System.out.println("Marks in Mathematics  :: "+marks[0]);
                System.out.println("Marks in Physics  :: "+marks[1]);
                System.out.println("Marks in Chemistry  :: "+marks[2]);
                System.out.println("Marks in English  :: "+marks[3]);
                System.out.println("Marks in Biology  :: "+marks[4]);     
                System.out.println("Marks in Environmental Sciences  :: "+marks[5]);
                System.out.println("Grade  :: "+grade);
                System.out.println("Remarks  :: "+remarks);
                System.out.println("************************************************************************************"); 
                System.out.println("********END*********");  
              }
  
  
  
}
                 
