

# MerchantConnectorCreate

Create a new Merchant Connector for the merchant account. The connector could be a payment processor / facilitator / acquirer or specialized services like Fraud / Accounting etc.\"

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**connectorType** | **ConnectorType** |  |  |
|**connectorName** | **Connector** |  |  |
|**connectorLabel** | **String** | This is an unique label you can generate and pass in order to identify this connector account on your Hyperswitch dashboard and reports, If not passed then if will take &#x60;connector_name&#x60;_&#x60;profile_name&#x60;. Eg: if your profile label is &#x60;default&#x60;, connector label can be &#x60;stripe_default&#x60; |  [optional] |
|**profileId** | **String** | Identifier for the profile, if not provided default will be chosen from merchant account |  |
|**connectorAccountDetails** | [**MerchantConnectorDetails**](MerchantConnectorDetails.md) |  |  [optional] |
|**paymentMethodsEnabled** | [**List&lt;PaymentMethodsEnabled&gt;**](PaymentMethodsEnabled.md) | An object containing the details about the payment methods that need to be enabled under this merchant connector account |  [optional] |
|**connectorWebhookDetails** | [**MerchantConnectorWebhookDetails**](MerchantConnectorWebhookDetails.md) |  |  [optional] |
|**metadata** | **Object** | Metadata is useful for storing additional, unstructured information on an object. |  [optional] |
|**disabled** | **Boolean** | A boolean value to indicate if the connector is disabled. By default, its value is false. |  [optional] |
|**frmConfigs** | [**List&lt;FrmConfigs&gt;**](FrmConfigs.md) | Contains the frm configs for the merchant connector |  [optional] |
|**pmAuthConfig** | **Object** | pm_auth_config will relate MCA records to their respective chosen auth services, based on payment_method and pmt |  [optional] |
|**status** | **ConnectorStatus** |  |  [optional] |
|**additionalMerchantData** | [**AdditionalMerchantData**](AdditionalMerchantData.md) |  |  [optional] |
|**connectorWalletsDetails** | [**ConnectorWalletDetails**](ConnectorWalletDetails.md) |  |  [optional] |



