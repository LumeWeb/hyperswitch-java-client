

# MerchantAccountData

## oneOf schemas
* [MerchantAccountDataOneOf](MerchantAccountDataOneOf.md)
* [MerchantAccountDataOneOf1](MerchantAccountDataOneOf1.md)

## Example
```java
// Import classes:
import com.hyperswitch.model.MerchantAccountData;
import com.hyperswitch.model.MerchantAccountDataOneOf;
import com.hyperswitch.model.MerchantAccountDataOneOf1;

public class Example {
    public static void main(String[] args) {
        MerchantAccountData exampleMerchantAccountData = new MerchantAccountData();

        // create a new MerchantAccountDataOneOf
        MerchantAccountDataOneOf exampleMerchantAccountDataOneOf = new MerchantAccountDataOneOf();
        // set MerchantAccountData to MerchantAccountDataOneOf
        exampleMerchantAccountData.setActualInstance(exampleMerchantAccountDataOneOf);
        // to get back the MerchantAccountDataOneOf set earlier
        MerchantAccountDataOneOf testMerchantAccountDataOneOf = (MerchantAccountDataOneOf) exampleMerchantAccountData.getActualInstance();

        // create a new MerchantAccountDataOneOf1
        MerchantAccountDataOneOf1 exampleMerchantAccountDataOneOf1 = new MerchantAccountDataOneOf1();
        // set MerchantAccountData to MerchantAccountDataOneOf1
        exampleMerchantAccountData.setActualInstance(exampleMerchantAccountDataOneOf1);
        // to get back the MerchantAccountDataOneOf1 set earlier
        MerchantAccountDataOneOf1 testMerchantAccountDataOneOf1 = (MerchantAccountDataOneOf1) exampleMerchantAccountData.getActualInstance();
    }
}
```


