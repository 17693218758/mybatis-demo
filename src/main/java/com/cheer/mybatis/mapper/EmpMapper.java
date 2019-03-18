package com.cheer.mybatis.mapper;

import com.cheer.mybatis.model.Emp;

import java.util.List;

public interface EmpMapper {
    Emp getEmp(Integer empNo);

    List<Emp> getList();

    int insert(Emp emp);

    int update(Emp emp);

    int delete(Integer empNo);

    int getCount();
}
