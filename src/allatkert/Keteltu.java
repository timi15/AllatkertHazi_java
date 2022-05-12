
package allatkert;

import java.time.LocalDate;


public class Keteltu extends Gerinces{
     
     private String elohely;
     private boolean halalos;

     public Keteltu(String elohely, boolean halalos, int kor, String szaporodas, int ehes, LocalDate kolcsonAdas, LocalDate kolcsonVeves) {
          super(kor, szaporodas, ehes, kolcsonAdas, kolcsonVeves);
          this.elohely = elohely;
          this.halalos = halalos;
     }

     public String getElohely() {
          return elohely;
     }

     public void setElohely(String elohely) {
          this.elohely = elohely;
     }

     public boolean isHalalos() {
          return halalos;
     }

     public void setHalalos(boolean halalos) {
          this.halalos = halalos;
     }

     @Override
     public void makeSound() {
          System.out.println("brek-brek");
     }

     
     
     
}
