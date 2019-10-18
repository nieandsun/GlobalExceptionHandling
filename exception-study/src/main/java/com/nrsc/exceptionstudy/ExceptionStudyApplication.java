package com.nrsc.exceptionstudy;

import com.nrsc.exceptionstudy.enums.ResultEnum;
import com.nrsc.exceptionstudy.exception.ExceptionStudyException;
import com.nrsc.exceptionstudy.util.ResultVOUtil;
import com.nrsc.exceptionstudy.vo.ResultVO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ExceptionStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExceptionStudyApplication.class, args);
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
