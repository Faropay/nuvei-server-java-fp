/*
 * Copyright (C) 2007 - 2023 SafeCharge International Group Limited.
 */

package com.safecharge.response;

import java.util.List;

import com.safecharge.model.PaymentMethod;

/**
 * <p>
 * Response received from the SafeCharge's servers to the {@link com.safecharge.request.GetMerchantPaymentMethodsRequest}.
 *
 * @author <a mailto:nikolad@safecharge.com>Nikola Dichev</a>
 * @see com.safecharge.request.GetMerchantPaymentMethodsRequest
 * @since 4/7/2017
 */
public class GetMerchantPaymentMethodsResponse extends SafechargeResponse {

    /**
     * List of {@link PaymentMethod} objects containing the available payment options per the GetMerchantPaymentMethodsRequest
     */
    private List<PaymentMethod> paymentMethods;

    public List<PaymentMethod> getPaymentMethods() {
        return paymentMethods;
    }

    public void setPaymentMethods(List<PaymentMethod> paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetMerchantPaymentMethodsResponse{");
        sb.append("paymentMethods=")
                .append(paymentMethods);
        sb.append(", ")
                .append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
