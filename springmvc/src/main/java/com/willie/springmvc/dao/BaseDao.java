package com.willie.springmvc.dao;

import java.util.List;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/2/24 16:14</p>
 */
public interface BaseDao<T> {

    /**
     * 查询全部
     *
     * @return
     */
     List<T> findAll();

    /**
     * 单个增加
     *
     * @param t
     */
     void addOne(T t);

    /**
     * 批量增加
     *
     * @param list
     * @return
     */
     void batchAdd(List<T> list);

    /**
     * 单个修改
     *
     * @param t
     */
     void modifyOne(T t);

    /**
     * 批量修改
     *
     * @param list
     */
     void batchModify(List<T> list);

    /**
     * 删除
     *
     * @param t
     */
     void removeOne(T t);

    /**
     * 根据id删除
     *
     * @param id
     */
     void removeById(Long id);

    /**
     * 批量删除
     *
     * @param list
     */
     void batchRemove(List<T> list);

}
