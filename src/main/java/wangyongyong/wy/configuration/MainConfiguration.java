package wangyongyong.wy.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import wangyongyong.wy.bean.Bean1;
import wangyongyong.wy.bean.BeanTest;

/**
 * Created by wangyongyong.wy on 17/6/27.
 */
@Configuration
@Import(InterceptorConfiguration.class)
public class MainConfiguration {
    @Bean
    public BeanTest beanTest() {
        return new BeanTest("www");
    }

    @Bean
    public Bean1 bean1() {
        return new Bean1();
    }
}
