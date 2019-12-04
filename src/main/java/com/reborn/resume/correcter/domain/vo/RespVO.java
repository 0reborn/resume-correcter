package com.reborn.resume.correcter.domain.vo;

import com.alibaba.fastjson.JSONObject;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 类说明：用户封装返回参数统一继承基类
 * <p>
 * 类名称: RespVO.java
 *
 * @author wu.yue
 * @version v1.0.0
 * @date 2019/10/19 15:41
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 */
@Data
@AllArgsConstructor
public class RespVO<T> implements Serializable {

    /**
     * status constants
     */
    private static final String STATUS_SUCCESS = "SUCCESS";
    private static final String STATUS_FAILURE = "FAILURE";

    /**
     * empty JSON object => {}
     */
    private static final JSONObject EMPTY_JSON_OBJECT = new JSONObject();

    private String status;
    private String msg;
    private T data;

    private RespVO() {
    }

    /**
     * {
     *     status: "SUCCESS",
     *     msg: "your msg here",
     *     data: {}
     * }
     * @param msg the success msg to send
     * @return com.reborn.resume.correcter.domain.vo.RespVO
     * @author wu.yue
     * @date 2019/11/8 9:46
     */
    public static RespVO success(String msg) {
        return new RespVO<>(STATUS_SUCCESS, msg, EMPTY_JSON_OBJECT);
    }

    /**
     * {
     *     status: "SUCCESS",
     *     msg: "your msg here",
     *     data: {
     *         // your data here
     *     }
     * }
     * @param msg the success msg to send
     * @param data the data to send
     * @return com.reborn.resume.correcter.domain.vo.RespVO
     * @author wu.yue
     * @date 2019/11/8 9:47
     */
    public static <T> RespVO success(String msg, T data) {
        return new RespVO<>(STATUS_SUCCESS, msg, data);
    }

    /**
     * {
     *     status: "FAILURE",
     *     msg: "your msg here",
     *     data: {}
     * }
     * @param msg the failure msg to send
     * @return com.reborn.resume.correcter.domain.vo.RespVO
     * @author wu.yue
     * @date 2019/11/8 9:47
     */
    public static RespVO failure(String msg) {
        return new RespVO<>(STATUS_FAILURE, msg, EMPTY_JSON_OBJECT);
    }
}