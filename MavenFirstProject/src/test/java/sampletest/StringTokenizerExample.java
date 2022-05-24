package sampletest;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {

		StringTokenizer st=new StringTokenizer("Hi I am shailesh");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		StringTokenizer st1=new StringTokenizer("Hi-I-am-shailesh");
		
		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken("-"));
		}
	}

}
