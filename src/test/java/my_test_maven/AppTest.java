package my_test_maven;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import my_test_maven.App;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        App app = new App();
        assertTrue( app.sample_output() == "This is a test string" );
    }
}
