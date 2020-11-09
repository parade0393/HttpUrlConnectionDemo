package me.parade.httpurlconnectiondemo;

import java.io.InputStream;

/**
 * @author : fu
 * date : 2020/11/9
 * description:响应数据封装
 */
public class RealResponse {
    /** 正常情况下的输入流 */
    public InputStream inputStream;
    public InputStream errorStream;
    /** 响应码 */
    public int code;
    /** 下载文件时的文件的总大小 */
    public long contentLength;
    /** 异常 */
    public Exception exception;

}
