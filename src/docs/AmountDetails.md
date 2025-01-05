

# AmountDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orderAmount** | **Long** | The payment amount. Amount for the payment in the lowest denomination of the currency, (i.e) in cents for USD denomination, in yen for JPY denomination etc. E.g., Pass 100 to charge $1.00 and 1 for 1¥ since ¥ is a zero-decimal currency. Read more about [the Decimal and Non-Decimal Currencies](https://github.com/juspay/hyperswitch/wiki/Decimal-and-Non%E2%80%90Decimal-Currencies) |  [optional] |
|**currency** | **Currency** |  |  |
|**shippingCost** | **Long** | This Unit struct represents MinorUnit in which core amount works |  [optional] |
|**orderTaxAmount** | **Long** | This Unit struct represents MinorUnit in which core amount works |  [optional] |
|**skipExternalTaxCalculation** | **TaxCalculationOverride** |  |  [optional] |
|**skipSurchargeCalculation** | **SurchargeCalculationOverride** |  |  [optional] |
|**surchargeAmount** | **Long** | This Unit struct represents MinorUnit in which core amount works |  [optional] |
|**taxOnSurcharge** | **Long** | This Unit struct represents MinorUnit in which core amount works |  [optional] |



