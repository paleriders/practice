package com.atlearn.practice.entity;

import com.atlearn.practice.enums.ResultEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> {

    private Integer code;

    private String msg;

    private T data;

    public Result(ResultEnum resultEnum) {
        this.code = resultEnum.getCode();
        this.msg = resultEnum.getMsg();
    }

    public Result<T> success(T data){
        Result<T> result = new Result<>(ResultEnum.ok);
        result.setData(data);
        return result;
    }

    public Result<T> error(T data){
        Result<T> result = new Result<>(ResultEnum.error);
        result.setData(data);
        return result;
    }
}
