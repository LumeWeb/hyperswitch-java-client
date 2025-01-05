

# Wallet

## oneOf schemas
* [WalletOneOf](WalletOneOf.md)
* [WalletOneOf1](WalletOneOf1.md)

## Example
```java
// Import classes:
import com.hyperswitch.model.Wallet;
import com.hyperswitch.model.WalletOneOf;
import com.hyperswitch.model.WalletOneOf1;

public class Example {
    public static void main(String[] args) {
        Wallet exampleWallet = new Wallet();

        // create a new WalletOneOf
        WalletOneOf exampleWalletOneOf = new WalletOneOf();
        // set Wallet to WalletOneOf
        exampleWallet.setActualInstance(exampleWalletOneOf);
        // to get back the WalletOneOf set earlier
        WalletOneOf testWalletOneOf = (WalletOneOf) exampleWallet.getActualInstance();

        // create a new WalletOneOf1
        WalletOneOf1 exampleWalletOneOf1 = new WalletOneOf1();
        // set Wallet to WalletOneOf1
        exampleWallet.setActualInstance(exampleWalletOneOf1);
        // to get back the WalletOneOf1 set earlier
        WalletOneOf1 testWalletOneOf1 = (WalletOneOf1) exampleWallet.getActualInstance();
    }
}
```


