public static ArrayList<String> removeDuplicates(List<String> input) {

	TreeSet<String> sorter = new TreeSet<String>();

	for(String word : input){
		sorter.add(word);
	}

	ArrayList<String> result = new ArrayList<String>(sorter);

	return result;
}
