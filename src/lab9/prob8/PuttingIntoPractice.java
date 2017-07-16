package lab9.prob8;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PuttingIntoPractice{
    public static void main(String ...args){    
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader samita = new Trader("Samita","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
		
		List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300), 
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),
            new Transaction(samita, 2012, 600),
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
        );	
        
		// Query 1: Find all transactions from year 2011 and sort them by value (small to high).
		System.out.println("Transactions from year 2011:");
		transactions.stream()
				.filter(t -> t.getYear() == 2011)
				.sorted(Comparator.comparing(Transaction::getValue))
				.forEach(System.out::println);;

        
        // Query 2: What are all the unique cities where the traders work?
		System.out.println("Unique cities where the traders work:");
		transactions.stream()
				.map(t -> t.getTrader().getCity())
				.distinct()
				.forEach(System.out::println);;

        // Query 3: Find all traders from Cambridge and sort them by name.
		System.out.println("All traders from Cambridge and sorted by name:");
		transactions.stream()
			.map(t -> t.getTrader())
        	.filter(t -> t.getCity().equalsIgnoreCase("Cambridge"))
        	.sorted(Comparator.comparing(Trader::getName))
        	.forEach(System.out::println);
                        
        // Query 4: Return a string of all traders names sorted alphabetically.
		System.out.println("All traders names sorted alphabetically:");
        transactions.stream()
        	.map(t -> t.getTrader().getName())
        	.sorted()
        	.forEach(System.out::println);

        // Query 5: Are there any trader based in Milan?
        Optional<String> checkMilan = transactions.stream()
        	.map(t -> t.getTrader().getCity())
        	.filter(city -> city.equalsIgnoreCase("Milan"))
    		.findAny();
        System.out.printf("Are there any trader based in Milan? %s%n", checkMilan.isPresent());
   
     // Query 6: Update all transactions so that the traders from Milan are set to Cambridge.
        transactions.stream()
            	.filter(t -> t.getTrader().getCity().equalsIgnoreCase("Milan"))
            	.map(t -> {
            		t.getTrader().setCity("Cambridge");
            		return t;
            	})
        		.forEach(System.out::println);
                     
        // Query 7: What's the highest value in all the transactions?
       IntSummaryStatistics stat = transactions.stream()
    		   .collect(Collectors.summarizingInt(Transaction::getValue));
       int max = stat.getMax();
       System.out.println("The highest value in all the transactions: " + max);
    }
}
