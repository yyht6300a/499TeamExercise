public class Int_ascending {

	
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
	
}//ascending
	
}