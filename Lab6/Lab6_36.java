
import java.util.Scanner;
public class Lab6_36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TemperatureConvert T1 = new TemperatureConvert();
       
    }

}
class TemperatureConvert{
    int Celsius ;
    double Fahrenhit;

    public  TemperatureConvert(){
        Scanner st = new Scanner(System.in);
        Celsius = st.nextInt();

        Fahrenhit = Celsius * (9/5) + 32;
        display(Celsius,Fahrenhit);
    }
    public void display(int Celsius , double Fahrenhit){
        System.out.println( " Celsius = "+Celsius+" TO "+ " Fahrenhit = " + Fahrenhit);
    
    }

}
