

# OutgoingWebhookContent

## oneOf schemas
* [DisputeResponse1](DisputeResponse1.md)
* [MandateResponse1](MandateResponse1.md)
* [PaymentsResponse1](PaymentsResponse1.md)
* [PayoutCreateResponse1](PayoutCreateResponse1.md)
* [RefundResponse1](RefundResponse1.md)

## Example
```java
// Import classes:
import com.hyperswitch.model.OutgoingWebhookContent;
import com.hyperswitch.model.DisputeResponse1;
import com.hyperswitch.model.MandateResponse1;
import com.hyperswitch.model.PaymentsResponse1;
import com.hyperswitch.model.PayoutCreateResponse1;
import com.hyperswitch.model.RefundResponse1;

public class Example {
    public static void main(String[] args) {
        OutgoingWebhookContent exampleOutgoingWebhookContent = new OutgoingWebhookContent();

        // create a new DisputeResponse1
        DisputeResponse1 exampleDisputeResponse1 = new DisputeResponse1();
        // set OutgoingWebhookContent to DisputeResponse1
        exampleOutgoingWebhookContent.setActualInstance(exampleDisputeResponse1);
        // to get back the DisputeResponse1 set earlier
        DisputeResponse1 testDisputeResponse1 = (DisputeResponse1) exampleOutgoingWebhookContent.getActualInstance();

        // create a new MandateResponse1
        MandateResponse1 exampleMandateResponse1 = new MandateResponse1();
        // set OutgoingWebhookContent to MandateResponse1
        exampleOutgoingWebhookContent.setActualInstance(exampleMandateResponse1);
        // to get back the MandateResponse1 set earlier
        MandateResponse1 testMandateResponse1 = (MandateResponse1) exampleOutgoingWebhookContent.getActualInstance();

        // create a new PaymentsResponse1
        PaymentsResponse1 examplePaymentsResponse1 = new PaymentsResponse1();
        // set OutgoingWebhookContent to PaymentsResponse1
        exampleOutgoingWebhookContent.setActualInstance(examplePaymentsResponse1);
        // to get back the PaymentsResponse1 set earlier
        PaymentsResponse1 testPaymentsResponse1 = (PaymentsResponse1) exampleOutgoingWebhookContent.getActualInstance();

        // create a new PayoutCreateResponse1
        PayoutCreateResponse1 examplePayoutCreateResponse1 = new PayoutCreateResponse1();
        // set OutgoingWebhookContent to PayoutCreateResponse1
        exampleOutgoingWebhookContent.setActualInstance(examplePayoutCreateResponse1);
        // to get back the PayoutCreateResponse1 set earlier
        PayoutCreateResponse1 testPayoutCreateResponse1 = (PayoutCreateResponse1) exampleOutgoingWebhookContent.getActualInstance();

        // create a new RefundResponse1
        RefundResponse1 exampleRefundResponse1 = new RefundResponse1();
        // set OutgoingWebhookContent to RefundResponse1
        exampleOutgoingWebhookContent.setActualInstance(exampleRefundResponse1);
        // to get back the RefundResponse1 set earlier
        RefundResponse1 testRefundResponse1 = (RefundResponse1) exampleOutgoingWebhookContent.getActualInstance();
    }
}
```


