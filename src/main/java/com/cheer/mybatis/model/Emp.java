package com.cheer.mybatis.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Emp {
    private Integer empNo;
    private  String eName;
    private  String job;
    private  Integer mgr;
    private  String hireDate;
    private  Double sal;
    private  Double com;
    private  Integer deptNo;

    public Emp(){
    }

    public Emp(Integer empNo, String eName, String job, Integer mgr, String hireDate, Double sal, Double com, Integer deptNo) {
        this.empNo = empNo;
        this.eName = eName;
        this.job = job;
        this.mgr = mgr;
        this.hireDate = hireDate;
        this.sal = sal;
        this.com = com;
        this.deptNo = deptNo;
    }

    public Integer getEmpNo() {
        return empNo;
    }

    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

    public String getEName() {
        return eName;
    }

    public void setEName(String eName) {
        this.eName = eName;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Integer getMgr() {
        return mgr;
    }

    public void setMgr(Integer mgr) {
        this.mgr = mgr;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public Double getSal() {
        return sal;
    }

    public void setSal(Double sal) {
        this.sal = sal;
    }

    public Double getCom() {
        return com;
    }

    public void setCom(Double com) {
        this.com = com;
    }

    public Integer getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(Integer deptNo) {
        this.deptNo = deptNo;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("empNo", empNo)
                .append("eName", eName)
                .append("job", job)
                .append("mgr", mgr)
                .append("hireDate", hireDate)
                .append("sal", sal)
                .append("com", com)
                .append("deptNo", deptNo)
                .toString();
    }
}
