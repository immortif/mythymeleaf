package ecom.mbc.mythymeleaf;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Test;

import ecom.mbc.mythymeleaf.pojo.User;

public class DateTest {

    @Test
    public void test() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.toPattern());
        // User user = new User();
        // user.setName("mbc");
        // user.setAge(11);
        // user.setBirthday(sdf.parse("1987-02-19 11:11:11"));
        // System.out.println(user);
    }
}
