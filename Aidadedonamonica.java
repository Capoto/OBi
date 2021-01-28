import java.util.Scanner;

public class Aidadedonamonica{



	public static void main(String[] args){

		Scanner in = new Scanner(System.in);


		int idademonica = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int d;

		d = idademonica - b -c;
	
	if(d>=b && d>=c){				
		System.out.printf("%d\n",d);

}
	else if(c>=b && c>=d){
	
		System.out.printf("%d\n",c);
	
	}

	else{
	
		System.out.printf("%d\n",b);
	
	}




	}





}
