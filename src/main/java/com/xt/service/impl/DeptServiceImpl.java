package com.xt.service.impl;

import com.xt.dao.DeptDaoI;
import com.xt.pojo.Dept;
import com.xt.service.DeptServiceI;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 部门信息的业务层 实现类
 */
@Service
public class DeptServiceImpl implements DeptServiceI {
    @Resource
    private DeptDaoI deptDao;

    @Override
    public List<Dept> getAll() {
        return deptDao.getAll();
    }
}
