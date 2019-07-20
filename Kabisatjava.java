package kabisatjava;
import javax.swing.JOptionPane;
class Kabisatjava{
    public static void main(String[] args) {
        String tahuns, tgl28, tgl29;
        int tahun;
        tahuns = JOptionPane.showInputDialog("2000 : ");
        tahun = Integer.parseInt(tahuns);
        tgl29= new String ("\nJumlah hari bulan Februari adalah 29");
        tgl28= new String ("\nJumlah hari bulan Februari adalah 28");
        
        //tahun habis dibagi 400 = Kabisat.
        if(tahun%400==0){
            
        //tahun tidak habis dibagi 400 tetapi habis dibagi 100 = Bukan Kabisat.
        if(tahun%400!=0 && tahun%100 == 0)
        JOptionPane.showMessageDialog(null,tahun + " Adalah Bukan Tahun Kabisat" + " "+ tgl28);
        else {
        JOptionPane.showMessageDialog(null, tahun + "Adalah Tahun Kabisat" + " " + tgl29);
        }
        }
        
        //tahun tidak habis dibagi 400, tidak habis dibagi 100 tetapi habis dibagi 4 = Kabisat.
        else if (tahun%400!=0 && tahun%100!=0 && tahun%4 == 0) {
        JOptionPane.showMessageDialog(null, tahun + "Adalah Tahun Kabisat" + " " + tgl29);
        }
        
        else
            
        //tahun tidak habis dibagi 400, tudak habis dibagi 100, dan tidak habis dibagi 4 = Bukan Tahun Kabisat.
        JOptionPane.showMessageDialog(null,tahun + "Adalah Bukan Tahun Kabisat" + " " + tgl28);
    }
}