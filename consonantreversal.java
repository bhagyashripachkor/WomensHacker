import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<Character> vowels = new ArrayList<Character>();
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		ArrayList<Character> res = new ArrayList<Character>();
		ArrayList<Character> consonants = new ArrayList<Character>();
		int i = 0;
		String s = "";
		while(i < n) {
			String str = sc.nextLine();
			s = str;
			String rev = "";
			for(int j = 0; j < str.length(); j++){
				char ch = str.charAt(j);
				if(!vowels.contains(ch)){
					consonants.add(ch);
				}
			}
		Collections.reverse(consonants);
	
		int x = 0;
		for(int k = 0; k < s.length(); k++){
			if(vowels.contains(s.charAt(k)))
				res.add(s.charAt(k));
			else{
				res.add(consonants.get(x));
				x++;
			}
		}
		for(Character c : res)
			System.out.print(c);
			
			System.out.println();
			
			i++;
            res.clear();
		}
    }
}
