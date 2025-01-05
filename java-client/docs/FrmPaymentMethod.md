

# FrmPaymentMethod

Details of FrmPaymentMethod are mentioned here... it should be passed in payment connector create api call, and stored in merchant_connector_table

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**paymentMethod** | **PaymentMethod** |  |  |
|**paymentMethodTypes** | [**List&lt;FrmPaymentMethodType&gt;**](FrmPaymentMethodType.md) | payment method types(credit, debit) that can be used in the payment. This field is deprecated. It has not been removed to provide backward compatibility. |  [optional] |
|**flow** | **FrmPreferredFlowTypes** |  |  [optional] |



