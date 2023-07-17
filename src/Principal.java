
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
		
				new Object[] { "Conversor de Moneda", "Conversor de Masa" },
		
				null);
		
				//System.out.println("El usuario ha elegido "+seleccion);
		
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
					String fromCurrency = null;
					String TipoConversion=(String) conversion;
					String moneda = null;
					for(int i = 0; i < TipoConversion.length(); i ++){
						 if(TipoConversion.charAt(i) == ' '){ //inicio if espacio
							 	contador = contador+1;
							 	
							 	if (contador==2) {
							 		fromCurrency=TipoConversion.substring(0,i);
							 		System.out.println(fromCurrency);
							 		switch(fromCurrency) {
							 		case "De Euros":
							 			vcambio= 0.90;	
							 			moneda="€ ";
										break;
							 		
							 		case "De Libras":
							 			vcambio= 0.77;	
							 			moneda="£ ";
							 			break;
							 			
							 		case "De Yen":
							 			vcambio= 138.49;	
							 			moneda="¥ ";
							 			break;
							 			
							 		case "De Won":
							 			vcambio= 1272.90;	
							 			moneda="₩ ";
							 			break;
							 				 			
							 		
						 		} //fin switch
							 		//break;
							 	} //fin if contador==2	 	
							 		System.out.println(contador);			 	
							 	if (contador==3) {
							 		ToCurrency=TipoConversion.substring(i-1,TipoConversion.length());
							 		System.out.println(ToCurrency);
							  		switch(ToCurrency) {
							 		case "a Euros":
							 			vcambio= 0.90;	
							 			moneda="€ ";
										break;
							 		
							 		case "a Libras Esterlinas":
							 			vcambio= 0.77;	
							 			moneda="£ ";
							 			break;
							 			
							 		case "a Yen Japones":
							 			vcambio= 138.49;	
							 			moneda="¥ ";
							 			break;
							 			
							 		case "a Won sul-coreano":
							 			vcambio= 1272.90;	
							 			moneda="₩ ";
							 			break;
							 			
							 							 			
							 		
						 		} //fin switch
							 		break;
							 	} //fin contador==3
						} //fin if espacio
						
					} //fin for
				
					
					
					ConvMoneda conversormoneda=new ConvMoneda(cant,vcambio);
					double result = conversormoneda.convertir();
					JOptionPane.showMessageDialog(null,"Tienes "+moneda+ result);
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
					
		
					} //fin de seleccion
				else {
		
					System.out.println("Conversor de Pesos");
					double cant = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor a convertir"));
					
					Object conversion1 = JOptionPane.showInputDialog(
			
					null,
			
					"Elige la cantidad a la que deseas convertir",
			
					"Masa",
			
					JOptionPane.QUESTION_MESSAGE,
			
					null, // null para icono defecto
			
					new Object[] {"Libras a Kilogramos","Libras a Gramos","Libras a Onzas","Kilogramos a Libras"},
			
					null);
			
					int contador=0;
					double vcambio = 0.0;
					
				
					
					String Aunidades = null;
					String TipoConversion1=(String) conversion1;
					
					for(int i = 0; i < TipoConversion1.length(); i ++){
						 if(TipoConversion1.charAt(i) == ' '){ //If1
							 	contador = contador+1;
							 								 					 	
							 	if (contador==2) {
							 		Aunidades=TipoConversion1.substring(i-1,TipoConversion1.length());
							  		switch(Aunidades) {
							 		case "a Kilogramos":
							 			vcambio= 0.453592;	
							 			break;
							 			
							 		case "a Gramos":
							 			vcambio= 453.592;	
							 			break;
							 			
							 		case "a Onzas":
							 			vcambio= 16;	
							 			break;
							 			
							 		case "a Libras":
							 			vcambio= 2.20462;
							 			
							 			break;					 			
							 		
						 		} //fin del switch
							 		break;
							 	} //fin del if contador==2
						} //fin evaluar espacio
						
					} //fin del for
				
					
					
					ConvMoneda conversormasa=new ConvMoneda(cant,vcambio);
					double resultado = conversormasa.convertir();
					JOptionPane.showMessageDialog(null,"Tienes "+resultado+ " "+Aunidades);
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
					
		
					
		
				} //fin del else seleccion
		
		} //fin menu
		
			
		
} //fin principal

