package org.example;

import proxy.BankService;
import proxy.BanqueWS;

public class Main {
    public static void main(String[] args) {
        BankService proxy = new BanqueWS().getBankServicePort();
        proxy.listCompte().forEach(cp -> {
            System.out.println(cp.getCode() + " : " + cp.getSolde());
        });
    }
}