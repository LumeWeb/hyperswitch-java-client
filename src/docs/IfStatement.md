

# IfStatement

Represents an IF statement with conditions and optional nested IF statements  ```text payment.method = card { payment.method.cardtype = (credit, debit) { payment.method.network = (amex, rupay, diners) } } ```

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**condition** | [**List&lt;Comparison&gt;**](Comparison.md) |  |  |
|**nested** | [**List&lt;IfStatement&gt;**](IfStatement.md) |  |  [optional] |



