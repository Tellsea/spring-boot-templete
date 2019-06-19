package cn.tellsea.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 公共结果返回类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseResult {

    private Integer code; // 状态码，0失败，1成功

    private String message; // 消息

    private Object data; // 数据

    public ResponseResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}