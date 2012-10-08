print ("Insert a phrase: ");
String phrase = System.console().readLine();
int counter=0;
for (int i=0;i<phrase.length();i++){
	if(phrase.charAt(i) == "e"){
		counter++;
	}
}
println ("There are " + counter + " e letters in the phrase.");
	