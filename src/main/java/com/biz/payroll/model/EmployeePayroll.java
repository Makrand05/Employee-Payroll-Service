package com.biz.payroll.model;

import java.util.ArrayList;
import java.util.List;

public class EmployeePayroll {
    private int EmpId;
    private String EmployeeName;
    private long EmpSalary;

    public EmployeePayroll(int empId, String employeeName, long empSalary) {
        EmpId = empId;
        EmployeeName = employeeName;
        EmpSalary = empSalary;
    }


    public EmployeePayroll() {

    }

    @Override
    public String toString() {
        return "EmployeePayroll{" +
                "EmpId=" + EmpId +
                ", EmployeeName='" + EmployeeName + '\'' +
                ", EmpSalary=" + EmpSalary +
                '}';
    }

    public int getEmpId() {
        return EmpId;
    }

    public void setEmpId(int empId) {
        EmpId = empId;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public long getEmpSalary() {
        return EmpSalary;
    }

    public void setEmpSalary(long empSalary) {
        EmpSalary = empSalary;
    }

}
