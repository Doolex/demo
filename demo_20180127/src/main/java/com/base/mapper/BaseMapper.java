package com.base.mapper;

import java.util.List;

public interface BaseMapper<E> {

    void add(E e);

    void del(E e);

    void update(E e);

    List<E> findList(E e);
}
