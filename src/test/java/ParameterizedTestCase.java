import cl.ucn.modelo.Identifier;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.Arrays;

@RunWith(Parameterized.class)
public class ParameterizedTestCase {

    private static Identifier id = new Identifier();

    private String param;
    private boolean result;

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][]{
                {"Abcd5", true},
                {"x12345", true},
                {"&123", false},
                {"Inv@lido", false}
        });
    }

    public ParameterizedTestCase(String param, boolean result) {

        this.param = param;
        this.result = result;
    }

    @Test
    public void validate() {
        boolean value = id.validateIdentifier(param);
        Assert.assertEquals(result, value);
    }
}


