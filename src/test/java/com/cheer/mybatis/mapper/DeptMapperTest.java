package com.cheer.mybatis.mapper;

import com.cheer.mybatis.model.Dept;
import com.cheer.mybatis.model.Emp;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DeptMapperTest extends AbstractMapperTest{
    @Test
    public void getDept(){
        DeptMapper deptMapper = session.getMapper(DeptMapper.class);
        Dept dept = deptMapper.getDept(40);

        assertNotNull(dept);
        System.out.println(dept);
    }

    @Test
    public void getList(){
        DeptMapper deptMapper = this.session.getMapper(DeptMapper.class);
        List<Dept> deptList = deptMapper.getList();

        assertEquals(4, deptList.size());
    }

    @Test
    public void insert(){
        DeptMapper deptMapper = this.session.getMapper(DeptMapper.class);
        Dept dept = new Dept();
        dept.setDeptNo(50);
        dept.setDName("NEW-1");
        dept.setLoc("KUNSHANG");
        int result = deptMapper.insert(dept);

        assertEquals(1, result);
    }

    @Test
    public void update(){
        DeptMapper deptMapper = this.session.getMapper(DeptMapper.class);
        Dept dept = deptMapper.getDept(50);
        dept.setDName("NEW-1-1");
        int result = deptMapper.update(dept);

        assertEquals(1, result);
    }

    @Test
    public void delete(){
        DeptMapper deptMapper = this.session.getMapper(DeptMapper.class);
        int result = deptMapper.delete(50);

        assertEquals(1, result);
    }

    @Test
    public void getCount(){
        DeptMapper deptMapper = this.session.getMapper(DeptMapper.class);
        int count = deptMapper.getCount();

        assertEquals(4, count);
    }
}
