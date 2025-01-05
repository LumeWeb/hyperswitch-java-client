

# RecurringDetails

Details required for recurring payment

## oneOf schemas
* [RecurringDetailsOneOf](RecurringDetailsOneOf.md)
* [RecurringDetailsOneOf1](RecurringDetailsOneOf1.md)
* [RecurringDetailsOneOf2](RecurringDetailsOneOf2.md)
* [RecurringDetailsOneOf3](RecurringDetailsOneOf3.md)

## Example
```java
// Import classes:
import com.hyperswitch.model.RecurringDetails;
import com.hyperswitch.model.RecurringDetailsOneOf;
import com.hyperswitch.model.RecurringDetailsOneOf1;
import com.hyperswitch.model.RecurringDetailsOneOf2;
import com.hyperswitch.model.RecurringDetailsOneOf3;

public class Example {
    public static void main(String[] args) {
        RecurringDetails exampleRecurringDetails = new RecurringDetails();

        // create a new RecurringDetailsOneOf
        RecurringDetailsOneOf exampleRecurringDetailsOneOf = new RecurringDetailsOneOf();
        // set RecurringDetails to RecurringDetailsOneOf
        exampleRecurringDetails.setActualInstance(exampleRecurringDetailsOneOf);
        // to get back the RecurringDetailsOneOf set earlier
        RecurringDetailsOneOf testRecurringDetailsOneOf = (RecurringDetailsOneOf) exampleRecurringDetails.getActualInstance();

        // create a new RecurringDetailsOneOf1
        RecurringDetailsOneOf1 exampleRecurringDetailsOneOf1 = new RecurringDetailsOneOf1();
        // set RecurringDetails to RecurringDetailsOneOf1
        exampleRecurringDetails.setActualInstance(exampleRecurringDetailsOneOf1);
        // to get back the RecurringDetailsOneOf1 set earlier
        RecurringDetailsOneOf1 testRecurringDetailsOneOf1 = (RecurringDetailsOneOf1) exampleRecurringDetails.getActualInstance();

        // create a new RecurringDetailsOneOf2
        RecurringDetailsOneOf2 exampleRecurringDetailsOneOf2 = new RecurringDetailsOneOf2();
        // set RecurringDetails to RecurringDetailsOneOf2
        exampleRecurringDetails.setActualInstance(exampleRecurringDetailsOneOf2);
        // to get back the RecurringDetailsOneOf2 set earlier
        RecurringDetailsOneOf2 testRecurringDetailsOneOf2 = (RecurringDetailsOneOf2) exampleRecurringDetails.getActualInstance();

        // create a new RecurringDetailsOneOf3
        RecurringDetailsOneOf3 exampleRecurringDetailsOneOf3 = new RecurringDetailsOneOf3();
        // set RecurringDetails to RecurringDetailsOneOf3
        exampleRecurringDetails.setActualInstance(exampleRecurringDetailsOneOf3);
        // to get back the RecurringDetailsOneOf3 set earlier
        RecurringDetailsOneOf3 testRecurringDetailsOneOf3 = (RecurringDetailsOneOf3) exampleRecurringDetails.getActualInstance();
    }
}
```


