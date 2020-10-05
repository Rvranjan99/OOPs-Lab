import java.util.Scanner;

class fibonacci {
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
    	
        System.out.print("Enter the Number: ");
        int n = input.nextInt();
        int a=0,b=1,c;
        System.out.println(a);
        System.out.println(b);
       
        for(int i=2;i<n;i++){
            
            c=a+b;
            a=b;
            b=c;
            
            System.out.println(c);
            
        }
       
        input.close();
    }
}

