/*
 * Copyright (C) 2007 - 2023 SafeCharge International Group Limited.
 */

package com.safecharge.request;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import com.safecharge.model.*;
import com.safecharge.request.builder.SafechargePaymentBuilder;

public abstract class Authorize3dAndPaymentRequest extends SafechargePaymentRequest {

    @Valid
    private PaymentOption paymentOption;

    private Integer isRebilling;

    @Size(max = 10)
    private String rebillingType;

    private boolean autoPayment3D;

    private String authenticationOnlyType;

    @Valid
    private SubMerchant subMerchant;

    @Size(max = 255)
    private String userId;

    @Valid
    private ExternalSchemeDetails externalSchemeDetails;

    @Valid
    private CurrencyConversion currencyConversion;

    @Size(max = 1)
    private String isPartialApproval;

    private String paymentFlow;

    private String redirectFlowUITheme;

    private String aftOverride;

    private RecipientDetails recipientDetails;

    private String apiVersion;

    private Integer subscriptionStep;

    private String upoExpirationMonth;

    private String upoExpirationYear;

    private GooglePayData googlePayData;

    private DecryptedMessage decryptedMessage;

    private ApplePayPaymentDataHolder applePayPaymentDataHolder;

    public PaymentOption getPaymentOption() {
        return paymentOption;
    }

    public void setPaymentOption(PaymentOption paymentOption) {
        this.paymentOption = paymentOption;
    }

    public Integer getIsRebilling() {
        return isRebilling;
    }

    public void setIsRebilling(Integer isRebilling) {
        this.isRebilling = isRebilling;
    }

    public String getRebillingType() {
        return rebillingType;
    }

    public void setRebillingType(String rebillingType) {
        this.rebillingType = rebillingType;
    }

    public boolean isAutoPayment3D() {
        return autoPayment3D;
    }

    public void setAutoPayment3D(boolean autoPayment3D) {
        this.autoPayment3D = autoPayment3D;
    }

    public String getAuthenticationOnlyType() {
        return authenticationOnlyType;
    }

    public void setAuthenticationOnlyType(String authenticationOnlyType) {
        this.authenticationOnlyType = authenticationOnlyType;
    }

    public SubMerchant getSubMerchant() {
        return subMerchant;
    }

    public void setSubMerchant(SubMerchant subMerchant) {
        this.subMerchant = subMerchant;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ExternalSchemeDetails getExternalSchemeDetails() {
        return externalSchemeDetails;
    }

    public void setExternalSchemeDetails(ExternalSchemeDetails externalSchemeDetails) {
        this.externalSchemeDetails = externalSchemeDetails;
    }

    public CurrencyConversion getCurrencyConversion() {
        return currencyConversion;
    }

    public void setCurrencyConversion(CurrencyConversion currencyConversion) {
        this.currencyConversion = currencyConversion;
    }

    public String getIsPartialApproval() {
        return isPartialApproval;
    }

    public void setIsPartialApproval(String isPartialApproval) {
        this.isPartialApproval = isPartialApproval;
    }

    public String getPaymentFlow() {
        return paymentFlow;
    }

    public void setPaymentFlow(String paymentFlow) {
        this.paymentFlow = paymentFlow;
    }

    public String getRedirectFlowUITheme() {
        return redirectFlowUITheme;
    }

    public void setRedirectFlowUITheme(String redirectFlowUITheme) {
        this.redirectFlowUITheme = redirectFlowUITheme;
    }

    public String getAftOverride() {
        return aftOverride;
    }

    public void setAftOverride(String aftOverride) {
        this.aftOverride = aftOverride;
    }

    public RecipientDetails getRecipientDetails() {
        return recipientDetails;
    }

    public void setRecipientDetails(RecipientDetails recipientDetails) {
        this.recipientDetails = recipientDetails;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public Integer getSubscriptionStep() {
        return subscriptionStep;
    }

    public void setSubscriptionStep(Integer subscriptionStep) {
        this.subscriptionStep = subscriptionStep;
    }

    public String getUpoExpirationMonth() {
        return upoExpirationMonth;
    }

    public void setUpoExpirationMonth(String upoExpirationMonth) {
        this.upoExpirationMonth = upoExpirationMonth;
    }

    public String getUpoExpirationYear() {
        return upoExpirationYear;
    }

    public void setUpoExpirationYear(String upoExpirationYear) {
        this.upoExpirationYear = upoExpirationYear;
    }

    public GooglePayData getGooglePayData() {
        return googlePayData;
    }

    public void setGooglePayData(GooglePayData googlePayData) {
        this.googlePayData = googlePayData;
    }

    public DecryptedMessage getDecryptedMessage() {
        return decryptedMessage;
    }

    public void setDecryptedMessage(DecryptedMessage decryptedMessage) {
        this.decryptedMessage = decryptedMessage;
    }

    public ApplePayPaymentDataHolder getApplePayPaymentDataHolder() {
        return applePayPaymentDataHolder;
    }

    public void setApplePayPaymentDataHolder(ApplePayPaymentDataHolder applePayPaymentDataHolder) {
        this.applePayPaymentDataHolder = applePayPaymentDataHolder;
    }

    public abstract static class Builder<T extends Builder<T>> extends SafechargePaymentBuilder<T> {

        private PaymentOption paymentOption;
        private Integer isRebilling;
        private String rebillingType;
        private boolean autoPayment3D;
        private String authenticationOnlyType;
        private SubMerchant subMerchant;
        private String userId;
        private ExternalSchemeDetails externalSchemeDetails;
        private CurrencyConversion currencyConversion;
        private String isPartialApproval;
        private String paymentFlow;
        private String redirectFlowUITheme;
        private String aftOverride;
        private RecipientDetails recipientDetails;
        private String apiVersion;
        private Integer subscriptionStep;
        private String upoExpirationMonth;
        private String upoExpirationYear;
        private GooglePayData googlePayData;
        private DecryptedMessage decryptedMessage;
        private ApplePayPaymentDataHolder applePayPaymentDataHolder;

        public T addPaymentOption(PaymentOption paymentOption) {
            this.paymentOption = paymentOption;
            return (T) this;
        }

        public T addIsRebilling(Integer isRebilling) {
            this.isRebilling = isRebilling;
            return (T) this;
        }

        public T addRebillingType(String rebillingType) {
            this.rebillingType = rebillingType;
            return (T) this;
        }

        public T addAutoPayment3D(Boolean autoPayment3D) {
            this.autoPayment3D = Boolean.TRUE.equals(autoPayment3D);
            return (T) this;
        }

        public T addAuthenticationOnlyType(String authenticationOnlyType) {
            this.authenticationOnlyType = authenticationOnlyType;
            return (T) this;
        }

        public T addSubMerchant(SubMerchant subMerchant) {
            this.subMerchant = subMerchant;
            return (T) this;
        }

        public T addUserId(String userId) {
            this.userId = userId;
            return (T) this;
        }

        public T addExternalSchemeDetails(ExternalSchemeDetails externalSchemeDetails) {
            this.externalSchemeDetails = externalSchemeDetails;
            return (T) this;
        }

        public T addCurrencyConversion(CurrencyConversion currencyConversion) {
            this.currencyConversion = currencyConversion;
            return (T) this;
        }

        public T addIsPartialApproval(String isPartialApproval) {
            this.isPartialApproval = isPartialApproval;
            return (T) this;
        }

        public T addPaymentFlow(String paymentFlow) {
            this.paymentFlow = paymentFlow;
            return (T) this;
        }

        public T addRedirectFlowUITheme(String redirectFlowUITheme) {
            this.redirectFlowUITheme = redirectFlowUITheme;
            return (T) this;
        }

        public T addAftOverride(String aftOverride) {
            this.aftOverride = aftOverride;
            return (T) this;
        }

        public T addRecipientDetails(RecipientDetails recipientDetails) {
            this.recipientDetails = recipientDetails;
            return (T) this;
        }

        public T addApiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
            return (T) this;
        }

        public T addSubscriptionStep(Integer subscriptionStep) {
            this.subscriptionStep = subscriptionStep;
            return (T) this;
        }

        public T addUpoExpirationMonth(String upoExpirationMonth) {
            this.upoExpirationMonth = upoExpirationMonth;
            return (T) this;
        }

        public T addUpoExpirationYear(String upoExpirationYear) {
            this.upoExpirationYear = upoExpirationYear;
            return (T) this;
        }

        public T addGooglePayData(GooglePayData googlePayData) {
            this.googlePayData = googlePayData;
            return (T) this;
        }

        public T addDecryptedMessage(DecryptedMessage decryptedMessage) {
            this.decryptedMessage = decryptedMessage;
            return (T) this;
        }

        public T addApplePayPaymentDataHolder(ApplePayPaymentDataHolder applePayPaymentDataHolder) {
            this.applePayPaymentDataHolder = applePayPaymentDataHolder;
            return (T) this;
        }

        protected <S extends Authorize3dAndPaymentRequest> S build(S request) {
            request.setPaymentOption(paymentOption);
            request.setIsRebilling(isRebilling);
            request.setRebillingType(rebillingType);
            request.setAutoPayment3D(autoPayment3D);
            request.setAuthenticationOnlyType(authenticationOnlyType);
            request.setSubMerchant(subMerchant);
            request.setUserId(userId);
            request.setExternalSchemeDetails(externalSchemeDetails);
            request.setCurrencyConversion(currencyConversion);
            request.setIsPartialApproval(isPartialApproval);
            request.setPaymentFlow(paymentFlow);
            request.setRedirectFlowUITheme(redirectFlowUITheme);
            request.setAftOverride(aftOverride);
            request.setRecipientDetails(recipientDetails);
            request.setApiVersion(apiVersion);
            request.setSubscriptionStep(subscriptionStep);
            request.setUpoExpirationMonth(upoExpirationMonth);
            request.setUpoExpirationYear(upoExpirationYear);
            request.setGooglePayData(googlePayData);
            request.setDecryptedMessage(decryptedMessage);
            request.setApplePayPaymentDataHolder(applePayPaymentDataHolder);

            return super.build(request);
        }
    }
}
