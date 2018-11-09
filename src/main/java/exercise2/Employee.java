package exercise2;

public abstract class Employee implements Payable{

	private String name;

	protected int sales = 0;

	protected int workedHours = 0;

	public Employee(String name)
	{
		this.name = name;
	}

	public abstract int computeSalary();

	public void sell() {sales++; }

	public void workOneHour() { workedHours += 1; }

	public String getName() {
		return name;
	}
}
