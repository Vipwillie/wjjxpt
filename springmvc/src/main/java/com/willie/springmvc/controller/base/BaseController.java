package com.willie.springmvc.controller.base;

import com.willie.springmvc.base.response.Result;
import com.willie.springmvc.base.response.ResultType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/2/1 14:55</p>
 */
public class BaseController {
    protected static Logger logger = LoggerFactory.getLogger(BaseController.class);

    /**
     * 操作成功返回结果
     *
     * @param object 数据对象
     * @return 返回结果
     */
    public Result success(Object object) {
        Result result = new Result();
        result.setCode(ResultType.SUCCESS.getCode());
        result.setMessage(ResultType.SUCCESS.getMessage());
        result.setData(object);
        return result;
    }

    /**
     * 操作失败返回对象
     *
     * @param object 数据对象
     * @return 返回结果
     */
    public Result error(Object object) {
        Result result = new Result();
        result.setCode(ResultType.ERROR.getCode());
        result.setMessage(ResultType.ERROR.getMessage());
        result.setData(object);
        return result;
    }

}
