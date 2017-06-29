package wangyongyong.wy.bean;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by wangyongyong.wy on 17/6/27.
 */
public class BeanTest {
    String name;

    @Autowired
    private Bean1 bean1;

    public Bean1 getBean1() {
        return bean1;
    }

    public void setBean1(Bean1 bean1) {
        this.bean1 = bean1;
    }

    public BeanTest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
