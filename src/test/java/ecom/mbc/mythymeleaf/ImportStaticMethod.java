package ecom.mbc.mythymeleaf;

import static ecom.mbc.mythymeleaf.StaticClass.*;

import org.junit.Test;

public class ImportStaticMethod {

    @Test
    public void staticMethodTest() {
        // StaticClass staticClass = new StaticClass();
        System.out.println(staticClass.getName() + " new object calls static method");
        System.out.println(StaticClass.getName() + " not import static");
        System.out.println();
    }

}
