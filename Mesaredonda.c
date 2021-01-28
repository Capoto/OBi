#include<stdio.h>
#include<stdlib.h>

int main(){


	int a,b,Ana,Beatriz,Carolina;
	
	scanf("%d%d",&a,&b);
	if(a%3==0){
			
		Ana = 0;
	
	}
	else if((a+1)%3==0){
	
		Ana = 2;
	
	}
	else{
	
		Ana =1;
	}


	if(b%3==0){
	
		Beatriz = 0;
	
	}
	else if((b+1)%3==0){
	
		Beatriz = 2;
	
	}
	else{
	
		Beatriz =1;
	}


	if((Ana==0 && Beatriz==2 )|| (Ana==2 && Beatriz==0)){
	
		
		printf("1\n");
	}
	else if((Ana==2 && Beatriz==1)||(Ana==1 && Beatriz==2)){
	
	
		printf("0\n");
	}
	else if((Ana==0 && Beatriz==1)||(Ana==1 && Beatriz==0)){
		printf("2\n");
	}
	else if(Ana==Beatriz && Ana ==0){
	
		printf("2\n");
	
	}
	else if(Ana==Beatriz && Ana ==1){
	
		printf("0\n");
	
	}

	else if(Ana==Beatriz && Ana ==2){
	
		printf("1\n");
	
	}
return 0;}
