

# WalletAdditionalData

Masked payout method details for wallet payout method

## oneOf schemas
* [PaypalAdditionalData](PaypalAdditionalData.md)
* [VenmoAdditionalData](VenmoAdditionalData.md)

## Example
```java
// Import classes:
import com.hyperswitch.model.WalletAdditionalData;
import com.hyperswitch.model.PaypalAdditionalData;
import com.hyperswitch.model.VenmoAdditionalData;

public class Example {
    public static void main(String[] args) {
        WalletAdditionalData exampleWalletAdditionalData = new WalletAdditionalData();

        // create a new PaypalAdditionalData
        PaypalAdditionalData examplePaypalAdditionalData = new PaypalAdditionalData();
        // set WalletAdditionalData to PaypalAdditionalData
        exampleWalletAdditionalData.setActualInstance(examplePaypalAdditionalData);
        // to get back the PaypalAdditionalData set earlier
        PaypalAdditionalData testPaypalAdditionalData = (PaypalAdditionalData) exampleWalletAdditionalData.getActualInstance();

        // create a new VenmoAdditionalData
        VenmoAdditionalData exampleVenmoAdditionalData = new VenmoAdditionalData();
        // set WalletAdditionalData to VenmoAdditionalData
        exampleWalletAdditionalData.setActualInstance(exampleVenmoAdditionalData);
        // to get back the VenmoAdditionalData set earlier
        VenmoAdditionalData testVenmoAdditionalData = (VenmoAdditionalData) exampleWalletAdditionalData.getActualInstance();
    }
}
```


