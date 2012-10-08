print ("Insert a phrase: ");
String phrase = System.console().readLine();
print (phrase);
for (int i=phrase.length()-1;i>=0;i--){
	print (phrase.substring(i,i+1));
}