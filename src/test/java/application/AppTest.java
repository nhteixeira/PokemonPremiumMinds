package application;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import io.IOHandler;
import org.junit.Before;
import org.junit.Test;
import person.Person;

/**
 * Unit test for simple App.
 */
public class AppTest {

    private IOHandler ioHandler;
    private Person ash;

    @Before
    public void setup(){
        this.ioHandler = new IOHandler();
        this.ash = new Person("Ash");
    }

    @Test
    public void testValidInput(){
        String input = "E";
        ioHandler.manageInput(input, ash);
        int result = 2;
        assertEquals(result, ash.getPokemonCatches());
    }

    @Test
    public void testValidInput2(){
        String input = "NESO";
        ioHandler.manageInput(input, ash);
        int result = 4;
        assertEquals(result, ash.getPokemonCatches());
    }

    @Test
    public void testValidInput3(){
        String input = "NSNSNSNSNS";
        ioHandler.manageInput(input, ash);
        int result = 2;
        assertEquals(result, ash.getPokemonCatches());
    }

    @Test
    public void testValidInput4(){
        String input = "OOENSOESOSSSNEONNS";
        ioHandler.manageInput(input, ash);
        int result = 10;
        assertEquals(result, ash.getPokemonCatches());
    }

    @Test
    public void testValidInput5(){
        String input = "OOOO" +
                "NNNN" +
                "EEEE" +
                "SSSS" +
                "OSEN" +
                "SOOO" +
                "SNSO" +
                "ESOO" +
                "OSEN" +
                "NNNO" +
                "SEEE";
        ioHandler.manageInput(input, ash);
        int result = 34;
        assertEquals(result, ash.getPokemonCatches());
    }

    @Test
    public void testValidInput6(){
        String input = "OOOOOOO" +
                "NNNN" +
                "OO" +
                "SSSS" +
                "EEEE" +
                "NNNNNNN" +
                "EEE" +
                "S" +
                "OOOOOO" +
                "NNN" +
                "EEEE";
        ioHandler.manageInput(input, ash);
        int result = 42;
        assertEquals(result, ash.getPokemonCatches());
    }

    @Test
    public void testInvalidInput(){
        String input = "3141";
        ioHandler.manageInput(input, ash);
        int result = 1;
        assertEquals(result, ash.getPokemonCatches());
    }

    @Test
    public void testInvalidInput2(){
        String input = "";
        ioHandler.manageInput(input, ash);
        int result = 1;
        assertEquals(result, ash.getPokemonCatches());
    }
}
