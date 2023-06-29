import javax.swing.JOptionPane;

public class Facturas {
    private int Monto =0;
    private int Estado =0;
    private int MontoPendiente = 0;
    private int MontoSaldado = 0;

    public void setMonto(){
        Monto = Integer.parseInt(JOptionPane.showInputDialog(null, "MONTO FACTURA: ", "FACTURA MONTO", 0));
        this.Monto = Monto;
    }
    public int getMonto(){
        return Monto;
    }
    public void setEstado(){
        Estado = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el estado de factura: ", "ESTADO FACTURA", 0));
        if(Estado==1){
            MontoSaldado=getMonto();
            
        }
        if(Estado==2){
            MontoPendiente=getMonto();
            
        }
        this.Estado = Estado;
    }
    public int getEstado(){
        return Estado;
    }   
    public int getMontoPendiente(){
        return MontoPendiente;
    }
    public int getMontoSaldado(){
        return MontoSaldado;
    }


    
            

}
