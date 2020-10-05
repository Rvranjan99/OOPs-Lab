import java.util.Scanner;

class C2F {
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
    	
        System.out.print("Enter the temperature in celcius: ");
        double C = input.nextDouble();
        float a=9;
        double F=C*(a/5)+32;
        
        System.out.println("Entered temp. in Fahrenheit=" + F);

        
        input.close();
    }
}