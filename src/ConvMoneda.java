
public class ConvMoneda {
	double cant;
	double vcambio;
	
	public ConvMoneda(double cant, double vcambio) {
		super();
		this.cant = cant;
		this.vcambio=vcambio;
	}
	
	public double getCant() {
		return cant;
	}
	public void setCant(double cant) {
		this.cant = cant;
	}

	
	public double convertir(){

		return Math.round((cant*vcambio)*100.0)/100.0;
		
		
	}
}