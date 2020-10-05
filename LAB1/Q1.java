//@author RAVI RANJAN A-56
import java.util.Scanner;
class Q1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n=input.nextInt();
		for(int i=0;i<n;i++){
			int x,y;
			x=input.nextInt();
			y=input.nextInt();
			if(x>0 && y>0){
				System.out.println("Quadrant 1");
			
			}
			else if(x>0 && y<0){
				System.out.println("Quadrant 4");
			
			}
			else if(x<0 && y>0){
				System.out.println("Quadrant 2");
			
			}
			else{
				System.out.println("Quadrant 3");
			}
		
		}
		
	}

}