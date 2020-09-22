public class Int_ascending {

	//the function ascending require an unsorted integer array as the input
	//it can sort the array in ascending order
	public static void ascending(int[]arr) {
		for(int i=0;i<arr.length;i++) {
			int Min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[Min]>arr[j])
					Min=j;
			}
			int temp=arr[i];
			arr[i]=arr[Min];
			arr[Min]=temp;
		}
	//use a nested for loop to check through the array, if i>j, switch two elements
}//ascending
	
}
