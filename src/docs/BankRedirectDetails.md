

# BankRedirectDetails

## oneOf schemas
* [BankRedirectDetailsOneOf](BankRedirectDetailsOneOf.md)
* [BankRedirectDetailsOneOf1](BankRedirectDetailsOneOf1.md)
* [BankRedirectDetailsOneOf2](BankRedirectDetailsOneOf2.md)

## Example
```java
// Import classes:
import com.lumeweb.hyperswitch.model.BankRedirectDetails;
import com.lumeweb.hyperswitch.model.BankRedirectDetailsOneOf;
import com.lumeweb.hyperswitch.model.BankRedirectDetailsOneOf1;
import com.lumeweb.hyperswitch.model.BankRedirectDetailsOneOf2;

public class Example {
    public static void main(String[] args) {
        BankRedirectDetails exampleBankRedirectDetails = new BankRedirectDetails();

        // create a new BankRedirectDetailsOneOf
        BankRedirectDetailsOneOf exampleBankRedirectDetailsOneOf = new BankRedirectDetailsOneOf();
        // set BankRedirectDetails to BankRedirectDetailsOneOf
        exampleBankRedirectDetails.setActualInstance(exampleBankRedirectDetailsOneOf);
        // to get back the BankRedirectDetailsOneOf set earlier
        BankRedirectDetailsOneOf testBankRedirectDetailsOneOf = (BankRedirectDetailsOneOf) exampleBankRedirectDetails.getActualInstance();

        // create a new BankRedirectDetailsOneOf1
        BankRedirectDetailsOneOf1 exampleBankRedirectDetailsOneOf1 = new BankRedirectDetailsOneOf1();
        // set BankRedirectDetails to BankRedirectDetailsOneOf1
        exampleBankRedirectDetails.setActualInstance(exampleBankRedirectDetailsOneOf1);
        // to get back the BankRedirectDetailsOneOf1 set earlier
        BankRedirectDetailsOneOf1 testBankRedirectDetailsOneOf1 = (BankRedirectDetailsOneOf1) exampleBankRedirectDetails.getActualInstance();

        // create a new BankRedirectDetailsOneOf2
        BankRedirectDetailsOneOf2 exampleBankRedirectDetailsOneOf2 = new BankRedirectDetailsOneOf2();
        // set BankRedirectDetails to BankRedirectDetailsOneOf2
        exampleBankRedirectDetails.setActualInstance(exampleBankRedirectDetailsOneOf2);
        // to get back the BankRedirectDetailsOneOf2 set earlier
        BankRedirectDetailsOneOf2 testBankRedirectDetailsOneOf2 = (BankRedirectDetailsOneOf2) exampleBankRedirectDetails.getActualInstance();
    }
}
```


