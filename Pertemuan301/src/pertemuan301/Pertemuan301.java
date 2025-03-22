/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan301;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Pertemuan301 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int now = 0;
        int nanti = 0;
        int awal = now;
        int akhir = nanti;
        
        now = Integer.parseInt(JOptionPane.showInputDialog("Input nilai awal"));
        akhir = Integer.parseInt(JOptionPane.showInputDialog("Input nilai akhir"));

        //Float.parseFloat(s)
        
        System.out.println("Perulangan While");
        awal = now;
        while(awal<akhir){
            System.out.println("Perulangan ke-"+awal);
            awal++;
        }
        
        System.out.println("Perulangan Do..While");
        awal = now;
        do{
            System.out.println("Perulangan ke-"+awal);
            awal++;

        }while(awal<akhir);
        
        System.out.println("Perulangan dengan For");
//        awal = now;
        for(awal=now; awal<akhir; awal++){
            System.out.println("Perulangan ke-"+awal);
        }
    }
    
}
