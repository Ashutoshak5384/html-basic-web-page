#include<stdio.h>
int main()
{ 
	float total_amount, transfer, deposit, withdraw, check_balance;
	int pin,password,user_input;
	printf("enter ur password \n ");
	scanf("%d" , &password);
	printf("enter the amount to create account \n");
	scanf("%f", &total_amount);
	printf("enter 1 to check balance \n"
			"enter 2 to deposit money \n"
			"enter 3 to withdraw money \n"
			"enter 4 to transfer money \n");
	scanf("%d", &user_input);
	
	printf("enter pin");
	scanf("%d",&pin);
	if(pin==password)
	{
		switch(user_input)
		{
			case 1:
				{
					printf("ur total balance in ur account is %f ",total_amount);
					break;
				}
				
			case 2:
				{
					printf("enter the amount to deposit \n");
					scanf("%f", &deposit);
					float balance_after_deposit;
					balance_after_deposit = total_amount + deposit;
					printf("total amount after deposit is %f",balance_after_deposit);
					break;
				}
				
			case 3:
				{
					printf("enter the amount to withdraw \n");
					scanf("%f", &withdraw);
					float balance_after_withdraw;
					balance_after_withdraw = total_amount - withdraw;
					printf("total amount after withdraw is %f",balance_after_withdraw);
					break;
				}
			
			case 4:
				{
					printf("enter the amount to transfer \n");
					scanf("%f", &transfer);
					float balance_after_transfer;
					balance_after_transfer = total_amount - transfer;
					printf("total amount after transfer is %f",balance_after_transfer);
					break;
				}
				
			default:
				{
						printf("not valid input \n");
						break;
				}
		}
}
	
				
				
				
				
				
		
	
	
	
}
