import org.testng.Assert;
import org.testng.annotations.Test;

 public class TestMan {

     @Test
     public void Retired() {
         Man instance = new Man("Vladimir", "Popov", 53);

         boolean retired = instance.isRetired();

         Assert.assertFalse(retired);

     }

     @Test
     public void registerPartnership() {
         Man man = new Man("Vladimir", "Popov", 53);
         Woman woman = new Woman("Elena", "Popova", 42);

         woman.setPartner(man);

         woman.registerPartnership();

         String lastName = woman.getLastName();
         String pastLastName = woman.getPastLastName();

         Assert.assertEquals("Popov", lastName);
         Assert.assertEquals("Popova", pastLastName);

     }

     @Test
     public void GetLastname(){
         Man man = new Man("Vladimir", "Popov", 53);

         String lastName = man.getLastName();

         Assert.assertEquals("Popov", lastName);
     }

     @Test
     public void SetPartner(){
         Man man = new Man("Vladimir", "Popov", 53);
         Woman woman = new Woman("Elena", "Popova", 42);
         man.setPartner(woman);
         woman.setPartner(man);

         Person partner = woman.getPartner();

         Assert.assertEquals("Popov", partner.getLastName());
     }
 }



