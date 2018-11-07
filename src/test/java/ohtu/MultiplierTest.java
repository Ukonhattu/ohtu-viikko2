package ohtu;

import static org.junit.Assert.*;
import org.junit.Test;

public class MultiplierTest{

    @Test
    public void kertominenToimii() {
        Multiplier viisi = new Multiplier(5);

        assertEquals(5, viisi.multiplieBy(1));
        assertEquals(35, viisi.multiplieBy(7));
    }
}