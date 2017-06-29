package wangyongyong.wy.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import wangyongyong.wy.interceptor.Interceptor1;

/**
 * Created by wangyongyong.wy on 17/6/28.
 */
@Configuration
public class InterceptorConfiguration extends WebMvcConfigurerAdapter {
    @Bean
    public Interceptor1 interceptor1() {
      return new Interceptor1();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(interceptor1()).addPathPatterns("/**");
    }
}
