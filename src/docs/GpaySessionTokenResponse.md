

# GpaySessionTokenResponse

## oneOf schemas
* [GooglePaySessionResponse](GooglePaySessionResponse.md)
* [GooglePayThirdPartySdk](GooglePayThirdPartySdk.md)

## Example
```java
// Import classes:
import com.hyperswitch.model.GpaySessionTokenResponse;
import com.hyperswitch.model.GooglePaySessionResponse;
import com.hyperswitch.model.GooglePayThirdPartySdk;

public class Example {
    public static void main(String[] args) {
        GpaySessionTokenResponse exampleGpaySessionTokenResponse = new GpaySessionTokenResponse();

        // create a new GooglePaySessionResponse
        GooglePaySessionResponse exampleGooglePaySessionResponse = new GooglePaySessionResponse();
        // set GpaySessionTokenResponse to GooglePaySessionResponse
        exampleGpaySessionTokenResponse.setActualInstance(exampleGooglePaySessionResponse);
        // to get back the GooglePaySessionResponse set earlier
        GooglePaySessionResponse testGooglePaySessionResponse = (GooglePaySessionResponse) exampleGpaySessionTokenResponse.getActualInstance();

        // create a new GooglePayThirdPartySdk
        GooglePayThirdPartySdk exampleGooglePayThirdPartySdk = new GooglePayThirdPartySdk();
        // set GpaySessionTokenResponse to GooglePayThirdPartySdk
        exampleGpaySessionTokenResponse.setActualInstance(exampleGooglePayThirdPartySdk);
        // to get back the GooglePayThirdPartySdk set earlier
        GooglePayThirdPartySdk testGooglePayThirdPartySdk = (GooglePayThirdPartySdk) exampleGpaySessionTokenResponse.getActualInstance();
    }
}
```


