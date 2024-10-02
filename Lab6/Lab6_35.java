import java.util.Scanner;
public class Lab6_35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        

        Student_Detail[] sd = new Student_Detail[5];
        for(int i =0 ;i<5;i++){
            sd [i] = new Student_Detail();
        }
       
    } 

}
class Student_Detail{
    int Enrollment_No;
    String Name="";
    int Semester;
    int CPI;
    public Student_Detail(){

        Scanner st = new Scanner(System.in);
        System.out.println("Enter Entrollment_No");
        Enrollment_No = st.nextInt();
        System.out.println("Enter Name");
        Name = st.next();
        System.out.println("Enter Semester");
        Semester = st.nextInt();
        System.out.println("Enter CPI");
        CPI = st.nextInt();
       
        display(Enrollment_No, Name, Semester, CPI);
    }
    public void display(int Enrollment_No,String Name, int Semester,int CPI ){
        System.out.println(Enrollment_No);
        System.out.println(Name);
        System.out.println(Semester);
        System.out.println(CPI);
    }

}