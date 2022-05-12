
package allatkert;

import java.time.LocalDate;


public class Novenyevo extends Emlos{
     private boolean keredzo;

     public Novenyevo(boolean keredzo, String fogazat, int labakSzama, int kor, String szaporodas, int ehes, LocalDate kolcsonAdas, LocalDate kolcsonVeves) {
          super(fogazat, labakSzama, kor, szaporodas, ehes, kolcsonAdas, kolcsonVeves);
          this.keredzo = keredzo;
     }

     public boolean isKeredzo() {
          return keredzo;
     }

     public void setKeredzo(boolean keredzo) {
          this.keredzo = keredzo;
     }

     @Override
     public void makeSound() {
          System.out.println("muuu");
     }
     
     
     
     
}
