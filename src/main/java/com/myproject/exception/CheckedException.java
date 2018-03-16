package com.myproject.exception;

/**
 * 校验错误异常类
 *
 * @author lijinzao
 * @date 2018/3/14 14:44
 **/
public class CheckedException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    /**
     * 错误编码
     */
    private String errorCode;

    public CheckedException() {
        super();
    }

    /**
     * 构造一个基本异常.
     *
     * @param message 信息描述
     */
    public CheckedException(String message) {
        super(message);
    }


    /**
     * 构造一个基本异常.
     *
     * @param errorCode 错误编码
     * @param message   信息描述
     */
    public CheckedException(String errorCode, String message) {
        super(message);
        this.setErrorCode(errorCode);
    }

    /**
     * 构造一个基本异常.
     *
     * @param errorCode 错误编码
     * @param message   信息描述
     */
    public CheckedException(String errorCode, String message, Throwable cause) {
        super(message, cause);
        this.setErrorCode(errorCode);
    }

    /**
     * 构造一个基本异常.
     *
     * @param message 信息描述
     * @param cause   根异常类（可以存入任何异常）
     */
    public CheckedException(String message, Throwable cause) {
        super(message, cause);
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
