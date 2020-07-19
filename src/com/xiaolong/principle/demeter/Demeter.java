package com.xiaolong.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/19 9:19
 */

public class Demeter {
    public static void main(String[] args) {
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployee(new CollegeManager());
    }
}

//学校总部员工类
class Employee{
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

//学校的员工类
class CollegeEmployee{
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

//管理学院员工的管理类
class CollegeManager{

    public List<CollegeEmployee> getAllEmployee(){
        List<CollegeEmployee> list = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            CollegeEmployee collegeEmployee = new CollegeEmployee();
            collegeEmployee.setId("学院员工id"+ i);
            list.add(collegeEmployee);
        }
        return list;
    }
}

//学校管理类
class SchoolManager{

    public List<Employee> getAllEmployee(){
        List<Employee> list = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            Employee employee = new Employee();
            employee.setId("学校员工id"+ i);
            list.add(employee);
        }
        return list;
    }

    //输出学院员工和学校员工信息
    //这里出现的问题是：这里CollegeManager是别的类的对象，不是直接朋友，违反了迪米特法则
    public void printAllEmployee(CollegeManager sub){

        //输出学院员工
        List<CollegeEmployee> allEmployee = sub.getAllEmployee();
        for (int i = 0; i < allEmployee.size(); i++) {
            System.out.println(allEmployee.get(i).getId());
        }

        //输出学校员工
        List<Employee> allEmployee1 = this.getAllEmployee();
        for (int i = 0; i < allEmployee1.size(); i++) {

            System.out.println(allEmployee1.get(i).getId());
        }

    }
}

