
package allatkert;

import java.time.LocalDate;


public class Hal extends Gerinces{
     
     private boolean edesvizi;

     public boolean isEdesvizi() {
          return edesvizi;
     }

     public void setEdesvizi(boolean edesvizi) {
          this.edesvizi = edesvizi;
     }

     public Hal(boolean edesvizi, int kor, String szaporodas, int ehes, LocalDate kolcsonAdas, LocalDate kolcsonVeves) {
          super(kor, szaporodas, ehes, kolcsonAdas, kolcsonVeves);
          this.edesvizi = edesvizi;
     }

     @Override
     public void makeSound() {
          System.out.println("cup-cup");
          
     }
     
     

     
     
     
     
}
