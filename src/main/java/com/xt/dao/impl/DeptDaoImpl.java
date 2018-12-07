package com.xt.dao.impl;

import com.xt.dao.DeptDaoI;
import com.xt.pojo.Dept;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * 部门信息的dao实现类
 */
@Repository
public class DeptDaoImpl implements DeptDaoI {

    @Resource
    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public List<Dept> getAll() {
        return sqlSessionTemplate.selectList("com.xt.mapper.DeptMapper.getAll");
    }
}
