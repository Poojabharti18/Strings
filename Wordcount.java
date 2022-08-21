package stringconcept;
import java.util.Scanner;

public class Wordcount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Sentence");
		String Sentence=sc.nextLine();
	
		String word[]=Sentence.split(" ");
		int count=word.length;
		System.out.println("The word count=:"+count);
		sc.close();
	}
}

		
		