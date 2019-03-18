package com.cheer.mybatis.mapper;

import com.cheer.mybatis.model.Dept;

import java.util.List;

public interface DeptMapper {
    Dept getDept(Integer deptNo);

    List<Dept> getList();

    int insert(Dept dept);

    int update(Dept dept);

    int delete(Integer deptNo);

    int getCount();
}
