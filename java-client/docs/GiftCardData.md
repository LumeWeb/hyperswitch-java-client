

# GiftCardData

## oneOf schemas
* [GiftCardAdditionalDataOneOf1](GiftCardAdditionalDataOneOf1.md)
* [GiftCardDataOneOf](GiftCardDataOneOf.md)

## Example
```java
// Import classes:
import com.lumeweb.hyperswitch.model.GiftCardData;
import com.lumeweb.hyperswitch.model.GiftCardAdditionalDataOneOf1;
import com.lumeweb.hyperswitch.model.GiftCardDataOneOf;

public class Example {
    public static void main(String[] args) {
        GiftCardData exampleGiftCardData = new GiftCardData();

        // create a new GiftCardAdditionalDataOneOf1
        GiftCardAdditionalDataOneOf1 exampleGiftCardAdditionalDataOneOf1 = new GiftCardAdditionalDataOneOf1();
        // set GiftCardData to GiftCardAdditionalDataOneOf1
        exampleGiftCardData.setActualInstance(exampleGiftCardAdditionalDataOneOf1);
        // to get back the GiftCardAdditionalDataOneOf1 set earlier
        GiftCardAdditionalDataOneOf1 testGiftCardAdditionalDataOneOf1 = (GiftCardAdditionalDataOneOf1) exampleGiftCardData.getActualInstance();

        // create a new GiftCardDataOneOf
        GiftCardDataOneOf exampleGiftCardDataOneOf = new GiftCardDataOneOf();
        // set GiftCardData to GiftCardDataOneOf
        exampleGiftCardData.setActualInstance(exampleGiftCardDataOneOf);
        // to get back the GiftCardDataOneOf set earlier
        GiftCardDataOneOf testGiftCardDataOneOf = (GiftCardDataOneOf) exampleGiftCardData.getActualInstance();
    }
}
```


