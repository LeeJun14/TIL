package com.example.trycatchtest;

import java.util.Scanner;

public class Trycatchtest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            try{
                System.out.println("사용자 아이디를 입력하세요.");
                String username = sc.nextLine();
                System.out.println("사용자 패스워드를 입력하세요.");
                String password = sc.nextLine();

                login(username,password);
                System.out.println("로그인 성공.");
                break;
            } catch(Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }

    public static void login(String username, String password) throws Exception{
        if(!username.equals("admin") || !password.equals("1234")) {
            throw new Exception("로그인 실패. 아이디 또는 패스워드가 잘못되었습니다.");
        }
    }
}
