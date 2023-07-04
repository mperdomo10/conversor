import javax.swing.JOptionPane;

public class Principal {

		public static void main(String[] args) {
			/*String[] opcion= {JOptionPane.showInputDialog(null,"Seleccione una Opcion de Conversion","Menu",JOptionPane.PLAIN_MESSAGE,null,
					new Object[] {"Conversor de Moneda", "Conversor de Pesos"},"Selecciona").toString()};*/
			
			String opciones[]= {"Conversor de Moneda", "Conversor de Pesos"};
			
			String opc= (String) JOptionPane.showInputDialog(null,"Seleccione una Opcion de Conversion","Menu",JOptionPane.DEFAULT_OPTION,null,opciones,opciones[0]);
			JOptionPane.showMessageDialog(null, opc);
			
			
			
			 
	
	}

}
