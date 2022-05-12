
package allatkert;

import java.time.LocalDate;


public class Allatkert {


     public static void main(String[] args) {
         
          Husevo husevo1= new Husevo(true, "tarajos", 4, 14, "elevenszülő", 8, LocalDate.parse("2020-05-04"), LocalDate.parse("2020-05-30"), "Sanyi", "fekete");
          Husevo husevo2= new Husevo(false,"tarajos", 4, 5, "elevenszülő", 2, LocalDate.parse("2020-05-04"), LocalDate.parse("2020-06-02"), "Éva", "barna");

         
          husevo1.besorolas();
          
     }
     
}
