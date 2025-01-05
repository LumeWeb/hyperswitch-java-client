

# BankDebitData

## oneOf schemas
* [BankDebitDataOneOf](BankDebitDataOneOf.md)
* [BankDebitDataOneOf1](BankDebitDataOneOf1.md)
* [BankDebitDataOneOf2](BankDebitDataOneOf2.md)
* [BankDebitDataOneOf3](BankDebitDataOneOf3.md)

## Example
```java
// Import classes:
import com.hyperswitch.model.BankDebitData;
import com.hyperswitch.model.BankDebitDataOneOf;
import com.hyperswitch.model.BankDebitDataOneOf1;
import com.hyperswitch.model.BankDebitDataOneOf2;
import com.hyperswitch.model.BankDebitDataOneOf3;

public class Example {
    public static void main(String[] args) {
        BankDebitData exampleBankDebitData = new BankDebitData();

        // create a new BankDebitDataOneOf
        BankDebitDataOneOf exampleBankDebitDataOneOf = new BankDebitDataOneOf();
        // set BankDebitData to BankDebitDataOneOf
        exampleBankDebitData.setActualInstance(exampleBankDebitDataOneOf);
        // to get back the BankDebitDataOneOf set earlier
        BankDebitDataOneOf testBankDebitDataOneOf = (BankDebitDataOneOf) exampleBankDebitData.getActualInstance();

        // create a new BankDebitDataOneOf1
        BankDebitDataOneOf1 exampleBankDebitDataOneOf1 = new BankDebitDataOneOf1();
        // set BankDebitData to BankDebitDataOneOf1
        exampleBankDebitData.setActualInstance(exampleBankDebitDataOneOf1);
        // to get back the BankDebitDataOneOf1 set earlier
        BankDebitDataOneOf1 testBankDebitDataOneOf1 = (BankDebitDataOneOf1) exampleBankDebitData.getActualInstance();

        // create a new BankDebitDataOneOf2
        BankDebitDataOneOf2 exampleBankDebitDataOneOf2 = new BankDebitDataOneOf2();
        // set BankDebitData to BankDebitDataOneOf2
        exampleBankDebitData.setActualInstance(exampleBankDebitDataOneOf2);
        // to get back the BankDebitDataOneOf2 set earlier
        BankDebitDataOneOf2 testBankDebitDataOneOf2 = (BankDebitDataOneOf2) exampleBankDebitData.getActualInstance();

        // create a new BankDebitDataOneOf3
        BankDebitDataOneOf3 exampleBankDebitDataOneOf3 = new BankDebitDataOneOf3();
        // set BankDebitData to BankDebitDataOneOf3
        exampleBankDebitData.setActualInstance(exampleBankDebitDataOneOf3);
        // to get back the BankDebitDataOneOf3 set earlier
        BankDebitDataOneOf3 testBankDebitDataOneOf3 = (BankDebitDataOneOf3) exampleBankDebitData.getActualInstance();
    }
}
```


