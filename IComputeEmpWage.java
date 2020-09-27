
public interface IComputeEmpWage {
	public void computeEmpWage();
	public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) ;
	int getTotalWage(String company);
}
