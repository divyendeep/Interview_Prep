package Array2D;

import java.util.Scanner;

public class RotateBy90 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		int[][] arr = new int[n][n];
		for(int i=0;i<arr.length;i++){
			for(int j=0;j< arr[0].length;j++){
				arr[i][j] =  sc.nextInt();
			}
		}
		
		//transpose it first
		for(int i=0 ; i< arr.length;i++){
			for(int j=i; j< arr[0].length;j++){
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		
		//reverse the row
		
		
		for(int i = 0 ; i< arr.length ; i++){
			int l=0;
			int r=  arr[i].length-1;
			
			while(l<r){
				int temp = arr[i][l];
				arr[i][l] = arr[i][r];
				arr[i][r] = temp;
						
				l++;
				r--;
			}
		}
		
		
		display(arr);

	}
	
	public static void display(int[][] array){
		for(int i=0 ; i < array.length ; i++){
			for(int j=0 ; j< array[0].length ;j++){
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
