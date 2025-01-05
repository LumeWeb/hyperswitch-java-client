

# PayoutCreatePayoutLinkConfig

Custom payout link config for the particular payout, if payout link is to be generated.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**logo** | **String** | Merchant&#39;s display logo |  [optional] |
|**merchantName** | **String** | Custom merchant name for the link |  [optional] |
|**theme** | **String** | Primary color to be used in the form represented in hex format |  [optional] |
|**payoutLinkId** | **String** | The unique identifier for the collect link. |  [optional] |
|**enabledPaymentMethods** | [**List&lt;EnabledPaymentMethod&gt;**](EnabledPaymentMethod.md) | List of payout methods shown on collect UI |  [optional] |
|**formLayout** | **UIWidgetFormLayout** |  |  [optional] |
|**testMode** | **Boolean** | &#x60;test_mode&#x60; allows for opening payout links without any restrictions. This removes - domain name validations - check for making sure link is accessed within an iframe |  [optional] |



