package wangyongyong.wy.commandLineRunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by wangyongyong.wy on 17/6/28.
 */
@Component
public class MyCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("<<<<<<<" + this.getClass() + ">>>>>>>>>");
    }
}
