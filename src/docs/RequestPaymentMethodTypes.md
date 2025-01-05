

# RequestPaymentMethodTypes


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**paymentMethodType** | **PaymentMethodType** |  |  |
|**paymentExperience** | **PaymentExperience** |  |  [optional] |
|**cardNetworks** | **List&lt;CardNetwork&gt;** |  |  [optional] |
|**acceptedCurrencies** | [**AcceptedCurrencies**](AcceptedCurrencies.md) |  |  [optional] |
|**acceptedCountries** | [**AcceptedCountries**](AcceptedCountries.md) |  |  [optional] |
|**minimumAmount** | **Long** | This Unit struct represents MinorUnit in which core amount works |  [optional] |
|**maximumAmount** | **Long** | This Unit struct represents MinorUnit in which core amount works |  [optional] |
|**recurringEnabled** | **Boolean** | Boolean to enable recurring payments / mandates. Default is true. |  |
|**installmentPaymentEnabled** | **Boolean** | Boolean to enable installment / EMI / BNPL payments. Default is true. |  |



