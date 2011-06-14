package net.sourceforge.openarch.junit;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

import net.sourceforge.openarch.junit.Parameterized.NonParameterized;
import net.sourceforge.openarch.junit.Parameterized.Parameters;

import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(value = Parameterized.class)
public class TestNoParameters extends AbstractTestParameterized {

    public TestNoParameters() {
    }

    public TestNoParameters(int param) {
        super(param);
    }

    @NonParameterized
    @Test
    public void testNonParameterized() {
        test();
    }

    @Test
    public void testParameterized() throws IOException {
        test();
    }

    /*
     * For running the tests for all parameters
     */
    @Parameters
    public static Collection getLayoutVersions() {
        Object[][] data = new Object[][] {};
        return Arrays.asList(data);
    }
}
