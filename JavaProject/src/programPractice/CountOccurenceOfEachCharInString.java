package programPractice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class CountOccurenceOfEachCharInString {

	public static void main(String[] args) {

		String s = "hello";

		Map<Character, Integer> map = new LinkedHashMap(); // Use LinkedHashMap as in output it'll preserve the order ascending as {h=1, e=1, l=2, o=1} else it'll be jumbled {e=1, h=1, l=2, o=1} in case of HashMap or TreeMap

		char[] charStr = s.toCharArray();
		
		
		for(char ch : charStr) {
			
			if( !map.containsKey(ch)) {
				map.put(ch, 1);
			}
			
			else {
			
				int returnValueOfThisKey = map.get(ch);
				System.out.println(returnValueOfThisKey);
				map.put(ch, returnValueOfThisKey+1);
			}
		}
		
		
		System.out.println(map);
		
		}
}
		
		
		
		
		
		
		
		
		
//		Map<Character,Integer> map= new HashMap();
//		
//		for(int i=0; i<s.length(); i++) {
//			char ch = s.charAt(i);
//			
//			if(!map.containsKey(ch)) {
//				
//			}else {
//				int key = map.get(ch);
//				map.put(ch, key+1);
//			}
//		
//		System.out.println(map);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		String s = "ssoonnaallii";
//		
//		int[] arr = new int[127];
//		
//		for(int i=0; i<s.length(); i++) {
//			
//			arr[s.charAt(i)] = arr[s.charAt(i)+1];
//			
//			System.out.println(arr[i]);
		
		
		
		
		
		
			
	
