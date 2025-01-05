

# MerchantConnectorResponse

Response of creating a new Merchant Connector for the merchant account.\"

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**connectorType** | **ConnectorType** |  |  |
|**connectorName** | **Connector** |  |  |
|**connectorLabel** | **String** | A unique label to identify the connector account created under a profile |  [optional] |
|**id** | **String** | Unique ID of the merchant connector account |  |
|**profileId** | **String** | Identifier for the profile, if not provided default will be chosen from merchant account |  |
|**connectorAccountDetails** | [**MerchantConnectorDetails**](MerchantConnectorDetails.md) |  |  [optional] |
|**paymentMethodsEnabled** | [**List&lt;PaymentMethodsEnabled&gt;**](PaymentMethodsEnabled.md) | An object containing the details about the payment methods that need to be enabled under this merchant connector account |  [optional] |
|**connectorWebhookDetails** | [**MerchantConnectorWebhookDetails**](MerchantConnectorWebhookDetails.md) |  |  [optional] |
|**metadata** | **Object** | Metadata is useful for storing additional, unstructured information on an object. |  [optional] |
|**disabled** | **Boolean** | A boolean value to indicate if the connector is disabled. By default, its value is false. |  [optional] |
|**frmConfigs** | [**List&lt;FrmConfigs&gt;**](FrmConfigs.md) | Contains the frm configs for the merchant connector |  [optional] |
|**applepayVerifiedDomains** | **List&lt;String&gt;** | identifier for the verified domains of a particular connector account |  [optional] |
|**pmAuthConfig** | **Object** | pm_auth_config will relate MCA records to their respective chosen auth services, based on payment_method and pmt |  [optional] |
|**status** | **ConnectorStatus** |  |  |
|**additionalMerchantData** | [**AdditionalMerchantData**](AdditionalMerchantData.md) |  |  [optional] |
|**connectorWalletsDetails** | [**ConnectorWalletDetails**](ConnectorWalletDetails.md) |  |  [optional] |



