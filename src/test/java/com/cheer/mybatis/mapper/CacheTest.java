package com.cheer.mybatis.mapper;

import com.cheer.mybatis.model.Emp;
import org.junit.Test;

import java.util.List;

public class CacheTest extends  AbstractMapperTest{
    @Test
    public void cache(){
        EmpMapper empMapper = this.session.getMapper(EmpMapper.class);
        //第一次查询，查询了数据库（sql产生），并且将数据缓存起来
        List<Emp> empList = empMapper.getList();

        //第二次查询，不需要查询数据库，直接使用缓存里的数据
        List<Emp> empList1 = empMapper.getList();
    }

    @Test
    public void cache1(){
        EmpMapper empMapper = this.session.getMapper(EmpMapper.class);
        //第一次查询，查询了数据库（sql产生），并且将数据缓存起来
        List<Emp> empList = empMapper.getList();

        for (Emp emp : empList) {
            if (emp.getEmpNo() == 7369){
                emp.setCom(999.0);
                //更新数据库的数据 系统自动清除缓存
                empMapper.update(emp);
            }
        }

        //第二次查询 缓存不在了 所以再次查询数据库
        List<Emp> empList1 = empMapper.getList();
    }
}
