package com.danix.code.smell.example001;

/**
 * @author  danix
 */
public class Company extends Customer {

    protected double companyOverdraftDiscount = 1;

    Company(final String name, final String email, final Account account, final double companyOverdraftDiscount) {
        super(name, email, account);
        this.companyOverdraftDiscount = companyOverdraftDiscount;
    }

    public void withdrawWithPremium(final Money money) {
        if (account.isOverdraft()) {
            account.substract(Money.newInstance(
                    money.getAmount() + money.getAmount() * account.overdraftFee() * companyOverdraftDiscount / 2,
                    money.getCurrency()));
        } else {
            account.substract(Money.newInstance(money.getAmount(), money.getCurrency()));
        }
    }
    public void withdrawWithoutPremium(final Money money) {
        if (account.isOverdraft()) {
            account.substract(Money.newInstance(
                    money.getAmount() + money.getAmount() * account.overdraftFee() * companyOverdraftDiscount,
                    money.getCurrency()));
        } else {
            account.substract(Money.newInstance(money.getAmount(), money.getCurrency()));
        }
    }


        @Override
    public void withdraw(final Money money) {
        if (account.getType().isPremium()) {
           withdrawWithPremium(money);
        } else {
           withdrawWithoutPremium(money);
        }
    }

    @Override
    protected String getFullName() {
        return name;
    }
}
