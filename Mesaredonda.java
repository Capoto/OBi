import java.util.Scanner;


public class Mesaredonda{


	public static void main(String[] args){
	
	
		Scanner in = new Scanner(System.in);
		
		
		// ler o números sorteado para Ana 
		int a = in.nextInt();
		//ler o número sorteado para Beatriz
	        int b = in.nextInt();
		
		//Variavéis que armazena onde Ana e Beatriz vão sentar respectivamente
		int Ana,Beatriz;
	
		//percebi que toda vez que número for divisivél por três Ana sentará na cadeira  0
		if(a%3==0){
			
		Ana = 0;
	
	}
	//caso faltei um número para ser divisivél por três ela sentarána cadeira 2 que fica á esquerda da 0		
	else if((a+1)%3==0){
	
		Ana = 2;
	
	}
	//caso não cumpra nenhuma dessas condições 1
	else{
	
		Ana =1;
	}

	//percebi que toda vez que número for divisivél por três Beatriz sentará na cadeira  0 , caso não esteja ocupada
	if(b%3==0){
	
		Beatriz = 0;
	
	}
	//caso faltei um número para ser divisivél por três ela sentarána cadeira 2 que fica á esquerda da 0 , caso não esteja ocupada
	else if((b+1)%3==0){
	
		Beatriz = 2;
	
	}
	//caso não cumpra nenhuma dessas condições 1 , caso não esteja ocupada
	else{
	
		Beatriz =1;
	}

	//Caso que as duas cadeiras ocupadas são a 2 e 0.	
	if((Ana==0 && Beatriz==2 )|| (Ana==2 && Beatriz==0)){
	
		
		System.out.printf("1\n");
	}
	//Caso que as duas cadeiras ocupadas são a 2 e 1.
	else if((Ana==2 && Beatriz==1)||(Ana==1 && Beatriz==2)){
	
	
		System.out.printf("0\n");
	}
	//Caso que as duas cadeiras ocupadas são a 1 e 0.
	else if((Ana==0 && Beatriz==1)||(Ana==1 && Beatriz==0)){
		System.out.printf("2\n");
	}
	
	//Caso os dois números sorteados forem iguais 
	
	
	//Caso 1 se os dois números sorteados forem 0 
	//Carolina sentará na Cadeira 2
	else if(Ana==Beatriz && Ana ==0){
	
		System.out.printf("2\n");
	
	}
	//Caso 2 se os dois números sorteados forem 1 
	//Carolina sentará na Cadeira 2
	else if(Ana==Beatriz && Ana ==1){
	
		System.out.printf("0\n");
	
	}
	//Caso 3 se os dois números sorteados forem 0 
	//Carolina sentará na Cadeira 1
	else if(Ana==Beatriz && Ana ==2){
	
		System.out.printf("1\n");
	
	}
	
	
	}







}
