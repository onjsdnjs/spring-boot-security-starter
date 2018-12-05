package io.anymobi.springbootsecuritystarter.controller;

import io.anymobi.springbootsecuritystarter.account.Account;
import io.anymobi.springbootsecuritystarter.account.AccountRepository;
import io.anymobi.springbootsecuritystarter.account.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Component
public class AccountRunner implements org.springframework.boot.ApplicationRunner {

    @Autowired
    AccountService accountService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Account anymobi = accountService.createAccount("anymobi", "1234");
        System.out.println(anymobi.getUsername());
        System.out.println(anymobi.getPassword() );
    }
}
