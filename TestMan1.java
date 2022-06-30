import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestMan1 {

        @DataProvider(name = "age man")
        public static Object[][] RetiredMan() {
            return new Object[][]{{53}};
        }

    @Test(dataProvider = "age man")
    public void Retired(int age) {

        Man man = new Man("Vladimir", "Popov", 53);

        boolean retired = man.isRetired();

        Assert.assertFalse(retired);
    }

    @DataProvider(name = "last name + past last name")
    public Object[][] getRegisterPartnership() {
        return new Object[][]{{"Popov"}, {"Popova"}};
    }


    @Test(dataProvider = "last name + past last name")
    public void registerPartnership(String lastName,String pastLastName ) {
        Man man = new Man("Vladimir", "Popov", 53);
        Woman woman = new Woman("Elena", "Popova", 42);

        woman.setPartner(man);

        woman.registerPartnership();

        lastName = woman.getLastName();
         pastLastName = woman.getPastLastName();

        Assert.assertEquals("Popov", lastName);
        Assert.assertEquals("Popova", pastLastName);

    }


    @DataProvider(name = "Get last name")
    public Object[][] GetLastnameMan() {
        return new Object[][]{{"Popov"}};
    }

    @Test(dataProvider = "Get last name")
    public void GetLastname(String lastName) {
        Man man = new Man("Vladimir", "Popov", 53);

        lastName = man.getLastName();

        Assert.assertEquals("Popov", lastName);
    }

    @DataProvider(name = "Set partner Woman")
    public Object[][] SetPartnerWoman() {
        return new Object[][]{{"Popov"}};
    }

    @Test(dataProvider = "Set partner Woman")
    public void SetPartner(String lastName){
        Man man = new Man("Vladimir", "Popov", 53);
        Woman woman = new Woman("Elena", "Popova", 42);
        man.setPartner(woman);
        woman.setPartner(man);

        Person partner = woman.getPartner();

        Assert.assertEquals("Popov", partner.getLastName());
    }
}
