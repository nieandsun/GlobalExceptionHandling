package com.nrsc.exceptionstudy.handle;

import com.nrsc.exceptionstudy.exception.ExceptionStudyException;
import com.nrsc.exceptionstudy.util.ResultVOUtil;
import com.nrsc.exceptionstudy.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author : Sun Chuan
 * @date : 2019/10/18 22:26
 * Description：
 */
@Slf4j
@ControllerAdvice
public class ExceptionHandle {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResultVO handle(Exception e) {
        //处理自定义异常
        if (e instanceof ExceptionStudyException) {
            ExceptionStudyException exceptionStudyException = (ExceptionStudyException) e;
            return ResultVOUtil.error(exceptionStudyException.getCode(), exceptionStudyException.getMessage());
        }
        //处理未知异常
        else {
            log.error("【系统异常】{}", e);
            return ResultVOUtil.error(-1, "未知错误");
        }
    }
}
