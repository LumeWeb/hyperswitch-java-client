

# RetrievePaymentLinkResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**paymentLinkId** | **String** | Identifier for Payment Link |  |
|**merchantId** | **String** | Identifier for Merchant |  |
|**linkToPay** | **String** | Open payment link (without any security checks and listing SPMs) |  |
|**amount** | **Long** | The payment amount. Amount for the payment in the lowest denomination of the currency |  |
|**createdAt** | **OffsetDateTime** | Date and time of Payment Link creation |  |
|**expiry** | **OffsetDateTime** | Date and time of Expiration for Payment Link |  [optional] |
|**description** | **String** | Description for Payment Link |  [optional] |
|**status** | **PaymentLinkStatus** |  |  |
|**currency** | **Currency** |  |  [optional] |
|**secureLink** | **String** | Secure payment link (with security checks and listing saved payment methods) |  [optional] |



