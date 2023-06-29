import javax.swing.JOptionPane;

public class CasoP {
    static int entrada =0;
    static int Total = 0;
    
     
   
    /**
     * @param args
     */
    public static void main(String[]args){
        ClasesP x = new ClasesP();
        Facturas y = new Facturas();
        Meses z = new Meses();
        

        entrada =Integer.parseInt(JOptionPane.showInputDialog(null, "DIGITE QUE DESEA HACER: \n 1-REGISTRARSE \n2-ESTADO Y MONTO \n3-CUOTAS", "BIENVENIDO :P", 0));
            
        while(entrada!=0){
            
            if (entrada==1){
                x.setCedula();
                x.setCliente();
                JOptionPane.showMessageDialog(null, x.getCedula() +"\n"+x.getcliente(), "CEDULA CLIENTE", 0);
                entrada =Integer.parseInt(JOptionPane.showInputDialog(null, "DIGITE QUE DESEA HACER: \n 1-REGISTRARSE \n2-ESTADO Y MONTO \n3-CUOTAS", "BIENVENIDO :P", 0));
            
            }
        
            if(entrada==2){
                y.setMonto();
                y.setEstado();
                JOptionPane.showMessageDialog(null,"EL MONTO ES: "+y.getMonto()+"\n EL ESTADO ES: "+y.getEstado(), "MONTO Y ESTADO DE LA FACTURA", 0);
                entrada =Integer.parseInt(JOptionPane.showInputDialog(null, "DIGITE QUE DESEA HACER: \n 1-REGISTRARSE \n2-ESTADO Y MONTO \n3-CUOTAS", "BIENVENIDO :P", 0));
            
            }
        
            if(entrada==3){
                z.setMes();
                z.setAño();
                JOptionPane.showMessageDialog(null,"La ID de es"+ z.getIDF()+"\n"+z.getAño()+"\n"+z.getMes(), "ID Y MES DE LA FACTURA", 0);
                entrada =Integer.parseInt(JOptionPane.showInputDialog(null, "DIGITE QUE DESEA HACER: \n 1-REGISTRARSE \n2-ESTADO Y MONTO \n3-CUOTAS", "BIENVENIDO :P", 0));
            
            }
            
        }
        Total = y.getMonto() + y.getMonto();
        
        double impuesto=y.getMontoPendiente()*005;
        Double suma = impuesto+y.getMontoPendiente();
        double Plan=suma/6;
        

        JOptionPane.showMessageDialog(null, "CUOTA JULIO 1: "+Plan+"\n CUOTA AGOSTO 2: "+Plan+"\n CUOTA SEPTIEMBRE 3:"+Plan+"\n CUOTA OCTUBRE 4: "+Plan+"\n CUOTA NOVIEMBRE 5: "+Plan+"\n CUOTA DICIEMBRE 6: "+Plan, "RESULTADO FINAL", 0);
        JOptionPane.showMessageDialog(null, "ID del cliente"+z.getIDF()+"\n Monto TOTAL:"+Total+"Con impuestp: "+impuesto, "FACTURA FINAL", 0);
    }
        
    

    
    
}
