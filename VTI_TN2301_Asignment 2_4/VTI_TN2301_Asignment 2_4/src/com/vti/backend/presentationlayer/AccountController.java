package com.vti.backend.presentationlayer;

import com.vti.backend.businesslayer.AccountService;
import com.vti.backend.businesslayer.IAccountService;
import com.vti.entity.Account;

import java.io.IOException;
import java.util.List;

public class AccountController {
    private IAccountService accountService;

    public AccountController() throws IOException {
        accountService = new AccountService();
    }

    public List<Account> getListAccount() {
        List<Account> listAccount = accountService.getListAccount();
        return listAccount;
    }
}
