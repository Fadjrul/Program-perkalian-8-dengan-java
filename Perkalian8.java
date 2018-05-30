/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package perkalian8;

/**
 *
 * @author windows8.1pro
 */
public class Perkalian8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      System.out.println("tugas Struktur data perkalian 8 menggunakan looping");
      System.out.println("Dengan for");
      int  hslfor = 0;
      for (int i=1; i<11;i++){
          hslfor = i*8;
         System.out.println(i + " X 8 = " + hslfor);
      }
    }
}
