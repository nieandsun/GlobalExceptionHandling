package com.nrsc.global.exception.enums;

import lombok.Getter;

/**
 * @author : Sun Chuan
 * @date : 2019/10/18 22:24
 * Description：
 */
@Getter
public enum ResultEnum {
    SUCCESS(0, "成功"),

    PARAM_ERROR(1, "参数不正确");

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
