
package allatkert;

import java.time.LocalDate;


public class Mindenevo extends Emlos{
     
     private String elohely;

     public Mindenevo(String elohely, String fogazat, int labakSzama, int kor, String szaporodas, int ehes, LocalDate kolcsonAdas, LocalDate kolcsonVeves) {
          super(fogazat, labakSzama, kor, szaporodas, ehes, kolcsonAdas, kolcsonVeves);
          this.elohely = elohely;
     }

     public String getElohely() {
          return elohely;
     }

     public void setElohely(String elohely) {
          this.elohely = elohely;
     }
     
     
     
}
