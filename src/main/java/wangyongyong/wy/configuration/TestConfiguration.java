package wangyongyong.wy.configuration;

import org.springframework.context.annotation.Bean;
import wangyongyong.wy.bean.Bean1;
import wangyongyong.wy.bean.BeanTest;

/**
 * Created by wangyongyong.wy on 17/6/28.
 */
public class TestConfiguration {
    @Bean
    private BeanTest beanTest() {
        return new BeanTest("bean testss");
    }

    @Bean
    Bean1 bean1() {
        return new Bean1();
    }
}
