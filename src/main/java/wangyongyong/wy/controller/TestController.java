package wangyongyong.wy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangyongyong.wy on 17/1/22.
 */
@RestController
public class TestController {

    @RequestMapping("test")
    public boolean test() {
        return false;
    }

}
