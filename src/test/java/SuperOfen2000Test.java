import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuperOfen2000Test {

    @Test
    void testOfen() {
        //GIVEN
        OfenKaputtException ex = assertThrows(OfenKaputtException.class, () -> {SuperOfen2000.backe("test-pizza");});
        assertEquals("Feuer, Rauch und Funken", ex.getMessage());

        System.out.println(ex);
    }

}
