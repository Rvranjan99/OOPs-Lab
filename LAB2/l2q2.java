import java.util.Scanner;
import java.util.Arrays;
class l2q2{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int n,x,y;
		int[] a={0};
		do{
			System.out.println("Perform the following methods:");
			System.out.printf(" 1: Intialize\n 2: Insert\n 3: Remove\n");
			System.out.printf(" 4: Display\n 5: Quit\n");
			n=input.nextInt();
			switch(n){
				case 1:
					a=new int[11];
					a[0]=0;
					break;
				case 2:
					if(a[0]<10){
						System.out.println("Enter the number:");
						x=input.nextInt();
						a[0]+=1;
						a[a[0]]=x;
					}
					else{
						System.out.println("Array is Full.");
					}
					break;
				case 3:
					System.out.println("Enter the position:");
					y=input.nextInt();
					for(int i=y;i<a[0];i++){
						a[i]=a[i+1];
					}
					a[0]-=1;
					break;
				case 4:
					for(int i=1;i<=a[0];i++){
						System.out.print(a[i]+" ");
					}
					System.out.println("");
					break;
			}
			
			
		}while(n !=5);
		
	
	}

}