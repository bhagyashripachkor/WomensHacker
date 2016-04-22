import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String train = sc.nextLine();
		StringTokenizer st = new StringTokenizer(train," ");
		int count = 0;
		while(st.hasMoreTokens()){
			int  i = Integer.parseInt(st.nextToken());
			if(i == 1)
				count++;
		}
		if(count%2 == 0){
			System.out.print("Yes" + " ");
			
		}else{
			System.out.print("No" + " ");
		}
		System.out.print(count);
    }
}
