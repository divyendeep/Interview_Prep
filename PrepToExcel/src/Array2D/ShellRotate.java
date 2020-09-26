package Array2D;

import java.util.Scanner;

public class ShellRotate {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int  r = sc.nextInt();
		int c = sc.nextInt();
		
		int[][] arr =  new int[r][c];
		for(int i = 0; i < arr.length ; i++){
			for(int j=0 ; j < arr[0].length ; j++){
				arr[i][j] = sc.nextInt();
			}
		}
		
		int s = sc.nextInt();
		int rotate = sc.nextInt();
		
		//fillOneDarrayfromShellElements
		int[] oneDArray = fillOnedArray(arr,s);
		for(Integer i : oneDArray){
			System.out.print(i + "\t");
		}
		System.out.println("\n");
		rotateOned(oneDArray,rotate);
		fillTwodArray(arr,s,oneDArray);
		
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
	private static void fillTwodArray(int[][] arr, int s , int[] oneDArr) {
		int minr = s-1;
		int minc =s-1;
		int maxr =arr.length -s ;
		int maxc = arr[0].length - s ;
		
		int index = 0;
		//left wall
		for(int i = minr, j = minc ; i <= maxr; i++){
			arr[i][j] = oneDArr[index] ;
			index++;
		}
		
		//bottom wall
		for(int i = maxr, j = minc + 1 ; j <= maxc; j++){
			arr[i][j] = oneDArr[index] ;
			index++;
		}
		
		//right wall
		for(int i = maxr -1 , j = maxc ; i >= minr; i--){
			arr[i][j] = oneDArr[index] ;
			index++;
		}
		
		//top wall
		for(int i = minr, j = maxc -1 ; j >= minc + 1; j--){
			arr[i][j] = oneDArr[index] ;
			index++;
		}
		
		
		
		
	}

	private static void rotateOned(int[] arr, int rotate) {
		rotate = rotate % arr.length;
		if(rotate<0){
			rotate = rotate + arr.length;
		}
		reverse(arr,0, arr.length - rotate -1);
		reverse(arr,arr.length - rotate , arr.length -1);
		reverse(arr, 0 , arr.length -1);
		
	}

	private static void reverse(int[] arr, int i, int j) {
		while(i < j){
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
			i++;
			j--;
		}
		
	}

	private static int[] fillOnedArray(int[][] arr, int s) {
		int minr = s-1;
		int minc =s-1;
		int maxr =arr.length -s ;
		int maxc = arr[0].length - s ;
		
		int size = 2 *(maxr - minr + maxc - minc);
		int[] oneDArr = new int[size];
		int index = 0;
		//left wall
		for(int i = minr, j = minc ; i <= maxr; i++){
			oneDArr[index] = arr[i][j];
			index++;
		}
		
		//bottom wall
		for(int i = maxr, j = minc + 1 ; j <= maxc; j++){
			oneDArr[index] = arr[i][j];
			index++;
		}
		
		//right wall
		for(int i = maxr -1 , j = maxc ; i >= minr; i--){
			oneDArr[index] = arr[i][j];
			index++;
		}
		
		//top wall
		for(int i = minr, j = maxc -1 ; j >= minc + 1; j--){
			oneDArr[index] = arr[i][j];
			index++;
		}
		
		
		return oneDArr;
		
		
	}

}
