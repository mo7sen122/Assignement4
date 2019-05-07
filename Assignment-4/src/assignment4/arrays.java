package assignment4;

import java.util.Random;

public class arrays {

	public static int arr() {
		
		int printValue = 0;
		int sum=0;
		int temp;
		int arr[] = new int[20];
		
		for(int counter=0;counter<arr.length;counter++) { //random number generator
			Random rand = new Random();
			arr[counter] = rand.nextInt(20);
		}
		
		while(printValue<arr.length) {  //Print the values in the array
			System.out.println(arr[printValue]);
			printValue++;
		}
		
		for(int i=0;i<arr.length;i++) {  //Sort the array
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) 

                {

                    temp = arr[i];

                    arr[i] = arr[j];

                    arr[j] = temp;

                }
            
		}
		
		}
        System.out.print("Ascending Order:");

        for (int i = 0; i < arr.length - 1; i++) 

        {

            System.out.print(arr[i] + ",");
        }
        System.out.println("");
        
        System.out.println("The max value is " + arr[19]); //Max number 
       
        for (int i = 0; i < arr.length - 1; i++) //values summation

        {
        	sum+=arr[i];
        }
        System.out.print("The sum of array values : " +sum); //sum of the array
		return sum;
	}
}
