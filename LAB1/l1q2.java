import java.util.Scanner;
class l1q2{
	
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n=input.nextInt();
		for(int i=0;i<n;i++){
			char s=input.next().charAt(0);
			if(s=='a'|| s=='A'){
				System.out.println("Action movie fan");
			}
			else if(s=='c'|| s=='C'){
				System.out.println("Comedy movie fan");
			}
			else if(s=='d' || s=='D'){
				System.out.println("Drama movie fan");
			}
			else{
				System.out.println("Invalid Input");
			}
			
		}
		
		

		
	}
}