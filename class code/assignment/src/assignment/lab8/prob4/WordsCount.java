package assignment.lab8.prob4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class WordsCount {
	
	 public int countWords(List<String> words, char c, char d, int len) {
		 
		 String cc = Character.toString(c);
		 String dd = Character.toString(d);
		 
		 Predicate<String> predicate = (word -> word.contains(cc) && (!word.contains(dd)) && word.length() == len);
		 
		 return (int) words.stream()
				 .filter(predicate)
				 .count();
		 
//		 return words.stream()
//	                .filter(name -> name.length()==len)
//	                .filter(name -> name.contains(String.valueOf(c)))
//	                .filter(name -> !name.contains(String.valueOf(d)))
//	                .collect(Collectors.toList()).size();
	 }


	public static void main(String[] args) {
		  List<String> words = new ArrayList<>();
	        words.add("abc");
	        words.add("bcdf");
	        words.add("def");
	        words.add("cows");
	        words.add("cat");
	        words.add("dog");
	        words.add("abce");
	        words.add("abcf");

	        System.out.println(words);
	        System.out.println("Count of word :"+ new WordsCount().countWords(words,'c','d',4));
	}
}
