package stringconcept;
import java.util.Arrays;

public class Stringexample {

	public static void main(String[] args) {
	String s="Hello World";
	char a[]=s.toCharArray();
	System.out.println(Arrays.toString(a));
	String s1="Java is Object oriented";
	String word[]=s1.split("");
	for(int i=0;i<word.length;i++)
	{
		System.out.println(word[i]);
	}
	//for each loop
	for(String temp:word)
	{
		System.out.print(temp);
	}
	System.out.print("");
	
	System.out.println(s.startsWith("H"));
	System.out.println(s.endsWith("d"));

	

}



	}


