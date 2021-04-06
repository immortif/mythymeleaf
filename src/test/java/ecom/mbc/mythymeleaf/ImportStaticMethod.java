package ecom.mbc.mythymeleaf;

import static ecom.mbc.mythymeleaf.StaticClass.*;

import org.junit.Test;

public class ImportStaticMethod {

    @Test
    public void staticMethodTest() {
        System.out.println(getName() + " new object calls static method");
        System.out.println(getName() + " not import static");
        System.out.println();
    }

}
