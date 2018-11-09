package exercise2;

import exercise1.Employee;

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
