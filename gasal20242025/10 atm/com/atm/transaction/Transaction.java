package com.atm.transaction;

import com.atm.model.Account;

public abstract class Transaction {
    protected Account account;

    public Transaction(Account account) {
        this.account = account;
    }

    public abstract void execute();
}