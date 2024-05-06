class Andi {
    static String lieferPizza() {
        System.out.println("Andi: Ich fahre zu Bella");
        String pizza = "";

        try {
            pizza = Bella.machPizza();
        }
        catch (OfenKaputtException  exception) {
            throw new RuntimeException("Ofen ist kaputt, Nudel gibt es aber", exception);
        }
        catch (RuntimeException exception) {
            System.out.println("TEST");
        }


        System.out.println("Andi: Liefere fertige Pizza aus");
        return pizza;
    }
}
