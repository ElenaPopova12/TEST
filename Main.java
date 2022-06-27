public class Main {
    public static void main(String[] args) {
        Person man = new Man("Vladimir","Popov",53);
        Person woman = new Woman("Elena","Popova",42);

        man.setPartner(woman);
        woman.setPartner(man);

        woman.registerPartnership();

        System.out.println(woman.isRetired());

        System.out.println(woman);

    }
}
