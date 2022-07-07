public class Main {
    public static void main(String[] args) {
        try {
            doSomething();
        } catch (InvalidPaymentAmountException ex) {
            System.out.println(ex.getMessage());

        }
    }

    private static void doSomething() throws InvalidPaymentAmountException {
        throw new InvalidPaymentAmountException("Negative or zero payment amount");
    }
}



