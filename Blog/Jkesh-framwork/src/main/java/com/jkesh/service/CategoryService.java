package com.jkesh.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jkesh.domain.ResponseResult;
import com.jkesh.domain.entity.Category;


/**
 * 分类表(Category)表服务接口
 *
 * @author makejava
 * @since 2023-07-16 11:46:41
 */
public interface CategoryService extends IService<Category> {

    ResponseResult getCategoryList();
}
