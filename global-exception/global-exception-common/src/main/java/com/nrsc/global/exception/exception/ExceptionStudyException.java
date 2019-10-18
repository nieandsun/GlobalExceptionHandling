package com.nrsc.global.exception.exception;


import com.nrsc.global.exception.enums.ResultEnum;
import lombok.Getter;

/**
 * @author : Sun Chuan
 * @date : 2019/10/18 22:21
 * Description：
 */
@Getter
public class ExceptionStudyException  extends RuntimeException{

    private Integer code;

    public ExceptionStudyException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public ExceptionStudyException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
