

# PaymentMethodListResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**redirectUrl** | **String** | Redirect URL of the merchant |  [optional] |
|**currency** | **Currency** |  |  |
|**paymentMethods** | [**List&lt;PaymentMethodList&gt;**](PaymentMethodList.md) | Information about the payment method |  |
|**mandatePayment** | [**MandateType**](MandateType.md) |  |  |
|**merchantName** | **String** |  |  [optional] |
|**showSurchargeBreakupScreen** | **Boolean** | flag to indicate if surcharge and tax breakup screen should be shown or not |  |
|**paymentType** | **PaymentType** |  |  [optional] |
|**requestExternalThreeDsAuthentication** | **Boolean** | flag to indicate whether to perform external 3ds authentication |  |
|**collectShippingDetailsFromWallets** | **Boolean** | flag that indicates whether to collect shipping details from wallets or from the customer |  [optional] |
|**collectBillingDetailsFromWallets** | **Boolean** | flag that indicates whether to collect billing details from wallets or from the customer |  [optional] |
|**isTaxCalculationEnabled** | **Boolean** | flag that indicates whether to calculate tax on the order amount |  |



