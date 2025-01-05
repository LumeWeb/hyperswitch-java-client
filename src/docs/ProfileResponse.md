

# ProfileResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**merchantId** | **String** | The identifier for Merchant Account |  |
|**id** | **String** | The identifier for profile. This must be used for creating merchant accounts, payments and payouts |  |
|**profileName** | **String** | Name of the profile |  |
|**returnUrl** | **String** | The URL to redirect after the completion of the operation |  [optional] |
|**enablePaymentResponseHash** | **Boolean** | A boolean value to indicate if payment response hash needs to be enabled |  |
|**paymentResponseHashKey** | **String** | Refers to the hash key used for calculating the signature for webhooks and redirect response. If the value is not provided, a value is automatically generated. |  [optional] |
|**redirectToMerchantWithHttpPost** | **Boolean** | A boolean value to indicate if redirect to merchant with http post needs to be enabled |  |
|**webhookDetails** | [**WebhookDetails**](WebhookDetails.md) |  |  [optional] |
|**metadata** | **Object** | Metadata is useful for storing additional, unstructured information on an object. |  [optional] |
|**applepayVerifiedDomains** | **List&lt;String&gt;** | Verified Apple Pay domains for a particular profile |  [optional] |
|**sessionExpiry** | **Long** | Client Secret Default expiry for all payments created under this profile |  [optional] |
|**paymentLinkConfig** | [**BusinessPaymentLinkConfig**](BusinessPaymentLinkConfig.md) |  |  [optional] |
|**authenticationConnectorDetails** | [**AuthenticationConnectorDetails**](AuthenticationConnectorDetails.md) |  |  [optional] |
|**useBillingAsPaymentMethodBilling** | **Boolean** |  |  [optional] |
|**extendedCardInfoConfig** | [**ExtendedCardInfoConfig**](ExtendedCardInfoConfig.md) |  |  [optional] |
|**collectShippingDetailsFromWalletConnectorIfRequired** | **Boolean** | A boolean value to indicate if customer shipping details needs to be collected from wallet connector only if it is required field for connector (Eg. Apple Pay, Google Pay etc) |  [optional] |
|**collectBillingDetailsFromWalletConnectorIfRequired** | **Boolean** | A boolean value to indicate if customer billing details needs to be collected from wallet connector only if it is required field for connector (Eg. Apple Pay, Google Pay etc) |  [optional] |
|**alwaysCollectShippingDetailsFromWalletConnector** | **Boolean** | A boolean value to indicate if customer shipping details needs to be collected from wallet connector irrespective of connector required fields (Eg. Apple pay, Google pay etc) |  [optional] |
|**alwaysCollectBillingDetailsFromWalletConnector** | **Boolean** | A boolean value to indicate if customer billing details needs to be collected from wallet connector irrespective of connector required fields (Eg. Apple pay, Google pay etc) |  [optional] |
|**isConnectorAgnosticMitEnabled** | **Boolean** | Indicates if the MIT (merchant initiated transaction) payments can be made connector agnostic, i.e., MITs may be processed through different connector than CIT (customer initiated transaction) based on the routing rules. If set to &#x60;false&#x60;, MIT will go through the same connector as the CIT. |  [optional] |
|**payoutLinkConfig** | [**BusinessPayoutLinkConfig**](BusinessPayoutLinkConfig.md) |  |  [optional] |
|**outgoingWebhookCustomHttpHeaders** | **Object** | These key-value pairs are sent as additional custom headers in the outgoing webhook request. |  [optional] |
|**orderFulfillmentTime** | **Integer** | Will be used to determine the time till which your payment will be active once the payment session starts |  [optional] |
|**orderFulfillmentTimeOrigin** | **OrderFulfillmentTimeOrigin** |  |  [optional] |
|**taxConnectorId** | **String** | Merchant Connector id to be stored for tax_calculator connector |  [optional] |
|**isTaxConnectorEnabled** | **Boolean** | Indicates if tax_calculator connector is enabled or not. If set to &#x60;true&#x60; tax_connector_id will be checked. |  |
|**isNetworkTokenizationEnabled** | **Boolean** | Indicates if network tokenization is enabled or not. |  |
|**shouldCollectCvvDuringPayment** | **Boolean** | Indicates if CVV should be collected during payment or not. |  |



