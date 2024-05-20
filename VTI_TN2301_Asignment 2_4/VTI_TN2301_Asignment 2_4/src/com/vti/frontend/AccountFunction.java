package com.vti.frontend;

import com.vti.backend.presentationlayer.AccountController;
import com.vti.entity.Account;

import java.io.IOException;
import java.util.List;

public class AccountFunction {
    private AccountController accountController;

    public AccountFunction() throws IOException {
        accountController = new AccountController();
    }

    public void showListAccount() {
        System.out.println("Danh sách Account trên hệ thống");
        List<Account> accountList = accountController.getListAccount();
//        Hiển thị
        
    }
}
