package array;

import java.util.Arrays;

public class deleteDublicate {

	public static void main(String[] args) {
	int	deletDublicate [] = {1,4,1,3,5,3,1,0,1,0,1};
	Arrays.sort(deletDublicate);
	
	int length = deletDublicate.length;
	int tempArry [] = new int [deletDublicate.length];
	int j = 0;
	
	for (int i = 0; i<length -1; i++) {
		
		if (deletDublicate[i] != deletDublicate[i+1]) {
			tempArry[j++] = deletDublicate [i];
		}
	}
	tempArry [j++] = deletDublicate[length - 1];
	for (int k = 0 ; k<j ; k++) {
		System.out.println(tempArry [k]);
	}
	
	
	}
	

	}

