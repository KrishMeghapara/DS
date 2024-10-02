import java.util.Scanner;
public class Lab6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee_Detail E1 = new Employee_Detail();
        E1.Employee_Detail();
       
    }

}
class Employee_Detail{
    int Employee_ID;
    String Name="";
    String Designation="";
    int Salary;
    public void Employee_Detail(){
        Scanner st = new Scanner(System.in);
        Employee_ID = st.nextInt();
        Name = st.next();
        
        Salary = st.nextInt();
        Designation = st.next();
        display(Employee_ID, Name, Designation, Salary);
    }
    public void display(int Employee_ID,String Name, String Designation,int Salary ){
        System.out.println(Employee_ID);
        System.out.println(Name);
        System.out.println(Designation);
        System.out.println(Salary);
    }

}