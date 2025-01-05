

# FieldType

Possible field type of required fields in payment_method_data

## oneOf schemas
* [FieldTypeOneOf](FieldTypeOneOf.md)
* [FieldTypeOneOf1](FieldTypeOneOf1.md)
* [FieldTypeOneOf2](FieldTypeOneOf2.md)
* [FieldTypeOneOf3](FieldTypeOneOf3.md)
* [FieldTypeOneOf4](FieldTypeOneOf4.md)
* [FieldTypeOneOf5](FieldTypeOneOf5.md)
* [String](String.md)

## Example
```java
// Import classes:
import com.lumeweb.hyperswitch.model.FieldType;
import com.lumeweb.hyperswitch.model.FieldTypeOneOf;
import com.lumeweb.hyperswitch.model.FieldTypeOneOf1;
import com.lumeweb.hyperswitch.model.FieldTypeOneOf2;
import com.lumeweb.hyperswitch.model.FieldTypeOneOf3;
import com.lumeweb.hyperswitch.model.FieldTypeOneOf4;
import com.lumeweb.hyperswitch.model.FieldTypeOneOf5;
import com.lumeweb.hyperswitch.model.String;

public class Example {
    public static void main(String[] args) {
        FieldType exampleFieldType = new FieldType();

        // create a new FieldTypeOneOf
        FieldTypeOneOf exampleFieldTypeOneOf = new FieldTypeOneOf();
        // set FieldType to FieldTypeOneOf
        exampleFieldType.setActualInstance(exampleFieldTypeOneOf);
        // to get back the FieldTypeOneOf set earlier
        FieldTypeOneOf testFieldTypeOneOf = (FieldTypeOneOf) exampleFieldType.getActualInstance();

        // create a new FieldTypeOneOf1
        FieldTypeOneOf1 exampleFieldTypeOneOf1 = new FieldTypeOneOf1();
        // set FieldType to FieldTypeOneOf1
        exampleFieldType.setActualInstance(exampleFieldTypeOneOf1);
        // to get back the FieldTypeOneOf1 set earlier
        FieldTypeOneOf1 testFieldTypeOneOf1 = (FieldTypeOneOf1) exampleFieldType.getActualInstance();

        // create a new FieldTypeOneOf2
        FieldTypeOneOf2 exampleFieldTypeOneOf2 = new FieldTypeOneOf2();
        // set FieldType to FieldTypeOneOf2
        exampleFieldType.setActualInstance(exampleFieldTypeOneOf2);
        // to get back the FieldTypeOneOf2 set earlier
        FieldTypeOneOf2 testFieldTypeOneOf2 = (FieldTypeOneOf2) exampleFieldType.getActualInstance();

        // create a new FieldTypeOneOf3
        FieldTypeOneOf3 exampleFieldTypeOneOf3 = new FieldTypeOneOf3();
        // set FieldType to FieldTypeOneOf3
        exampleFieldType.setActualInstance(exampleFieldTypeOneOf3);
        // to get back the FieldTypeOneOf3 set earlier
        FieldTypeOneOf3 testFieldTypeOneOf3 = (FieldTypeOneOf3) exampleFieldType.getActualInstance();

        // create a new FieldTypeOneOf4
        FieldTypeOneOf4 exampleFieldTypeOneOf4 = new FieldTypeOneOf4();
        // set FieldType to FieldTypeOneOf4
        exampleFieldType.setActualInstance(exampleFieldTypeOneOf4);
        // to get back the FieldTypeOneOf4 set earlier
        FieldTypeOneOf4 testFieldTypeOneOf4 = (FieldTypeOneOf4) exampleFieldType.getActualInstance();

        // create a new FieldTypeOneOf5
        FieldTypeOneOf5 exampleFieldTypeOneOf5 = new FieldTypeOneOf5();
        // set FieldType to FieldTypeOneOf5
        exampleFieldType.setActualInstance(exampleFieldTypeOneOf5);
        // to get back the FieldTypeOneOf5 set earlier
        FieldTypeOneOf5 testFieldTypeOneOf5 = (FieldTypeOneOf5) exampleFieldType.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set FieldType to String
        exampleFieldType.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleFieldType.getActualInstance();
    }
}
```


