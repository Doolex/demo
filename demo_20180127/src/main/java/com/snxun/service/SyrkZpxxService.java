package com.snxun.service;

import com.base.service.BaseService;
import com.snxun.entity.SyrkZpxx;
import com.snxun.mapper.SyrkZpxxMapper;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class SyrkZpxxService extends BaseService<SyrkZpxxMapper, SyrkZpxx> {

    @Override
    public void add(SyrkZpxx syrkZpxx) {
        super.add(syrkZpxx);
    }

    @Override
    public void del(SyrkZpxx syrkZpxx) {
        super.del(syrkZpxx);
    }

    @Override
    public void update(SyrkZpxx syrkZpxx) {
        super.update(syrkZpxx);
    }

    @Override
    public List<SyrkZpxx> findList(SyrkZpxx syrkZpxx) {
        return super.findList(syrkZpxx);
    }
}
