package exercise2;

import exercise1.Exercise1;

public class Exercise2 extends Exercise1 {

	public ProductionWorker buildProductiveWorker(int salaryPerProducedPiece)
	{
		ProductionWorker productionWorker = new ProductionWorker(salaryPerProducedPiece);
		return productionWorker;
	}
}
