package exercise1;

public class WorkHourSalaryEmployee extends Employee{

	private int hourRate;

	public WorkHourSalaryEmployee(int hourRate, String name)
	{
		super(name);
		this.hourRate = hourRate;
	}

	@Override
	public int computeSalary() {
		return (hourRate * workedHours);
	};
}
