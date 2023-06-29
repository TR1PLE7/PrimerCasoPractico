import javax.swing.JOptionPane;


public class ClasesP {
    private int Cedula =0;
    private String cliente = ""; 
    

    public void setCedula(){
        Cedula=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite su cedula", "CEDULA", 0));
        this.Cedula = Cedula;
    }
    public int getCedula(){
        return Cedula;
    }
    public void setCliente(){
        String cliente = JOptionPane.showInputDialog(null, "Nombre del cliente: ", "CLIENTE", 0);
        this.cliente= cliente;
    
    }
    public String getcliente(){
        return cliente;
    }


}
