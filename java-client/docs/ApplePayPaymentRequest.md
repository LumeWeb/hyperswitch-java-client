

# ApplePayPaymentRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**countryCode** | **CountryAlpha2** |  |  |
|**currencyCode** | **Currency** |  |  |
|**total** | [**AmountInfo**](AmountInfo.md) |  |  |
|**merchantCapabilities** | **List&lt;String&gt;** | The list of merchant capabilities(ex: whether capable of 3ds or no-3ds) |  [optional] |
|**supportedNetworks** | **List&lt;String&gt;** | The list of supported networks |  [optional] |
|**merchantIdentifier** | **String** |  |  [optional] |
|**requiredBillingContactFields** | **List&lt;ApplePayAddressParameters&gt;** |  |  [optional] |
|**requiredShippingContactFields** | **List&lt;ApplePayAddressParameters&gt;** |  |  [optional] |



