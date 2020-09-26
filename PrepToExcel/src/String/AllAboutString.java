package String;

import java.util.Scanner;

public class AllAboutString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter a String");
		String str = sc.nextLine();
		//printSubsetOfaString(str);
		//System.out.println(isPalandromic(str));
		stringConcept();
		

	}

	public static void printSubsetOfaString(String str){
		
		for(int i=0 ;  i< str.length();i++){
			for(int j=i+1 ;j< str.length();j++){
				System.out.println(str.substring(i, j));
			}
		}
		
	}
	
	public static boolean isPalandromic(String s){
		int low = 0;
		int high = s.length()-1;
		
		while(low<=high){
			if(s.charAt(low)!= s.charAt(high)){
				return false;
				
			}else{
				low++;
				high--;
			}
			
		}
		
		return true;
	}
	
	
	public static void stringConcept(){
		String a = "hello";
		String b = "hello";
		
		System.out.println("A :: "+ a);
		System.out.println("B :: "+ b);
		
		System.out.println(b+"e");
		System.out.println(a);
		
		System.out.println(b.replace('o', 'y'));
		System.out.println(a);
	}
}
