package com.sky.service;

import com.sky.dto.SetmealDTO;
import com.sky.dto.SetmealPageQueryDTO;
import com.sky.result.PageResult;
import com.sky.result.Result;
import com.sky.vo.SetmealVO;

import java.util.List;

public interface SetmealService {
    //新增套餐，同时需要保存套餐和菜品的关联关系
    void saveWithDish(SetmealDTO setmealDTO);
    //分页查询
    PageResult pageQuery(SetmealPageQueryDTO setmealPageQueryDTO);

    Result<Object> deleteBatch(List<Long> ids);

    //根据id查询套餐和关联的菜品数据
    SetmealVO getByIdWithDish(Long id);

    //修改套餐
    void update(SetmealDTO setmealDTO);

    void startOrStop(Integer status, Long id);
}
