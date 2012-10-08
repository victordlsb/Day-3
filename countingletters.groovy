print ("Insert a phrase: ");
String phrase = System.console().readLine();
print ("Insert a letter to count: ");
String letter = System.console().readLine();

int counter=0;
for (int i=0;i<phrase.length();i++){
	if(phrase.charAt(i) == letter){
		counter++;
	}
}
println ("There are " + counter + " " + letter + " letters in the phrase.");
	