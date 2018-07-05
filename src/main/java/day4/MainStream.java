package day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class MainStream {
	
	public static void main(String[] args) {
		MainStream p = new MainStream();
		p.start();
	}
	
	private void start() {
		
		// Array
		String[] datas = new String[] {"One", "Two", "Three"};
		Stream<String> stream = Arrays.stream(datas);
		System.out.println("===== Array type =====");
		stream.forEach(System.out::print);
		System.out.println("");
		
		// Collection
		List<String> lists = new ArrayList<>();
		lists.add("One");
		lists.add("Two");
		lists.add("Three");
		System.out.println("===== Collection type =====");
		lists.stream().forEach(System.out::print);
		
		// Filter data start with "T"
		List<String> after = new ArrayList<>();
		for (String string : lists) {
			if (string.startsWith("T")) {
				after.add(string);
			}
		}
		
		// Filter with Stream
		lists.stream()
		.filter(string -> string.startsWith("T"))
		.forEach(System.out::print);
		out.println("\n==========");
		lists.stream()
		.filter(string -> string.startsWith("T"))
		.map(string -> string.toLowerCase())
		.forEach(System.out::print);
		
		// Save output to List
		out.println("\n=======");
		List<String> result =
				lists.stream()
				.filter(string -> string.startsWith("T"))
				.map(string -> string.toLowerCase())
				.collect(Collections.toList());
		result.forEach(System.out::print);
	}
}
