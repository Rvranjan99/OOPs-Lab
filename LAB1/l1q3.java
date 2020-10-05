import java.util.Scanner;
class l1q3{
	
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int salary,merit;
		System.out.print("Number of testcase: ");
		int t=input.nextInt();
		for(int i=0;i<t;i++){
			System.out.print("Enter Salary: ");
			salary=input.nextInt();
			System.out.print("Enter Merit: ");
			merit=input.nextInt();
			if(salary>=500 && salary<600){
				System.out.println("Grade c");
			}
			else if(salary>=600 && salary<=649){
				if (merit<10){
					System.out.println("Grade C");
				}
				else{
					System.out.println("Grade B");
				}
				
				
			}
			else if(salary>649 && salary<700){
				System.out.println("Grade B");
			}
			else if(salary>=700 && salary<=799){
				if(merit<20){
					System.out.println("Grade B");
				}
				else{
					System.out.println("Grade A");
				}
			}
			else{
				System.out.println("Grade A");
			}
			
			
		}
		
		
	
	}
}