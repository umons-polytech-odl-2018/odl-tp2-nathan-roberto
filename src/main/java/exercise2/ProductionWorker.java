package exercise2;

public class ProductionWorker implements Payable{

	private int producedPieceRate;
	//private  int salaryPerProducedPiece;
	private int nbPiece = 0;
	int prixpiece;

	public ProductionWorker(int producedPieceRate)
	{
		this.producedPieceRate = producedPieceRate;
	}

	public void produceOnePiece()
	{
		nbPiece++;
	}

	public int computeSalary() {
		return nbPiece*producedPieceRate;
	}
}
