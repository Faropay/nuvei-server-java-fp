package com.safecharge.request;

import javax.validation.Valid;

import com.safecharge.model.PaymentOption;
import com.safecharge.request.builder.SafechargePaymentBuilder;

public abstract class Authorize3dAndPaymentRequest extends SafechargePaymentRequest {

    @Valid
    private PaymentOption paymentOption;

    private Integer isRebilling;

    private boolean autoPayment3D;

    private final String sourceApplication = "JAVA_SDK";

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

    public boolean isAutoPayment3D() {
        return autoPayment3D;
    }

    public void setAutoPayment3D(boolean autoPayment3D) {
        this.autoPayment3D = autoPayment3D;
    }

    public abstract static class Builder<T extends Builder<T>> extends SafechargePaymentBuilder<T> {

        private PaymentOption paymentOption;
        private Integer isRebilling;
        private boolean autoPayment3D;

        public T addPaymentOption(PaymentOption paymentOption) {
            this.paymentOption = paymentOption;
            return (T) this;
        }

        public T addIsRebilling(Integer isRebilling) {
            this.isRebilling = isRebilling;
            return (T) this;
        }

        public T addAutoPayment3D(Boolean autoPayment3D) {
            this.autoPayment3D = Boolean.TRUE.equals(autoPayment3D);
            return (T) this;
        }

        protected <S extends Authorize3dAndPaymentRequest> S build(S request) {
            request.setPaymentOption(paymentOption);
            request.setIsRebilling(isRebilling);
            request.setIsRebilling(isRebilling);
            request.setAutoPayment3D(autoPayment3D);

            return super.build(request);
        }
    }
}
