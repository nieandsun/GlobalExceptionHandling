package com.nrsc.global.exception;

import com.nrsc.global.exception.enums.ResultEnum;
import com.nrsc.global.exception.exception.ExceptionStudyException;
import com.nrsc.global.exception.util.ResultVOUtil;
import com.nrsc.global.exception.vo.ResultVO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Sun Chuan
 * @date : 2019/10/18 23:19
 * Description：
 */
@RestController
@SpringBootApplication
public class GlobalException1Controller {

    public static void main(String[] args) {
        SpringApplication.run(GlobalException1Controller.class, args);
    }

    @GetMapping("/ping")
    public ResultVO<String> ping() {
        return ResultVOUtil.success("pong");
    }

    @GetMapping("/exception")
    public ResultVO exceptionTest() {
        throw new ExceptionStudyException(ResultEnum.PARAM_ERROR);
    }


}
