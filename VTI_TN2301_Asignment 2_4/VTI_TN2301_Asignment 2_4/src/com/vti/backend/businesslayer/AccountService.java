package com.vti.backend.businesslayer;

import com.vti.backend.datalayer.AccountRepository;
import com.vti.backend.datalayer.IAccountRepository;
import com.vti.entity.Account;

import java.io.IOException;
import java.util.List;

public class AccountService implements IAccountService {
    private IAccountRepository accountRepository;

    public AccountService() throws IOException {
        accountRepository = new AccountRepository();
    }

    @Override
    public List<Account> getListAccount() {
        List<Account> listAccount = accountRepository.getListAccount();
        return listAccount;

    }
}
