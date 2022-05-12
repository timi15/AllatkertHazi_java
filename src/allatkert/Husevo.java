
package allatkert;

import java.time.LocalDate;
import java.util.Objects;

public class Husevo  extends Emlos implements Comparable<Husevo>{
     
   private boolean dogevo;
   private String nev;
   private String szorzet;

     public Husevo(boolean dogevo, String fogazat, int labakSzama, int kor, String szaporodas, int ehes, LocalDate kolcsonAdas, LocalDate kolcsonVeves,String nev, String szorzet) {
          super(fogazat, labakSzama, kor, szaporodas, ehes, kolcsonAdas, kolcsonVeves);
          this.dogevo = dogevo;
          this.nev=nev;
          this.szorzet= szorzet;
     }

     public String getNev() {
          return nev;
     }

     public void setNev(String nev) {
          this.nev = nev;
     }

     public boolean isDogevo() {
          return dogevo;
     }

     public void setDogevo(boolean dogevo) {
          this.dogevo = dogevo;
     }

     public String getSzorzet() {
          return szorzet;
     }

     public void setSzorzet(String szorzet) {
          this.szorzet = szorzet;
     }
     
     

     @Override
     public void makeSound() {
          System.out.println("raaar");
     }

     @Override
     public int hashCode() {
          int hash = 5;
          hash = 23 * hash + Objects.hashCode(this.nev);
          return hash;
     }

     @Override
     public boolean equals(Object obj) {
          if (this == obj) {
               return true;
          }
          if (obj == null) {
               return false;
          }
          if (getClass() != obj.getClass()) {
               return false;
          }
          final Husevo other = (Husevo) obj;
          return Objects.equals(this.nev, other.nev);
     }

     @Override
     public int compareTo(Husevo o) {
          
          int  result = this.nev.compareTo(o.nev);
        
        if(result ==0){
            result= this.szorzet.compareTo(o.nev);
            
        }
        return result;
     }
     
     
     
     
     
   
   
}
