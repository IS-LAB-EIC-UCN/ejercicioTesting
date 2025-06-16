import cl.ucn.modelo.Identifier;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ParticionamientoTestCase {


    private Identifier id;

    @Before
    public void setUp() {
        id = new Identifier();
    }

    @Test
    public void particionValida(){
        boolean resultado = id.validateIdentifier("a1");
        assertEquals(true,resultado);
    }

    @Test
    public void particionValida01(){
        boolean resultado = id.validateIdentifier("");
        assertEquals(true,resultado);
    }

    @Test
    public void particionValida02(){
        boolean resultado = id.validateIdentifier("A1b2C3d");
        assertEquals(false,resultado);
    }

    @Test
    public void particionValida03(){
        boolean resultado = id.validateIdentifier("2B3");
        assertEquals(false,resultado);
    }

    @Test
    public void particionValida04(){
        boolean resultado = id.validateIdentifier("Z#12");
        assertEquals(false,resultado);
    }
}
