
package allatkert;

import java.time.LocalDate;


public class Gerinces {
    private int kor;
    private String szaporodas;
    private int ehes;
    private LocalDate kolcsonAdas;
    private LocalDate kolcsonVeves;

     public Gerinces(int kor, String szaporodas, int ehes, LocalDate kolcsonAdas, LocalDate kolcsonVeves) {
          this.kor = kor;
          this.szaporodas = szaporodas;
          this.ehes = ehes;
          this.kolcsonAdas = kolcsonAdas;
          this.kolcsonVeves = kolcsonVeves;
     }

     @Override
     public String toString() {
          return "Gerinces{" + "kor=" + kor + ", szaporodas=" + szaporodas + ", ehes=" + ehes + ", kolcsonAdas=" + kolcsonAdas + ", kolcsonVeves=" + kolcsonVeves + '}';
     }

     public int getKor() {
          return kor;
     }

     public void setKor(int kor) {
          this.kor = kor;
     }

     public String getSzaporodas() {
          return szaporodas;
     }

     public void setSzaporodas(String szaporodas) {
          this.szaporodas = szaporodas;
     }

     public int getEhes() {
          return ehes;
     }

     public void setEhes(int ehes) {
          this.ehes = ehes;
     }

     public LocalDate getKolcsonAdas() {
          return kolcsonAdas;
     }

     public void setKolcsonAdas(LocalDate kolcsonAdas) {
          this.kolcsonAdas = kolcsonAdas;
     }

     public LocalDate getKolcsonVeves() {
          return kolcsonVeves;
     }

     public void setKolcsonVeves(LocalDate kolcsonVeves) {
          this.kolcsonVeves = kolcsonVeves;
     }
    
    
     public void etet(String taplalek){
          if(ehes<5){
               System.out.println("Nem eszik");
          } else{
               System.out.println("Eszik");
               this.ehes/=2;
          }
     }
     
     public void makeSound(){
          System.out.println("");
     }
    
}
