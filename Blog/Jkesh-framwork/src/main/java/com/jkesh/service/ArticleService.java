package com.jkesh.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jkesh.domain.ResponseResult;
import com.jkesh.domain.entity.Article;

public interface ArticleService extends IService<Article> {
    ResponseResult hotArticleList();
}
