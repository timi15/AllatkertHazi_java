
package allatkert;

import java.time.LocalDate;


public class Emlos extends Gerinces{
     private String fogazat;
     private int labakSzama;

     public Emlos(String fogazat, int labakSzama, int kor, String szaporodas, int ehes, LocalDate kolcsonAdas, LocalDate kolcsonVeves) {
          super(kor, szaporodas, ehes, kolcsonAdas, kolcsonVeves);
          this.fogazat = fogazat;
          this.labakSzama = labakSzama;
     }

     public String getFogazat() {
          return fogazat;
     }

     public void setFogazat(String fogazat) {
          this.fogazat = fogazat;
     }

     public int getLabakSzama() {
          return labakSzama;
     }

     public void setLabakSzama(int labakSzama) {
          this.labakSzama = labakSzama;
     }
     
     
     public void besorolas(){
          if(this.fogazat.equalsIgnoreCase("gumós")){
               System.out.println("mindenevő");
          } else if(this.fogazat.equalsIgnoreCase("tarajos")){
               System.out.println("ragadozó");
          } else{
               System.out.println("növényevő");
          }
     }

     @Override
     public void makeSound() {
          System.out.println("kapar-kapar");
     }


}

