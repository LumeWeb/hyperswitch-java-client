

# CreateApiKeyResponse

The response body for creating an API Key.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**keyId** | **String** | The identifier for the API Key. |  |
|**merchantId** | **String** | The identifier for the Merchant Account. |  |
|**name** | **String** | The unique name for the API Key to help you identify it. |  |
|**description** | **String** | The description to provide more context about the API Key. |  [optional] |
|**apiKey** | **String** | The plaintext API Key used for server-side API access. Ensure you store the API Key securely as you will not be able to see it again. |  |
|**created** | **OffsetDateTime** | The time at which the API Key was created. |  |
|**expiration** | [**ApiKeyExpiration**](ApiKeyExpiration.md) |  |  |



