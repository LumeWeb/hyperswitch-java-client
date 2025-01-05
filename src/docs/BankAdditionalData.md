

# BankAdditionalData

Masked payout method details for bank payout method

## oneOf schemas
* [AchBankTransferAdditionalData](AchBankTransferAdditionalData.md)
* [BacsBankTransferAdditionalData](BacsBankTransferAdditionalData.md)
* [PixBankTransferAdditionalData](PixBankTransferAdditionalData.md)
* [SepaBankTransferAdditionalData](SepaBankTransferAdditionalData.md)

## Example
```java
// Import classes:
import com.hyperswitch.model.BankAdditionalData;
import com.hyperswitch.model.AchBankTransferAdditionalData;
import com.hyperswitch.model.BacsBankTransferAdditionalData;
import com.hyperswitch.model.PixBankTransferAdditionalData;
import com.hyperswitch.model.SepaBankTransferAdditionalData;

public class Example {
    public static void main(String[] args) {
        BankAdditionalData exampleBankAdditionalData = new BankAdditionalData();

        // create a new AchBankTransferAdditionalData
        AchBankTransferAdditionalData exampleAchBankTransferAdditionalData = new AchBankTransferAdditionalData();
        // set BankAdditionalData to AchBankTransferAdditionalData
        exampleBankAdditionalData.setActualInstance(exampleAchBankTransferAdditionalData);
        // to get back the AchBankTransferAdditionalData set earlier
        AchBankTransferAdditionalData testAchBankTransferAdditionalData = (AchBankTransferAdditionalData) exampleBankAdditionalData.getActualInstance();

        // create a new BacsBankTransferAdditionalData
        BacsBankTransferAdditionalData exampleBacsBankTransferAdditionalData = new BacsBankTransferAdditionalData();
        // set BankAdditionalData to BacsBankTransferAdditionalData
        exampleBankAdditionalData.setActualInstance(exampleBacsBankTransferAdditionalData);
        // to get back the BacsBankTransferAdditionalData set earlier
        BacsBankTransferAdditionalData testBacsBankTransferAdditionalData = (BacsBankTransferAdditionalData) exampleBankAdditionalData.getActualInstance();

        // create a new PixBankTransferAdditionalData
        PixBankTransferAdditionalData examplePixBankTransferAdditionalData = new PixBankTransferAdditionalData();
        // set BankAdditionalData to PixBankTransferAdditionalData
        exampleBankAdditionalData.setActualInstance(examplePixBankTransferAdditionalData);
        // to get back the PixBankTransferAdditionalData set earlier
        PixBankTransferAdditionalData testPixBankTransferAdditionalData = (PixBankTransferAdditionalData) exampleBankAdditionalData.getActualInstance();

        // create a new SepaBankTransferAdditionalData
        SepaBankTransferAdditionalData exampleSepaBankTransferAdditionalData = new SepaBankTransferAdditionalData();
        // set BankAdditionalData to SepaBankTransferAdditionalData
        exampleBankAdditionalData.setActualInstance(exampleSepaBankTransferAdditionalData);
        // to get back the SepaBankTransferAdditionalData set earlier
        SepaBankTransferAdditionalData testSepaBankTransferAdditionalData = (SepaBankTransferAdditionalData) exampleBankAdditionalData.getActualInstance();
    }
}
```


