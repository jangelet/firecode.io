public static int[] selectionSortArray(int[] arr){
	if(arr == null) return null;

	for(int sorted = 0; sorted < arr.length; sorted++){
		for(int i = sorted; i < arr.length; i++){
			if(arr[i] < arr[sorted]){
				int temp = arr[i];
				arr[i] = arr[sorted];
				arr[sorted] = temp;
			}
		}
	}
	return arr;
}
