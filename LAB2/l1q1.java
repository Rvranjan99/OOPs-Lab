import java.lang.Float;
class l1q1{
	
	public static void main(String[] args){
		System.out.println("Gnerated float values:");
		Float a= new Float(args[0]);
		Float b=new Float(args[1]);
		Float c= new Float(args[2]);
		Float d=new Float(args[3]);
		System.out.print(a +" ");
		System.out.print(b +" ");
		System.out.print(c +" ");
		System.out.print(d +" ");
		System.out.println(" ");
		int x,y,z;
		x=Float.compare(a,b);
		float[] arr={a,b,c,d};
		for (int i = 0; i <3; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < 4; j++)
                if (Float.compare(arr[j],arr[min_idx])<0)
                    min_idx = j;
 
            float temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
		
		System.out.println("After Sorting: ");
		for(int i=0;i<4;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
		System.out.println("upto two decimal point:");
		for(int i=0;i<4;i++){
			System.out.printf("%.2f ",arr[i]);
		}
		System.out.println(" ");
		System.out.println("Sum of all floats: ");
		float s;
		s=Float.sum(Float.sum(a,b),Float.sum(c,d));
		System.out.println(s);
	}
}
