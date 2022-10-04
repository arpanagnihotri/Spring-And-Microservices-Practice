package agni;

public class Customer implements Comparable<Customer>{
	private int id;
	private int age;
	private int salary;
	
	public Customer(int id, int age, int salary) {
		this.id = id;
		this.age = age;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", age=" + age + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Customer o) {
		if(this.getId()>o.getId()) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
}
