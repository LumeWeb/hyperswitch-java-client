

# NoThirdPartySdkSessionResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**epochTimestamp** | **Long** | Timestamp at which session is requested |  |
|**expiresAt** | **Long** | Timestamp at which session expires |  |
|**merchantSessionIdentifier** | **String** | The identifier for the merchant session |  |
|**nonce** | **String** | Apple pay generated unique ID (UUID) value |  |
|**merchantIdentifier** | **String** | The identifier for the merchant |  |
|**domainName** | **String** | The domain name of the merchant which is registered in Apple Pay |  |
|**displayName** | **String** | The name to be displayed on Apple Pay button |  |
|**signature** | **String** | A string which represents the properties of a payment |  |
|**operationalAnalyticsIdentifier** | **String** | The identifier for the operational analytics |  |
|**retries** | **Integer** | The number of retries to get the session response |  |
|**pspId** | **String** | The identifier for the connector transaction |  |



