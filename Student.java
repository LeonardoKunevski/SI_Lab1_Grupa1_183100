class Student {
	String index;
	String firstName;
	String lastName;
	ArrayList <Integer> labPoints;
	//TODO constructor
	public Student(String index, String firstName, String lastName, ArrayList<Integer> labPoints) {
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
		this.labPoints = labPoints;
	}

	//TODO seters & getters
	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public ArrayList<Integer> getLabPoints() {
		return labPoints;
	}

	public void setLabPoints(ArrayList<Integer> labPoints) {
		this.labPoints = labPoints;
	}

	public double getAverage(ArrayList<Integer> labPoints) {
		//TODO
		int sum = 0;
		int n = 0;
		for (int i = 0; i < labPoints; ++i) {
			sum += getLabPoints();
			n++;
		}
		return (sum/n);
	}

	public boolean hasSignature(ArrayList<Integer> labPoints) {
		//TODO
		boolean signature = false;
		int n = 0;
		for (int i = 0; i < labPoints; ++i) {
			n++;
		}
		if (n > 8) {
			signature = true;
		}
		return signature;
	}
}
