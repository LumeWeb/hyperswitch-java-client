

# AdditionalMerchantData

## oneOf schemas
* [AdditionalMerchantDataOneOf](AdditionalMerchantDataOneOf.md)

## Example
```java
// Import classes:
import com.lumeweb.hyperswitch.model.AdditionalMerchantData;
import com.lumeweb.hyperswitch.model.AdditionalMerchantDataOneOf;

public class Example {
    public static void main(String[] args) {
        AdditionalMerchantData exampleAdditionalMerchantData = new AdditionalMerchantData();

        // create a new AdditionalMerchantDataOneOf
        AdditionalMerchantDataOneOf exampleAdditionalMerchantDataOneOf = new AdditionalMerchantDataOneOf();
        // set AdditionalMerchantData to AdditionalMerchantDataOneOf
        exampleAdditionalMerchantData.setActualInstance(exampleAdditionalMerchantDataOneOf);
        // to get back the AdditionalMerchantDataOneOf set earlier
        AdditionalMerchantDataOneOf testAdditionalMerchantDataOneOf = (AdditionalMerchantDataOneOf) exampleAdditionalMerchantData.getActualInstance();
    }
}
```


