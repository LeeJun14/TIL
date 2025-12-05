package com.example.collectiontest;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> cart = new ArrayList<>();

    public void addProduct(Product product) {
        cart.add(product);
        System.out.println(product.getName() + "가 장바구니에 추가되었습니다");
    }

    public void removeProduct(String productName) {
        boolean removed = false;

        for (Product product : cart) {
            if (product.getName().equals(productName)) {
                cart.remove(product);
                removed = true;
                System.out.println(product.getName() + "가 장바구니에서 제거 되었습니다.");
                break;
            }
        }
        if (!removed) {
            System.out.println("해당 상품이 장바구니에 없습니다.");
        }
    }

    public void printCart() {
        if (cart.isEmpty()) {
            System.out.println("장바구니가 비어 있습니다.");
        } else {
            for (Product product : cart) {
                System.out.println(product.getName() + ": " + product.getPrice());
            }
        }
    }


    public void calculateTotalPrice() {
        int total = 0;

        for (Product product : cart) {
            total += product.getPrice();
        }
        System.out.println("총 금액은: " + total);
    }
}
