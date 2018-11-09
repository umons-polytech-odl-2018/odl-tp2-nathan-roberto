package exercise1;

public class Exercise1 {
	public Employee buildFixedSalaryEmployee(String name, int fixedSalary) {
		FixedSalaryEmployee fixedSalaryEmployee = new FixedSalaryEmployee(fixedSalary, name);
		return fixedSalaryEmployee;
	}

	public Employee buildBaseSalaryPlusCommissionEmployee(String name, int baseSalary, int commission)
	{
		BaseSalaryPlusCommissionEmployee baseSalaryPlusCommissionEmployee = new BaseSalaryPlusCommissionEmployee(commission, baseSalary, name);
		return baseSalaryPlusCommissionEmployee;
	}

	public Employee buildWorkHourSalaryEmployee(String name, int hourlyRoute)
	{
		WorkHourSalaryEmployee workHourSalaryEmployee = new WorkHourSalaryEmployee(hourlyRoute, name);
		return workHourSalaryEmployee;
	}
}
