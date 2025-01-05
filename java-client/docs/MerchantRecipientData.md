

# MerchantRecipientData

## oneOf schemas
* [MerchantRecipientDataOneOf](MerchantRecipientDataOneOf.md)
* [MerchantRecipientDataOneOf1](MerchantRecipientDataOneOf1.md)
* [MerchantRecipientDataOneOf2](MerchantRecipientDataOneOf2.md)

## Example
```java
// Import classes:
import com.lumeweb.hyperswitch.model.MerchantRecipientData;
import com.lumeweb.hyperswitch.model.MerchantRecipientDataOneOf;
import com.lumeweb.hyperswitch.model.MerchantRecipientDataOneOf1;
import com.lumeweb.hyperswitch.model.MerchantRecipientDataOneOf2;

public class Example {
    public static void main(String[] args) {
        MerchantRecipientData exampleMerchantRecipientData = new MerchantRecipientData();

        // create a new MerchantRecipientDataOneOf
        MerchantRecipientDataOneOf exampleMerchantRecipientDataOneOf = new MerchantRecipientDataOneOf();
        // set MerchantRecipientData to MerchantRecipientDataOneOf
        exampleMerchantRecipientData.setActualInstance(exampleMerchantRecipientDataOneOf);
        // to get back the MerchantRecipientDataOneOf set earlier
        MerchantRecipientDataOneOf testMerchantRecipientDataOneOf = (MerchantRecipientDataOneOf) exampleMerchantRecipientData.getActualInstance();

        // create a new MerchantRecipientDataOneOf1
        MerchantRecipientDataOneOf1 exampleMerchantRecipientDataOneOf1 = new MerchantRecipientDataOneOf1();
        // set MerchantRecipientData to MerchantRecipientDataOneOf1
        exampleMerchantRecipientData.setActualInstance(exampleMerchantRecipientDataOneOf1);
        // to get back the MerchantRecipientDataOneOf1 set earlier
        MerchantRecipientDataOneOf1 testMerchantRecipientDataOneOf1 = (MerchantRecipientDataOneOf1) exampleMerchantRecipientData.getActualInstance();

        // create a new MerchantRecipientDataOneOf2
        MerchantRecipientDataOneOf2 exampleMerchantRecipientDataOneOf2 = new MerchantRecipientDataOneOf2();
        // set MerchantRecipientData to MerchantRecipientDataOneOf2
        exampleMerchantRecipientData.setActualInstance(exampleMerchantRecipientDataOneOf2);
        // to get back the MerchantRecipientDataOneOf2 set earlier
        MerchantRecipientDataOneOf2 testMerchantRecipientDataOneOf2 = (MerchantRecipientDataOneOf2) exampleMerchantRecipientData.getActualInstance();
    }
}
```


