
import javax.swing.JOptionPane;


public class Principal {

	public static void main(String[] args) {

		menu();
		
	}
	
	
	private static void menu() {
		Object seleccion = JOptionPane.showInputDialog(
				
				null,
		
				"Seleccione una Opcion de Conversion",
		
				"Menu",
		
				JOptionPane.QUESTION_MESSAGE,
		
				null, // null para icono defecto
		
				new Object[] { "Conversor de Moneda", "Conversor de Pesos" },
		
				null);
		
				System.out.println("El usuario ha elegido "+seleccion);
		
				if (seleccion=="Conversor de Moneda"){
		
					double cant = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Cantidad de dinero que desea convertir"));
			
					Object conversion = JOptionPane.showInputDialog(
			
					null,
			
					"Elige la moneda a la que deseas convertir tu dinero",
			
					"Moneda",
			
					JOptionPane.QUESTION_MESSAGE,
			
					null, // null para icono defecto
			
					new Object[] { "De Dolar a Euros", "De Dolar a Libras Esterlinas", "De Dolar a Yen Japones", "De Dolar a Won sul-coreano", "De Euros a Dolar", "De Libras Esterlinas a Dolar", "De Yen Japonés a Dolar", "De Won sul-coreano a Dolar"},
			
					null);
			
					int contador=0;
					double vcambio = 0.0;
				
		
					String ToCurrency = null;
					String TipoConversion=(String) conversion;
					String moneda = null;
					for(int i = 0; i < TipoConversion.length(); i ++){
						 if(TipoConversion.charAt(i) == ' '){
							 	contador = contador+1;
							 	if (contador==3) {
							 		ToCurrency=TipoConversion.substring(i+1,TipoConversion.length());
							 		System.out.println(ToCurrency);
							 		switch(ToCurrency) {
							 		case "Euros":
							 			vcambio= 0.90;	
							 			moneda="€ ";
										break;
							 		
							 		case "Libras Esterlinas":
							 			vcambio= 0.77;	
							 			moneda="£ ";
							 			break;
							 			
							 		case "Yen Japones":
							 			vcambio= 138.49;	
							 			moneda="¥ ";
							 			break;
							 			
							 		case "Won sul-coreano":
							 			vcambio= 1272.90;	
							 			moneda="₩ ";
							 			break;
							 			
							 		case "Libras":
							 			vcambio= 0.77;	
							 			moneda="£ ";
							 			break;
							 			
							 		case "Dolar":
							 			vcambio= 1.11;	
							 			moneda="$ ";
							 			break;
							 			
							 		
						 		}
							 		break;
							 	}	
						}
						
					}
				
					
					
					ConvMoneda conversormoneda=new ConvMoneda(cant,vcambio);
					double result = conversormoneda.convertir();
					JOptionPane.showMessageDialog(null,"Tienes "+moneda+ result+"  "+ ToCurrency);
					var yesOrNo = JOptionPane.showConfirmDialog(null, "¿Desea Continuar?");
					  if (yesOrNo == 0) {
					     menu();
					    }
					    if (yesOrNo == 1) { 
					      JOptionPane.showMessageDialog(null, "Programa terminado");
					    }
					  /*  if (yesOrNo == 2) { 
					      JOptionPane.showMessageDialog(null, "You chose to cancel!");
					    }*/
					
		
					} else {
		
					System.out.println("Conversor de Pesos");
		
				}
		
		}
		
			
		
}

