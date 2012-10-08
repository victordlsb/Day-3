boolean choice_correct = false;
print ("Insert the first number: ")
double num1=Double.parseDouble(System.console().readLine());
print ("Insert the second number: ")
double num2=Double.parseDouble(System.console().readLine());
println ("");
println ("Choose an option");
println ("1- Addition (+)");
println ("2- Substraction (-)");
println ("3- Multiplication (*)");
println ("4- Division (/) \n");
int choice = Integer.parseInt(System.console().readLine());
println ("");

double result=0;

while (!choice_correct){
	switch (choice){
	case 1:
		result = num1+num2;
		println ("The result is: " + result);
		choice_correct=true;
		break;
	case 2:
		result = num1-num2;
		println ("The result is: " + result);
		choice_correct=true;
		break;
	case 3:	
		result = num1*num2;
		println ("The result is: " + result);
		choice_correct=true;
		break;
	case 4:
		result = num1/num2;
		println ("The result is: " + result);
		choice_correct=true;
		break;
	default:
		println ("The option introduced is incorrect, please insert it again: ")
		choice = Integer.parseInt(System.console().readLine());
		break;
	}
}