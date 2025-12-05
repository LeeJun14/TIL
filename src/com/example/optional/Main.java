package com.example.optional;

import java.util.Optional;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CampService camp = new CampService();


        System.out.println("찾는 학생의 이름을 입력하세요,");
        String name = sc.nextLine();
        Optional<Student> optional = camp.getStudent(name);
        boolean flag = optional.isPresent();

        if (flag) {
            Student student = optional.get();
            String studentName = student.getName();
            System.out.println(studentName);
        } else {
            System.out.println("학생이 데이터가 없습니다.");
        }

    }
}
