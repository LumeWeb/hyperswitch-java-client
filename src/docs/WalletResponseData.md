

# WalletResponseData

Hyperswitch supports SDK integration with Apple Pay and Google Pay wallets. For other wallets, we integrate with their respective connectors, redirecting the customer to the connector for wallet payments. As a result, we don’t receive any payment method data in the confirm call for payments made through other wallets.

## oneOf schemas
* [WalletResponseDataOneOf](WalletResponseDataOneOf.md)
* [WalletResponseDataOneOf1](WalletResponseDataOneOf1.md)

## Example
```java
// Import classes:
import com.hyperswitch.model.WalletResponseData;
import com.hyperswitch.model.WalletResponseDataOneOf;
import com.hyperswitch.model.WalletResponseDataOneOf1;

public class Example {
    public static void main(String[] args) {
        WalletResponseData exampleWalletResponseData = new WalletResponseData();

        // create a new WalletResponseDataOneOf
        WalletResponseDataOneOf exampleWalletResponseDataOneOf = new WalletResponseDataOneOf();
        // set WalletResponseData to WalletResponseDataOneOf
        exampleWalletResponseData.setActualInstance(exampleWalletResponseDataOneOf);
        // to get back the WalletResponseDataOneOf set earlier
        WalletResponseDataOneOf testWalletResponseDataOneOf = (WalletResponseDataOneOf) exampleWalletResponseData.getActualInstance();

        // create a new WalletResponseDataOneOf1
        WalletResponseDataOneOf1 exampleWalletResponseDataOneOf1 = new WalletResponseDataOneOf1();
        // set WalletResponseData to WalletResponseDataOneOf1
        exampleWalletResponseData.setActualInstance(exampleWalletResponseDataOneOf1);
        // to get back the WalletResponseDataOneOf1 set earlier
        WalletResponseDataOneOf1 testWalletResponseDataOneOf1 = (WalletResponseDataOneOf1) exampleWalletResponseData.getActualInstance();
    }
}
```


