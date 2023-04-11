/*
 * Copyright (C) 2007 - 2023 SafeCharge International Group Limited.
 */

package com.safecharge.model;

public class InitPaymentCard extends CardData {

    private ExternalToken externalToken;
    private InitPaymentThreeD threeD;

    public ExternalToken getExternalToken() {
        return externalToken;
    }

    public void setExternalToken(ExternalToken externalToken) {
        this.externalToken = externalToken;
    }

    public InitPaymentThreeD getThreeD() {
        return threeD;
    }

    public void setThreeD(InitPaymentThreeD threeD) {
        this.threeD = threeD;
    }
}
