package exercise1;

public class FixedSalaryEmployee  extends Employee{

	private int fixedSalary;

	public FixedSalaryEmployee (int fixedSalary, String name)
	{
		super(name);
		this.fixedSalary = fixedSalary;
	}

	@Override
	public int computeSalary() {
		return fixedSalary;
	};

}
