print ("Insert a phrase: ");
String phrase = System.console().readLine();

for (int i=0;i < phrase.length();i++){
	println (phrase.substring(i,i+1));
}

println "";

int first_letter_pos;
boolean new_word = true;
for (int i=0;i < phrase.length();i++){
	if(new_word){
		first_letter_pos = i;
		new_word=false;
	}
	if (phrase.charAt(i) == " " || i == phrase.length() - 1){
		println (phrase.substring(first_letter_pos,i+1));
		new_word = true;
	}
}
	