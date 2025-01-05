

# AcceptedCountries

Object to filter the customer countries for which the payment method is displayed

## oneOf schemas
* [AcceptedCountriesOneOf](AcceptedCountriesOneOf.md)
* [AcceptedCountriesOneOf1](AcceptedCountriesOneOf1.md)
* [AcceptedCountriesOneOf2](AcceptedCountriesOneOf2.md)

## Example
```java
// Import classes:
import com.hyperswitch.model.AcceptedCountries;
import com.hyperswitch.model.AcceptedCountriesOneOf;
import com.hyperswitch.model.AcceptedCountriesOneOf1;
import com.hyperswitch.model.AcceptedCountriesOneOf2;

public class Example {
    public static void main(String[] args) {
        AcceptedCountries exampleAcceptedCountries = new AcceptedCountries();

        // create a new AcceptedCountriesOneOf
        AcceptedCountriesOneOf exampleAcceptedCountriesOneOf = new AcceptedCountriesOneOf();
        // set AcceptedCountries to AcceptedCountriesOneOf
        exampleAcceptedCountries.setActualInstance(exampleAcceptedCountriesOneOf);
        // to get back the AcceptedCountriesOneOf set earlier
        AcceptedCountriesOneOf testAcceptedCountriesOneOf = (AcceptedCountriesOneOf) exampleAcceptedCountries.getActualInstance();

        // create a new AcceptedCountriesOneOf1
        AcceptedCountriesOneOf1 exampleAcceptedCountriesOneOf1 = new AcceptedCountriesOneOf1();
        // set AcceptedCountries to AcceptedCountriesOneOf1
        exampleAcceptedCountries.setActualInstance(exampleAcceptedCountriesOneOf1);
        // to get back the AcceptedCountriesOneOf1 set earlier
        AcceptedCountriesOneOf1 testAcceptedCountriesOneOf1 = (AcceptedCountriesOneOf1) exampleAcceptedCountries.getActualInstance();

        // create a new AcceptedCountriesOneOf2
        AcceptedCountriesOneOf2 exampleAcceptedCountriesOneOf2 = new AcceptedCountriesOneOf2();
        // set AcceptedCountries to AcceptedCountriesOneOf2
        exampleAcceptedCountries.setActualInstance(exampleAcceptedCountriesOneOf2);
        // to get back the AcceptedCountriesOneOf2 set earlier
        AcceptedCountriesOneOf2 testAcceptedCountriesOneOf2 = (AcceptedCountriesOneOf2) exampleAcceptedCountries.getActualInstance();
    }
}
```


