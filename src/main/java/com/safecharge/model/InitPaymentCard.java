/*
 * Copyright (C) 2007 - 2023 SafeCharge International Group Limited.
 */

package com.safecharge.model;

public class InitPaymentCard extends CardData {

    private InitPaymentThreeD threeD;

    public InitPaymentThreeD getThreeD() {
        return threeD;
    }

    public void setThreeD(InitPaymentThreeD threeD) {
        this.threeD = threeD;
    }
}
