

# GiftCardAdditionalData

## oneOf schemas
* [GiftCardAdditionalDataOneOf](GiftCardAdditionalDataOneOf.md)
* [GiftCardAdditionalDataOneOf1](GiftCardAdditionalDataOneOf1.md)

## Example
```java
// Import classes:
import com.lumeweb.hyperswitch.model.GiftCardAdditionalData;
import com.lumeweb.hyperswitch.model.GiftCardAdditionalDataOneOf;
import com.lumeweb.hyperswitch.model.GiftCardAdditionalDataOneOf1;

public class Example {
    public static void main(String[] args) {
        GiftCardAdditionalData exampleGiftCardAdditionalData = new GiftCardAdditionalData();

        // create a new GiftCardAdditionalDataOneOf
        GiftCardAdditionalDataOneOf exampleGiftCardAdditionalDataOneOf = new GiftCardAdditionalDataOneOf();
        // set GiftCardAdditionalData to GiftCardAdditionalDataOneOf
        exampleGiftCardAdditionalData.setActualInstance(exampleGiftCardAdditionalDataOneOf);
        // to get back the GiftCardAdditionalDataOneOf set earlier
        GiftCardAdditionalDataOneOf testGiftCardAdditionalDataOneOf = (GiftCardAdditionalDataOneOf) exampleGiftCardAdditionalData.getActualInstance();

        // create a new GiftCardAdditionalDataOneOf1
        GiftCardAdditionalDataOneOf1 exampleGiftCardAdditionalDataOneOf1 = new GiftCardAdditionalDataOneOf1();
        // set GiftCardAdditionalData to GiftCardAdditionalDataOneOf1
        exampleGiftCardAdditionalData.setActualInstance(exampleGiftCardAdditionalDataOneOf1);
        // to get back the GiftCardAdditionalDataOneOf1 set earlier
        GiftCardAdditionalDataOneOf1 testGiftCardAdditionalDataOneOf1 = (GiftCardAdditionalDataOneOf1) exampleGiftCardAdditionalData.getActualInstance();
    }
}
```


