public static int maxGain(int[] a) {
	TreeSet<Integer> gainTracker = new TreeSet<Integer>();

	gainTracker.add(0);

	for(int i = 0; i < a.length; i++){
		for(int j = i; j < a.length; j++){
			if(a[i] < a[j]) gainTracker.add(a[j] - a[i]);
		}
	}
	return gainTracker.last();
}
