print ("Insert a phrase: ");
String phrase = System.console().readLine();
boolean palindrome = true;

for(int i=0;i<phrase.length()/2;i++){
	if(phrase.charAt(i) != phrase.charAt(phrase.length()-1-i))
	{	
		palindrome = false;
		break;
	}
}

if (palindrome){
	println ("The phrase is a palindrome");
}else{
	println ("The phrase is NOT a palindrome");
}
//End