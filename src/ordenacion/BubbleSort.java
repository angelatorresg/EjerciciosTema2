package ordenacion;

import java.util.Arrays;

public class BubbleSort {
	
	public static String[] ordenar(String[] arr) {
		
		for (int pasada = 0; pasada < arr.length; pasada++) {
			
			boolean changed = false;
			for (int i = 0; i < arr.length - 1 - pasada; i++) {
				
				if (arr[i].compareTo(arr[i + 1]) > 0) {
					String tmp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = tmp;
					changed = true;
				}
			}
			if (!changed) {
				break;
			}
		}	
		return arr;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(ordenar(new String[] {"Adrián", "Juan", "Alberto", "Marcos", "María"})));
	}

}
