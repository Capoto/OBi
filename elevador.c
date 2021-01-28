#include<stdio.h>
#include<stdlib.h>

int main(){


	int a,i,j,aux,h=1;
	
	
	scanf("%d",&a);

	int vetor[a+1];


	
	
	for(i=0;i<a;i++){
	
	
		scanf("%d",&vetor[i]);
	
	
	}
	
	
	for(i=0;i<a;i++){
	for(j=i+1;j<a;j++){
	
		if(vetor[i]>vetor[j]){
		
			aux = vetor[i];
			vetor[i] = vetor[j];
			vetor[j] =aux;
		
		}
	
	
	}
	
	}
	
	
	if(a==1){
	
	
		
			if(vetor[0]>8){
				h=0;			
				
						
			}
			
		
	
	
	
	}


	for(i=1;i<a;i++){
		
		if(i==1){
		
			if(vetor[0]>8){
				h=0;			
				
					
			}
			
			else if((vetor[i]-vetor[i-1])>8){
			
				h=0;
			
			}
		
		
		}
		else if(i>1){
		
		
		if((vetor[i]-vetor[i-1])>8){
			
			h=0;
		
		
		}
		
	
		
	
	}
	}


	if(h==0){
	
	
		printf("N\n");
	}

	else if(h==1){
	
		printf("S\n");
	}
return 0;}
