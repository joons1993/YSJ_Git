package package1;

class Staff2 {
	String name;
	String dept;
	int salary;
	
	public Staff2(String name, String dept, int salary) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	String displayInfo() {
		return "이름 :" +name+",부서:"+dept+",연봉:"+salary;
	}

}
