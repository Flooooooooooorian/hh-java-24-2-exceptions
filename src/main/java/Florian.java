class Florian {
    public static void main(String[] args) {
        System.out.println("Florian: Ich will eine Pizza");
        String pizza;

        try {
            pizza = Andi.lieferPizza();
        }
        catch (RuntimeException exception) {
            pizza = "Dosen Ravioli";
        }
        finally {
            System.out.println("Finally");
        }

        System.out.println("Florian: Ich esse " + pizza);
    }
}
