public static String duplicate(int[] numbers){
	int[] result = new int[numbers.length];
	TreeSet<Integer> tracker = new TreeSet<Integer>();
	Arrays.sort(numbers);
	for(int i = 0; i < numbers.length - 1; i++){
		if(numbers[i] == numbers[i+1]) tracker.add(numbers[i]);
	}

	return tracker.toString();
}
