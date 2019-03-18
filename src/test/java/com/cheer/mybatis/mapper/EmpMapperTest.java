package com.cheer.mybatis.mapper;

import com.cheer.mybatis.model.Emp;
import static  org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

public class EmpMapperTest extends AbstractMapperTest{
    @Test
    public void getEmp(){
       EmpMapper empMapper = session.getMapper(EmpMapper.class);
       Emp emp = empMapper.getEmp(7369);

       assertNotNull(emp);
       System.out.println(emp);
    }

    @Test
    public  void getList() {
        EmpMapper empMapper = this.session.getMapper(EmpMapper.class);
        List<Emp> empList = empMapper.getList();

        assertEquals(14, empList.size());
    }

    @Test
    public void insert() {
        EmpMapper empMapper = this.session.getMapper(EmpMapper.class);
        Emp emp = new Emp();
        emp.setEmpNo(8888);
        emp.setEName("JORDAN");
        emp.setDeptNo(30);
        int result = empMapper.insert(emp);

        assertEquals(1, result);
    }

    @Test
    public void update() {
        EmpMapper empMapper = this.session.getMapper(EmpMapper.class);
        Emp emp = empMapper.getEmp(8888);
        emp.setEName("KOBE");
        int result = empMapper.update(emp);

        assertEquals(1,result);
    }

    @Test
    public  void delete() {
        EmpMapper empMapper = this.session.getMapper(EmpMapper.class);
        int result = empMapper.delete(8888);

        assertEquals(1, result);
    }

    @Test
    public  void getCount(){
        EmpMapper empMapper = this.session.getMapper(EmpMapper.class);
        int count = empMapper.getCount();

        assertEquals(14, count);
    }
}
