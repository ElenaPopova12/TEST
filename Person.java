public abstract class Person {
    private String firstName;
    private String lastName;
    private String pastLastName;
    private int age;
    private Person partner;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        pastLastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPastLastName() {
        return pastLastName;
    }

    public Person getPartner() {
        return partner;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pastLastName='" + pastLastName + '\'' +
                ", age=" + age +
                ", partner lastname = " + partner.lastName +
                ", partner firstname = " + partner.firstName +
                '}';
    }

    public void setPartner(Person partner) {
        this.partner = partner;
    }

    public abstract boolean isRetired();

    public void registerPartnership() {
        this.pastLastName = lastName;
        this.lastName = partner.lastName;
    }
}
