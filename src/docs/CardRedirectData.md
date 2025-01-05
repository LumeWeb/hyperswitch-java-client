

# CardRedirectData

## oneOf schemas
* [CardRedirectDataOneOf](CardRedirectDataOneOf.md)
* [CardRedirectDataOneOf1](CardRedirectDataOneOf1.md)
* [CardRedirectDataOneOf2](CardRedirectDataOneOf2.md)
* [CardRedirectDataOneOf3](CardRedirectDataOneOf3.md)

## Example
```java
// Import classes:
import com.lumeweb.hyperswitch.model.CardRedirectData;
import com.lumeweb.hyperswitch.model.CardRedirectDataOneOf;
import com.lumeweb.hyperswitch.model.CardRedirectDataOneOf1;
import com.lumeweb.hyperswitch.model.CardRedirectDataOneOf2;
import com.lumeweb.hyperswitch.model.CardRedirectDataOneOf3;

public class Example {
    public static void main(String[] args) {
        CardRedirectData exampleCardRedirectData = new CardRedirectData();

        // create a new CardRedirectDataOneOf
        CardRedirectDataOneOf exampleCardRedirectDataOneOf = new CardRedirectDataOneOf();
        // set CardRedirectData to CardRedirectDataOneOf
        exampleCardRedirectData.setActualInstance(exampleCardRedirectDataOneOf);
        // to get back the CardRedirectDataOneOf set earlier
        CardRedirectDataOneOf testCardRedirectDataOneOf = (CardRedirectDataOneOf) exampleCardRedirectData.getActualInstance();

        // create a new CardRedirectDataOneOf1
        CardRedirectDataOneOf1 exampleCardRedirectDataOneOf1 = new CardRedirectDataOneOf1();
        // set CardRedirectData to CardRedirectDataOneOf1
        exampleCardRedirectData.setActualInstance(exampleCardRedirectDataOneOf1);
        // to get back the CardRedirectDataOneOf1 set earlier
        CardRedirectDataOneOf1 testCardRedirectDataOneOf1 = (CardRedirectDataOneOf1) exampleCardRedirectData.getActualInstance();

        // create a new CardRedirectDataOneOf2
        CardRedirectDataOneOf2 exampleCardRedirectDataOneOf2 = new CardRedirectDataOneOf2();
        // set CardRedirectData to CardRedirectDataOneOf2
        exampleCardRedirectData.setActualInstance(exampleCardRedirectDataOneOf2);
        // to get back the CardRedirectDataOneOf2 set earlier
        CardRedirectDataOneOf2 testCardRedirectDataOneOf2 = (CardRedirectDataOneOf2) exampleCardRedirectData.getActualInstance();

        // create a new CardRedirectDataOneOf3
        CardRedirectDataOneOf3 exampleCardRedirectDataOneOf3 = new CardRedirectDataOneOf3();
        // set CardRedirectData to CardRedirectDataOneOf3
        exampleCardRedirectData.setActualInstance(exampleCardRedirectDataOneOf3);
        // to get back the CardRedirectDataOneOf3 set earlier
        CardRedirectDataOneOf3 testCardRedirectDataOneOf3 = (CardRedirectDataOneOf3) exampleCardRedirectData.getActualInstance();
    }
}
```


