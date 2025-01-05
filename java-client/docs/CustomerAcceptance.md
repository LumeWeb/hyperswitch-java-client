

# CustomerAcceptance

This \"CustomerAcceptance\" object is passed during Payments-Confirm request, it enlists the type, time, and mode of acceptance properties related to an acceptance done by the customer. The customer_acceptance sub object is usually passed by the SDK or client.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**acceptanceType** | **AcceptanceType** |  |  |
|**acceptedAt** | **OffsetDateTime** | Specifying when the customer acceptance was provided |  [optional] |
|**online** | [**OnlineMandate**](OnlineMandate.md) |  |  [optional] |



