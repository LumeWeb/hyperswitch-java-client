

# PaymentsExternalAuthenticationResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**transStatus** | **TransactionStatus** |  |  |
|**acsUrl** | **String** | Access Server URL to be used for challenge submission |  [optional] |
|**challengeRequest** | **String** | Challenge request which should be sent to acs_url |  [optional] |
|**acsReferenceNumber** | **String** | Unique identifier assigned by the EMVCo(Europay, Mastercard and Visa) |  [optional] |
|**acsTransId** | **String** | Unique identifier assigned by the ACS to identify a single transaction |  [optional] |
|**threeDsserverTransId** | **String** | Unique identifier assigned by the 3DS Server to identify a single transaction |  [optional] |
|**acsSignedContent** | **String** | Contains the JWS object created by the ACS for the ARes(Authentication Response) message |  [optional] |
|**threeDsRequestorUrl** | **String** | Three DS Requestor URL |  |



