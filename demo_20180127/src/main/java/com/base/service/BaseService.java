package com.base.service;

import com.base.entity.BaseEntity;
import com.base.mapper.BaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *
 * @param <T>
 * @param <E>
 * 提供抽象类，service只需集成该类即可拥有增、删、改、查等公共方法
 *
 */
@Service
@Transactional
public abstract class BaseService<T extends BaseMapper<E>, E extends BaseEntity> {

    @Autowired
    protected T mapper;

    public void add(E e){
        mapper.add(e);
    }

    public T getMapper() {
        return mapper;
    }

    public void setMapper(T mapper) {
        this.mapper = mapper;
    }

    public void del(E e){
        mapper.del(e);

    }

    public void update(E e){
        mapper.update(e);
    }

    public List<E> findList(E e){
        return mapper.findList(e);
    }
}
