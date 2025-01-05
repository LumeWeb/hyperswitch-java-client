

# SamsungPayWalletCredentials

## oneOf schemas
* [SamsungPayAppWalletData](SamsungPayAppWalletData.md)
* [SamsungPayWebWalletData](SamsungPayWebWalletData.md)

## Example
```java
// Import classes:
import com.hyperswitch.model.SamsungPayWalletCredentials;
import com.hyperswitch.model.SamsungPayAppWalletData;
import com.hyperswitch.model.SamsungPayWebWalletData;

public class Example {
    public static void main(String[] args) {
        SamsungPayWalletCredentials exampleSamsungPayWalletCredentials = new SamsungPayWalletCredentials();

        // create a new SamsungPayAppWalletData
        SamsungPayAppWalletData exampleSamsungPayAppWalletData = new SamsungPayAppWalletData();
        // set SamsungPayWalletCredentials to SamsungPayAppWalletData
        exampleSamsungPayWalletCredentials.setActualInstance(exampleSamsungPayAppWalletData);
        // to get back the SamsungPayAppWalletData set earlier
        SamsungPayAppWalletData testSamsungPayAppWalletData = (SamsungPayAppWalletData) exampleSamsungPayWalletCredentials.getActualInstance();

        // create a new SamsungPayWebWalletData
        SamsungPayWebWalletData exampleSamsungPayWebWalletData = new SamsungPayWebWalletData();
        // set SamsungPayWalletCredentials to SamsungPayWebWalletData
        exampleSamsungPayWalletCredentials.setActualInstance(exampleSamsungPayWebWalletData);
        // to get back the SamsungPayWebWalletData set earlier
        SamsungPayWebWalletData testSamsungPayWebWalletData = (SamsungPayWebWalletData) exampleSamsungPayWalletCredentials.getActualInstance();
    }
}
```


