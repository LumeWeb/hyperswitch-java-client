

# RetrieveApiKeyResponse

The response body for retrieving an API Key.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**keyId** | **String** | The identifier for the API Key. |  |
|**merchantId** | **String** | The identifier for the Merchant Account. |  |
|**name** | **String** | The unique name for the API Key to help you identify it. |  |
|**description** | **String** | The description to provide more context about the API Key. |  [optional] |
|**prefix** | **String** | The first few characters of the plaintext API Key to help you identify it. |  |
|**created** | **OffsetDateTime** | The time at which the API Key was created. |  |
|**expiration** | [**ApiKeyExpiration**](ApiKeyExpiration.md) |  |  |



