import java.util.Scanner;

class reverse {
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
    	
        System.out.print("Enter the Number: ");
        int n = input.nextInt();
        int rev=0,rem=0;
        while(n>0){
            rem=n%10;
            rev=(rev*10)+rem;
            n=n/10;
        }
        
        System.out.println("reverse of the given number=" + rev);

        
        input.close();
    }
}