import java.util.Scanner;

public class solucao{




	public static void main(String args[]){
	
		Scanner in = new Scanner(System.in);
		int a  = in.nextInt();
		int i,j,aux,flag=0;
		int vetor[] = new int[a+1];
	
	
		for(i=0;i<a;i++){
		
			vetor[i] = in.nextInt();
		
		}
	
		for(i=0;i<a;i++){
		for(j=i+1;j<a;j++){
			
			
			if(vetor[i]>vetor[j]){
			
				aux = vetor[i];
				vetor[i] = vetor[j];
				vetor[j] = aux;
			
			
			}
		
		}
		
		}
	if(a==1){
	
	
		
			if(vetor[0]>8){
				flag=1;			
				
						
			}
			
		
	
	
	
	}
	
	
		
		for(i=1;i<a;i++){
		
			if(i==1){
		
			if(vetor[0]>8){
				flag=1;			
				break;
					
			}
			
			else if((vetor[i]-vetor[i-1])>8){
			
				flag=1;
				break;
			}
		
		
		}
		else if(i>1){
		
		
		if((vetor[i]-vetor[i-1])>8){
			
			flag=1;
			break;
		
		}
		
	
		
	
	}
		
		
		}
	
	
	
	
	





		if(flag ==1){
		
			System.out.printf("N\n");
		}


		else{
		
		
			System.out.printf("S\n");
		
		}


}

}
