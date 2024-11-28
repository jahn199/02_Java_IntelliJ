package example.practice7.model.vo.run;

import example.practice7.model.vo.Employee;

public class EmployeeRun {
    public static void main(String[] args) {
        Employee e = new Employee(100,"홍길동","영업부","과장",25,'남',2500000,0.05,"010-1234-5678","서울시 강남구");

        Employee employee2 = new Employee();
        employee2.setEmpNo(100);
        employee2.setEmpName("홍길동");
        employee2.setDept("영업부");
        employee2.setJob("과장");
        employee2.setAge(25);
        employee2.setGender('남');
        employee2.setSalary(2500000);
        employee2.setPhone("010-1234-5678");
        employee2.setAddress("서울시 강남구");

        System.out.println(e);
        System.out.println(employee2);

    }
}
