
package allatkert;

import java.time.LocalDate;


public class Madar extends Gerinces{
     
     private boolean koltozo;
     private String tollazatSzine;

     public Madar(boolean koltozo, String tollazatSzine, int kor, String szaporodas, int ehes, LocalDate kolcsonAdas, LocalDate kolcsonVeves) {
          super(kor, szaporodas, ehes, kolcsonAdas, kolcsonVeves);
          this.koltozo = koltozo;
          this.tollazatSzine = tollazatSzine;
     }

     public boolean isKoltozo() {
          return koltozo;
     }

     public void setKoltozo(boolean koltozo) {
          this.koltozo = koltozo;
     }

     public String getTollazatSzine() {
          return tollazatSzine;
     }

     public void setTollazatSzine(String tollazatSzine) {
          this.tollazatSzine = tollazatSzine;
     }

     @Override
     public void makeSound() {
          System.out.println("csip-csip");
     }
     
     
     
     
     
}
