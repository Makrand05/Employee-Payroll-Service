package com.biz.payroll.service;

import com.biz.payroll.model.EmployeePayroll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
    private static List<EmployeePayroll> employeePayrollList=new ArrayList<>();

    public EmployeePayrollService(List<EmployeePayroll> employeePayrollList) {
        employeePayrollList=new ArrayList<>();
    }


    public static void main(String[] args) {
        List<EmployeePayroll> employeePayrollList=new ArrayList<>();
        EmployeePayrollService employeePayrollService=new EmployeePayrollService(employeePayrollList);

        employeePayrollService.readDataFromConsole();
        employeePayrollService.printDataOnConsole();
    }

    private void printDataOnConsole() {

        for (EmployeePayroll listData : employeePayrollList) {
            System.out.println(listData);
        }

    }

    private  void readDataFromConsole() {

        EmployeePayroll employeePayRoll = new EmployeePayroll();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Employee Id");
        employeePayRoll.setEmpId(scan.nextInt());
        System.out.println("Enter Employee name");
        employeePayRoll.setEmployeeName(scan.next());
        System.out.println("Enter Employee salary");
        employeePayRoll.setEmpSalary(scan.nextLong());
        employeePayrollList.add(employeePayRoll);

    }
}
