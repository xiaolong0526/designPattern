package com.xiaolong.principle.demeter.improve;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/19 9:53
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 对违反迪米特原则进行改进：避免类中出现非直接朋友关系的耦合
 */
public class Demeter {
    public static void main(String[] args) {

    }
}

//学校员工类
class Employee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

//学院员工类
class CollegeEmployee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

//学院员工管理
class CollegeManager {

    public List<CollegeEmployee> getAllEmployee(){
        List<CollegeEmployee> list = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            CollegeEmployee collegeEmployee = new CollegeEmployee();
            collegeEmployee.setId("学院员工id" + i);
            list.add(collegeEmployee);
        }
        return list;
    }

    public void printAllEmployee(){
        List<CollegeEmployee> allEmployee = getAllEmployee();
        System.out.println("输出学院员工");
        for (int i = 0; i < allEmployee.size(); i++) {
            System.out.println(allEmployee.get(i).getId());
        }
    }
}

class SchoolManager {
    public List<Employee> getAllEmployee() {
        List<Employee> list = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            Employee employee = new Employee();
            employee.setId("学校员工id" + i);
            list.add(employee);
        }
        return list;
    }

    //输出学校员工和学院员工
    public void printAllEmployee(CollegeManager sub){

        //改进：之前是获取学院员工，在这里进行操作输出；现在改进为将输出操作封装到CollegeManager中
        //降低类之间的耦合
        sub.printAllEmployee();

        List<Employee> allEmployee = this.getAllEmployee();
        for (int i = 0; i < allEmployee.size(); i++) {
            System.out.println("输出学校员工");
            System.out.println(allEmployee.get(i).getId());
        }
    }
}