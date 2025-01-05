

# Bank

## oneOf schemas
* [AchBankTransfer](AchBankTransfer.md)
* [BacsBankTransfer](BacsBankTransfer.md)
* [PixBankTransfer](PixBankTransfer.md)
* [SepaBankTransfer](SepaBankTransfer.md)

## Example
```java
// Import classes:
import com.lumeweb.hyperswitch.model.Bank;
import com.lumeweb.hyperswitch.model.AchBankTransfer;
import com.lumeweb.hyperswitch.model.BacsBankTransfer;
import com.lumeweb.hyperswitch.model.PixBankTransfer;
import com.lumeweb.hyperswitch.model.SepaBankTransfer;

public class Example {
    public static void main(String[] args) {
        Bank exampleBank = new Bank();

        // create a new AchBankTransfer
        AchBankTransfer exampleAchBankTransfer = new AchBankTransfer();
        // set Bank to AchBankTransfer
        exampleBank.setActualInstance(exampleAchBankTransfer);
        // to get back the AchBankTransfer set earlier
        AchBankTransfer testAchBankTransfer = (AchBankTransfer) exampleBank.getActualInstance();

        // create a new BacsBankTransfer
        BacsBankTransfer exampleBacsBankTransfer = new BacsBankTransfer();
        // set Bank to BacsBankTransfer
        exampleBank.setActualInstance(exampleBacsBankTransfer);
        // to get back the BacsBankTransfer set earlier
        BacsBankTransfer testBacsBankTransfer = (BacsBankTransfer) exampleBank.getActualInstance();

        // create a new PixBankTransfer
        PixBankTransfer examplePixBankTransfer = new PixBankTransfer();
        // set Bank to PixBankTransfer
        exampleBank.setActualInstance(examplePixBankTransfer);
        // to get back the PixBankTransfer set earlier
        PixBankTransfer testPixBankTransfer = (PixBankTransfer) exampleBank.getActualInstance();

        // create a new SepaBankTransfer
        SepaBankTransfer exampleSepaBankTransfer = new SepaBankTransfer();
        // set Bank to SepaBankTransfer
        exampleBank.setActualInstance(exampleSepaBankTransfer);
        // to get back the SepaBankTransfer set earlier
        SepaBankTransfer testSepaBankTransfer = (SepaBankTransfer) exampleBank.getActualInstance();
    }
}
```


