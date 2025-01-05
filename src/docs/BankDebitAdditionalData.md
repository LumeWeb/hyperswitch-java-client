

# BankDebitAdditionalData

## oneOf schemas
* [BankDebitAdditionalDataOneOf](BankDebitAdditionalDataOneOf.md)
* [BankDebitAdditionalDataOneOf1](BankDebitAdditionalDataOneOf1.md)
* [BankDebitAdditionalDataOneOf2](BankDebitAdditionalDataOneOf2.md)
* [BankDebitAdditionalDataOneOf3](BankDebitAdditionalDataOneOf3.md)

## Example
```java
// Import classes:
import com.hyperswitch.model.BankDebitAdditionalData;
import com.hyperswitch.model.BankDebitAdditionalDataOneOf;
import com.hyperswitch.model.BankDebitAdditionalDataOneOf1;
import com.hyperswitch.model.BankDebitAdditionalDataOneOf2;
import com.hyperswitch.model.BankDebitAdditionalDataOneOf3;

public class Example {
    public static void main(String[] args) {
        BankDebitAdditionalData exampleBankDebitAdditionalData = new BankDebitAdditionalData();

        // create a new BankDebitAdditionalDataOneOf
        BankDebitAdditionalDataOneOf exampleBankDebitAdditionalDataOneOf = new BankDebitAdditionalDataOneOf();
        // set BankDebitAdditionalData to BankDebitAdditionalDataOneOf
        exampleBankDebitAdditionalData.setActualInstance(exampleBankDebitAdditionalDataOneOf);
        // to get back the BankDebitAdditionalDataOneOf set earlier
        BankDebitAdditionalDataOneOf testBankDebitAdditionalDataOneOf = (BankDebitAdditionalDataOneOf) exampleBankDebitAdditionalData.getActualInstance();

        // create a new BankDebitAdditionalDataOneOf1
        BankDebitAdditionalDataOneOf1 exampleBankDebitAdditionalDataOneOf1 = new BankDebitAdditionalDataOneOf1();
        // set BankDebitAdditionalData to BankDebitAdditionalDataOneOf1
        exampleBankDebitAdditionalData.setActualInstance(exampleBankDebitAdditionalDataOneOf1);
        // to get back the BankDebitAdditionalDataOneOf1 set earlier
        BankDebitAdditionalDataOneOf1 testBankDebitAdditionalDataOneOf1 = (BankDebitAdditionalDataOneOf1) exampleBankDebitAdditionalData.getActualInstance();

        // create a new BankDebitAdditionalDataOneOf2
        BankDebitAdditionalDataOneOf2 exampleBankDebitAdditionalDataOneOf2 = new BankDebitAdditionalDataOneOf2();
        // set BankDebitAdditionalData to BankDebitAdditionalDataOneOf2
        exampleBankDebitAdditionalData.setActualInstance(exampleBankDebitAdditionalDataOneOf2);
        // to get back the BankDebitAdditionalDataOneOf2 set earlier
        BankDebitAdditionalDataOneOf2 testBankDebitAdditionalDataOneOf2 = (BankDebitAdditionalDataOneOf2) exampleBankDebitAdditionalData.getActualInstance();

        // create a new BankDebitAdditionalDataOneOf3
        BankDebitAdditionalDataOneOf3 exampleBankDebitAdditionalDataOneOf3 = new BankDebitAdditionalDataOneOf3();
        // set BankDebitAdditionalData to BankDebitAdditionalDataOneOf3
        exampleBankDebitAdditionalData.setActualInstance(exampleBankDebitAdditionalDataOneOf3);
        // to get back the BankDebitAdditionalDataOneOf3 set earlier
        BankDebitAdditionalDataOneOf3 testBankDebitAdditionalDataOneOf3 = (BankDebitAdditionalDataOneOf3) exampleBankDebitAdditionalData.getActualInstance();
    }
}
```


