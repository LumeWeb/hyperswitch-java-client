

# ChargeRefunds

Charge specific fields for controlling the revert of funds from either platform or connected account. Check sub-fields for more details.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**chargeId** | **String** | Identifier for charge created for the payment |  |
|**revertPlatformFee** | **Boolean** | Toggle for reverting the application fee that was collected for the payment. If set to false, the funds are pulled from the destination account. |  [optional] |
|**revertTransfer** | **Boolean** | Toggle for reverting the transfer that was made during the charge. If set to false, the funds are pulled from the main platform&#39;s account. |  [optional] |



