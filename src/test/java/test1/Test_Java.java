package test1;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

import hello.main.HelloWorld;

public class Test_Java {

    @Test
    public void testGetColor1() {
        HelloWorld c1 = new HelloWorld();
        String t1 = c1.getColor(1);
        assertThat(t1,is("赤"));
    }
    @Test
    public void testGetColor2() {
    	HelloWorld c1 = new HelloWorld();
        String t1 = c1.getColor(2);
        assertThat(t1,is("青"));
    }
    @Test
    public void testGetColor3() {
    	HelloWorld c1 = new HelloWorld();
        String t1 = c1.getColor(3);
        assertThat(t1,is("1or2を入力して下さい"));
    }
}