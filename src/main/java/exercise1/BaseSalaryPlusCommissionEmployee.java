package exercise1;

public class BaseSalaryPlusCommissionEmployee extends Employee{

	private int baseSalary;
	private int commission;

	public BaseSalaryPlusCommissionEmployee(int commission, int baseSalary, String name)
	{
		super(name);
		this.baseSalary = baseSalary;
		this.commission = commission;
	}

	@Override
	public int computeSalary() {
		return (baseSalary + commission*sales);
	};
}
