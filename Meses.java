import java.util.Random;


import javax.swing.JOptionPane;

public class Meses {
    private int IDF = 0;
    private String Mes = "";
    private int Año = 0;

    public int getIDF(){
        Random random = new Random();
        int randomN = random.nextInt(1000);
        return this.IDF = randomN;
    }
    public void setMes(){
        String Mes = (JOptionPane.showInputDialog(null, "Digite el mes: ", "MES", 0));
        this.Mes = Mes;
    }
    public String getMes(){
        return Mes;
    }
    public void setAño(){
        Año = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el año: ", "AÑO", 0));
        this.Año = Año;
    }
    public int getAño(){
        return Año;
    }  

}
