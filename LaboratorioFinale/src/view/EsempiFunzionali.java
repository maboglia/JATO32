package view;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EsempiFunzionali {

	public static void main(String[] args) {

		IntStream.range(1, 91).skip(10).filter(n->n%2==0)
		.filter(n->n%3==0)
		.limit(10)
		.forEach(System.out::println);
		
		Stream.of("do", "re", "mi","fa").sorted().forEach(System.out::print);
		
		Arrays.stream(new int[]{22,24,28,26,25,24,30,18}).filter(V->V>20&&V<26).average().ifPresent(System.out::print);;
//		System.out.println(somma);
		
		IntStream voti2 = Arrays.stream(new int[]{22,24,28,26,25,24,30,18}).map(v -> v+1);
		
		voti2.forEach(System.out::println);
		
		try {
			Stream<String> pizzeString = Files.lines(Paths.get("files/pizze.txt"));
			
			pizzeString.filter(s->s.contains("ocaccia")).forEach(System.out::println);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
