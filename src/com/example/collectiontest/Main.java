package com.example.collectiontest;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cart cart = new Cart();
        Product arr1 = new Product("양파", 100);
        Product arr2 = new Product("사과", 200);
        Product arr3 = new Product("생선", 300);
        Product arr4 = new Product("두부", 400);

        System.out.println("장바구니 상품 추가: ");
        cart.addProduct(arr1);
        cart.addProduct(arr2);
        cart.addProduct(arr3);
        cart.addProduct(arr4);
        System.out.println();

        System.out.println("장바구니 상품 조회: ");
        cart.printCart();
        System.out.println();

        System.out.println("장바구니 총 금액 조회: ");
        cart.calculateTotalPrice();
        System.out.println();

        System.out.println("장바구니에서 사과 제거: ");
        cart.removeProduct("사과");
        System.out.println();



    }
}
