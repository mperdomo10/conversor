import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class Principal {

		public static void main(String[] args) {
			
			Object seleccion = JOptionPane.showInputDialog(
					   null,
					   "Seleccione una Opcion de Conversion",
					   "Menu",
					   JOptionPane.QUESTION_MESSAGE,
					   null,  // null para icono defecto
					   new Object[] { "Conversor de Moneda", "Conversor de Pesos" }, 
					   null);

					System.out.println("El usuario ha elegido "+seleccion);
			 
					if (seleccion=="Conversor de Moneda"){
						int cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Cantidad de dinero que desea convertir"));
						
						Object conversion = JOptionPane.showInputDialog(
								   null,
								   "Elige la moneda a la que deseas convertir tu dinero",
								   "Moneda",
								   JOptionPane.QUESTION_MESSAGE,
								   null,  // null para icono defecto
								   new Object[] { "De Dolar a Quetzales", "De Dolar a Peso Mexicano", "De Dolar a Libras", "De Dolar a Euros"}, 
								   null);
						
			        }else {
			            System.out.println("Conversor de Pesos");
			        }
	}

}
