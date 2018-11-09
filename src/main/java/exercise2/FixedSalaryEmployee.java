package exercise2;

import exercise1.Employee;

public class FixedSalaryEmployee extends Employee{

	private int fixedSalary;

	public FixedSalaryEmployee(int fixedSalary, String name)
	{
		super(name);
		this.fixedSalary = fixedSalary;
	}

	@Override
	public int computeSalary() {
		return fixedSalary;
	};

}
