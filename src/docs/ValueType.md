

# ValueType

Represents a value in the DSL

## oneOf schemas
* [ValueTypeOneOf](ValueTypeOneOf.md)
* [ValueTypeOneOf1](ValueTypeOneOf1.md)
* [ValueTypeOneOf2](ValueTypeOneOf2.md)
* [ValueTypeOneOf3](ValueTypeOneOf3.md)
* [ValueTypeOneOf4](ValueTypeOneOf4.md)
* [ValueTypeOneOf5](ValueTypeOneOf5.md)
* [ValueTypeOneOf6](ValueTypeOneOf6.md)

## Example
```java
// Import classes:
import com.hyperswitch.model.ValueType;
import com.hyperswitch.model.ValueTypeOneOf;
import com.hyperswitch.model.ValueTypeOneOf1;
import com.hyperswitch.model.ValueTypeOneOf2;
import com.hyperswitch.model.ValueTypeOneOf3;
import com.hyperswitch.model.ValueTypeOneOf4;
import com.hyperswitch.model.ValueTypeOneOf5;
import com.hyperswitch.model.ValueTypeOneOf6;

public class Example {
    public static void main(String[] args) {
        ValueType exampleValueType = new ValueType();

        // create a new ValueTypeOneOf
        ValueTypeOneOf exampleValueTypeOneOf = new ValueTypeOneOf();
        // set ValueType to ValueTypeOneOf
        exampleValueType.setActualInstance(exampleValueTypeOneOf);
        // to get back the ValueTypeOneOf set earlier
        ValueTypeOneOf testValueTypeOneOf = (ValueTypeOneOf) exampleValueType.getActualInstance();

        // create a new ValueTypeOneOf1
        ValueTypeOneOf1 exampleValueTypeOneOf1 = new ValueTypeOneOf1();
        // set ValueType to ValueTypeOneOf1
        exampleValueType.setActualInstance(exampleValueTypeOneOf1);
        // to get back the ValueTypeOneOf1 set earlier
        ValueTypeOneOf1 testValueTypeOneOf1 = (ValueTypeOneOf1) exampleValueType.getActualInstance();

        // create a new ValueTypeOneOf2
        ValueTypeOneOf2 exampleValueTypeOneOf2 = new ValueTypeOneOf2();
        // set ValueType to ValueTypeOneOf2
        exampleValueType.setActualInstance(exampleValueTypeOneOf2);
        // to get back the ValueTypeOneOf2 set earlier
        ValueTypeOneOf2 testValueTypeOneOf2 = (ValueTypeOneOf2) exampleValueType.getActualInstance();

        // create a new ValueTypeOneOf3
        ValueTypeOneOf3 exampleValueTypeOneOf3 = new ValueTypeOneOf3();
        // set ValueType to ValueTypeOneOf3
        exampleValueType.setActualInstance(exampleValueTypeOneOf3);
        // to get back the ValueTypeOneOf3 set earlier
        ValueTypeOneOf3 testValueTypeOneOf3 = (ValueTypeOneOf3) exampleValueType.getActualInstance();

        // create a new ValueTypeOneOf4
        ValueTypeOneOf4 exampleValueTypeOneOf4 = new ValueTypeOneOf4();
        // set ValueType to ValueTypeOneOf4
        exampleValueType.setActualInstance(exampleValueTypeOneOf4);
        // to get back the ValueTypeOneOf4 set earlier
        ValueTypeOneOf4 testValueTypeOneOf4 = (ValueTypeOneOf4) exampleValueType.getActualInstance();

        // create a new ValueTypeOneOf5
        ValueTypeOneOf5 exampleValueTypeOneOf5 = new ValueTypeOneOf5();
        // set ValueType to ValueTypeOneOf5
        exampleValueType.setActualInstance(exampleValueTypeOneOf5);
        // to get back the ValueTypeOneOf5 set earlier
        ValueTypeOneOf5 testValueTypeOneOf5 = (ValueTypeOneOf5) exampleValueType.getActualInstance();

        // create a new ValueTypeOneOf6
        ValueTypeOneOf6 exampleValueTypeOneOf6 = new ValueTypeOneOf6();
        // set ValueType to ValueTypeOneOf6
        exampleValueType.setActualInstance(exampleValueTypeOneOf6);
        // to get back the ValueTypeOneOf6 set earlier
        ValueTypeOneOf6 testValueTypeOneOf6 = (ValueTypeOneOf6) exampleValueType.getActualInstance();
    }
}
```


