package dsa.array;
import java.util.*;
public class Zoho {

	public static String rearrangeString(String s) {
	        List<Character> order = new ArrayList<>();
	        Map<Character, Integer> counts = new LinkedHashMap<>();

	        // Step 1: Record first occurrence order and count frequencies
	        for (char ch : s.toCharArray()) {
	            if (!counts.containsKey(ch)) {
	                order.add(ch);
	            }
	            counts.put(ch, counts.getOrDefault(ch, 0) + 1);
	        }

	        StringBuilder result = new StringBuilder();
	        boolean remaining = true;

	        // Step 2: Take one occurrence per distinct character in rounds
	        while (remaining) {
	            remaining = false;
	            for (char ch : order) {
	                if (counts.get(ch) > 0) {
	                    result.append(ch);
	                    counts.put(ch, counts.get(ch) - 1);
	                    remaining = true; // Still have characters left to process
	                }
	            }
	        }

	        return result.toString();
	    }

	    public static void main(String[] args) {
	        System.out.println(rearrangeString("cccaabbbcc")); // Output: cabcabcbc
	        System.out.println(rearrangeString("banana"));     // Output: banana
	    }
	}