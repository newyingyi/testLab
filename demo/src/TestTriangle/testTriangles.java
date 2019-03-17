package TestTriangle;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class testTriangles {

	private int a;
    private String expected;
    private String result = null;
    
    public testTriangles(int a,String expected){
        this.a = a;
        this.expected= expected;
        
        }
    
    @Parameters
    public static Collection<Object[]> getData(){
    return Arrays.asList(new Object[][]{
    {0,"true"},
    {2,"true"},
    {-1,"false"},
    {100,"false"},
    {84,"false"},
    {83,"true"},
    {54,"false"},
    {52,"true"}
    });
    }
    
    @Test
    public void test() {
    assertEquals(this.expected,triangles.take(a));
    }
    
}