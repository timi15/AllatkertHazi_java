
package allatkert;

import java.time.LocalDate;


public class Hullo extends Gerinces{
     private int testho;

     public Hullo(int testho, int kor, String szaporodas, int ehes, LocalDate kolcsonAdas, LocalDate kolcsonVeves) {
          super(kor, szaporodas, ehes, kolcsonAdas, kolcsonVeves);
          this.testho = testho;
     }

     public int getTestho() {
          return testho;
     }

     public void setTestho(int testho) {
          this.testho = testho;
     }
     
     public void melegites(){
          if(testho<24){
               System.out.println("Fázik");
          } else{
               System.out.println("Ideális állapot");
          }
     }

     @Override
     public void makeSound() {
          System.out.println("sssszzzzzz");
     }
     
     
}
