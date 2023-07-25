

import javax.swing.JOptionPane;

public class Principal {

public static void main(String[] args) {

    menu();

}

    private static void menu() {
        double vcambio = 0.0;
        boolean bandera = true;
        double cant=0.0;
        String moneda = null;
        
        Object seleccion = JOptionPane.showInputDialog(
        null,"Seleccione una Opcion de Conversion","Menu",JOptionPane.QUESTION_MESSAGE,null, // null para icono defecto
        new Object[] { "Conversor de Moneda", "Conversor de Masa" },null);

        if (seleccion=="Conversor de Moneda"){
            
        while (bandera) {  //validar valor ingresado
            try { 
                cant = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Cantidad de dinero que desea convertir"));
                bandera=false;
            }
            catch(NumberFormatException e){
                javax.swing.JOptionPane.showMessageDialog(null, "Ingresar Valores numericos");
                bandera=true;

            }
        }

        Object conversion = JOptionPane.showInputDialog(
        null,
        "Elige la moneda a la que deseas convertir tu dinero",
        "Moneda",
        JOptionPane.QUESTION_MESSAGE,
        null, // null para icono defecto
        new Object[] { "De Dolar a Euros", "De Dolar a Libras Esterlinas", "De Dolar a Yen Japones", "De Dolar a Won sul-coreano",
        "De Euros a Dolar", "De Libras Esterlinas a Dolar", "De Yen Japonés a Dolar", "De Won sul-coreano a Dolar"},null);
        
        String TipoConversion=(String) conversion;
        switch(TipoConversion) {
            case "De Dolar a Euros":
                vcambio= 0.90;
                moneda="€ ";
            break;
            case "De Dolar a Libras Esterlinas":
                vcambio= 0.77;
                moneda="£ ";
            break;
            case "De Dolar a Yen Japones":
                vcambio= 138.49;
                moneda="¥ ";
            break;
            case "De Dolar a Won sul-coreano":
                vcambio= 1272.90;
                moneda="₩ ";
            break;
            case "De Euros a Dolar":
                vcambio= 1/0.90;
                moneda="$ ";
            break;
            case "De Libras Esterlinas a Dolar":
                vcambio= 1/0.77;
                moneda="$ ";
            break;
            case "De Yen Japonés a Dolar":
                vcambio= 1/138.49;
                moneda="$ ";
            break;
            case "De Won sul-coreano a Dolar":
                vcambio= 1/1272.90;
                moneda="$ ";
            break;
        }//fin del switch

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
        if (yesOrNo == 2) {
            JOptionPane.showMessageDialog(null, "Programa terminado");
        }

        } //fin de seleccion

        else {
            while (bandera) {
                try { 
                    cant = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor a convertir"));;
                    bandera=false;
                }
                catch(NumberFormatException e){
                    javax.swing.JOptionPane.showMessageDialog(null, "Ingresar Valores numericos");
                    bandera=true;   
                }
            }

        Object conversion1 = JOptionPane.showInputDialog(null,"Elige la cantidad a la que deseas convertir",
        "Masa",JOptionPane.QUESTION_MESSAGE,null, // null para icono defecto
        new Object[] {"Libras a Kilogramos","Libras a Gramos","Libras a Onzas","Kilogramos a Libras", 
        "De Gramos a Libras", "De Onzas a Libras"},null);

        String TipoConversion1=(String) conversion1;

        switch(TipoConversion1) {

        case "Libras a Kilogramos":
            vcambio= 0.453592;
        break;
        case "Libras a Gramos":
            vcambio= 453.592;
        break;
        case "Libras a Onzas":
            vcambio= 16;
        break;
        case "Kilogramos a Libras":
            vcambio= 2.20462;
        break;
        case "De Gramos a Libras":
            vcambio= 0.0022046;
        break;
        case "De Onzas a Libras":
            vcambio= 0.0625;
        break;
        } //fin del switch


        ConvMoneda conversormasa=new ConvMoneda(cant,vcambio);
        double resultado = conversormasa.convertir();
        JOptionPane.showMessageDialog(null,"Tienes "+resultado+ " ");
        var yesOrNo = JOptionPane.showConfirmDialog(null, "¿Desea Continuar?");

        if (yesOrNo == 0) {
            menu();
        }
        if (yesOrNo == 1) {
            JOptionPane.showMessageDialog(null, "Programa terminado");
        }
        if (yesOrNo == 2) {
            JOptionPane.showMessageDialog(null, "Programa terminado");
        }
        } //fin del else seleccion

    } //fin menu

} //fin principal