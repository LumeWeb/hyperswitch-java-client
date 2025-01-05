

# AcceptedCurrencies

## oneOf schemas
* [AcceptedCountriesOneOf2](AcceptedCountriesOneOf2.md)
* [AcceptedCurrenciesOneOf](AcceptedCurrenciesOneOf.md)
* [AcceptedCurrenciesOneOf1](AcceptedCurrenciesOneOf1.md)

## Example
```java
// Import classes:
import com.hyperswitch.model.AcceptedCurrencies;
import com.hyperswitch.model.AcceptedCountriesOneOf2;
import com.hyperswitch.model.AcceptedCurrenciesOneOf;
import com.hyperswitch.model.AcceptedCurrenciesOneOf1;

public class Example {
    public static void main(String[] args) {
        AcceptedCurrencies exampleAcceptedCurrencies = new AcceptedCurrencies();

        // create a new AcceptedCountriesOneOf2
        AcceptedCountriesOneOf2 exampleAcceptedCountriesOneOf2 = new AcceptedCountriesOneOf2();
        // set AcceptedCurrencies to AcceptedCountriesOneOf2
        exampleAcceptedCurrencies.setActualInstance(exampleAcceptedCountriesOneOf2);
        // to get back the AcceptedCountriesOneOf2 set earlier
        AcceptedCountriesOneOf2 testAcceptedCountriesOneOf2 = (AcceptedCountriesOneOf2) exampleAcceptedCurrencies.getActualInstance();

        // create a new AcceptedCurrenciesOneOf
        AcceptedCurrenciesOneOf exampleAcceptedCurrenciesOneOf = new AcceptedCurrenciesOneOf();
        // set AcceptedCurrencies to AcceptedCurrenciesOneOf
        exampleAcceptedCurrencies.setActualInstance(exampleAcceptedCurrenciesOneOf);
        // to get back the AcceptedCurrenciesOneOf set earlier
        AcceptedCurrenciesOneOf testAcceptedCurrenciesOneOf = (AcceptedCurrenciesOneOf) exampleAcceptedCurrencies.getActualInstance();

        // create a new AcceptedCurrenciesOneOf1
        AcceptedCurrenciesOneOf1 exampleAcceptedCurrenciesOneOf1 = new AcceptedCurrenciesOneOf1();
        // set AcceptedCurrencies to AcceptedCurrenciesOneOf1
        exampleAcceptedCurrencies.setActualInstance(exampleAcceptedCurrenciesOneOf1);
        // to get back the AcceptedCurrenciesOneOf1 set earlier
        AcceptedCurrenciesOneOf1 testAcceptedCurrenciesOneOf1 = (AcceptedCurrenciesOneOf1) exampleAcceptedCurrencies.getActualInstance();
    }
}
```


