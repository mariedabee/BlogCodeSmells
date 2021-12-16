package com.danix.code.smell.example001;

/**
 * @author danix
 */
public class AccountType {
    private boolean premium;

    @Override
    public String toString() {
        return premium ? "premium" : "normal";
    }
}
