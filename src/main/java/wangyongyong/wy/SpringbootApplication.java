package wangyongyong.wy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import wangyongyong.wy.bean.BeanTest;
import wangyongyong.wy.configuration.MainConfiguration;
import wangyongyong.wy.configuration.TestConfiguration;

@SpringBootApplication
@ServletComponentScan
public class SpringbootApplication {

    public static void main(String[] args) throws Exception {
        ApplicationContext context = SpringApplication.run(SpringbootApplication.class, args);
        //AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfiguration.class);
        //BeanTest test = context.getBean(BeanTest.class);
        //System.out.println(test.getBean1());
    }
}


