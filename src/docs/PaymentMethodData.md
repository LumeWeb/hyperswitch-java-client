

# PaymentMethodData

## oneOf schemas
* [BankDebit](BankDebit.md)
* [BankRedirect](BankRedirect.md)
* [BankTransfer](BankTransfer.md)
* [Card1](Card1.md)
* [CardRedirect](CardRedirect.md)
* [CardToken1](CardToken1.md)
* [Crypto](Crypto.md)
* [GiftCard](GiftCard.md)
* [OpenBanking](OpenBanking.md)
* [PayLater](PayLater.md)
* [RealTimePayment](RealTimePayment.md)
* [String](String.md)
* [Upi](Upi.md)
* [Voucher](Voucher.md)
* [Wallet1](Wallet1.md)

## Example
```java
// Import classes:
import com.hyperswitch.model.PaymentMethodData;
import com.hyperswitch.model.BankDebit;
import com.hyperswitch.model.BankRedirect;
import com.hyperswitch.model.BankTransfer;
import com.hyperswitch.model.Card1;
import com.hyperswitch.model.CardRedirect;
import com.hyperswitch.model.CardToken1;
import com.hyperswitch.model.Crypto;
import com.hyperswitch.model.GiftCard;
import com.hyperswitch.model.OpenBanking;
import com.hyperswitch.model.PayLater;
import com.hyperswitch.model.RealTimePayment;
import com.hyperswitch.model.String;
import com.hyperswitch.model.Upi;
import com.hyperswitch.model.Voucher;
import com.hyperswitch.model.Wallet1;

public class Example {
    public static void main(String[] args) {
        PaymentMethodData examplePaymentMethodData = new PaymentMethodData();

        // create a new BankDebit
        BankDebit exampleBankDebit = new BankDebit();
        // set PaymentMethodData to BankDebit
        examplePaymentMethodData.setActualInstance(exampleBankDebit);
        // to get back the BankDebit set earlier
        BankDebit testBankDebit = (BankDebit) examplePaymentMethodData.getActualInstance();

        // create a new BankRedirect
        BankRedirect exampleBankRedirect = new BankRedirect();
        // set PaymentMethodData to BankRedirect
        examplePaymentMethodData.setActualInstance(exampleBankRedirect);
        // to get back the BankRedirect set earlier
        BankRedirect testBankRedirect = (BankRedirect) examplePaymentMethodData.getActualInstance();

        // create a new BankTransfer
        BankTransfer exampleBankTransfer = new BankTransfer();
        // set PaymentMethodData to BankTransfer
        examplePaymentMethodData.setActualInstance(exampleBankTransfer);
        // to get back the BankTransfer set earlier
        BankTransfer testBankTransfer = (BankTransfer) examplePaymentMethodData.getActualInstance();

        // create a new Card1
        Card1 exampleCard1 = new Card1();
        // set PaymentMethodData to Card1
        examplePaymentMethodData.setActualInstance(exampleCard1);
        // to get back the Card1 set earlier
        Card1 testCard1 = (Card1) examplePaymentMethodData.getActualInstance();

        // create a new CardRedirect
        CardRedirect exampleCardRedirect = new CardRedirect();
        // set PaymentMethodData to CardRedirect
        examplePaymentMethodData.setActualInstance(exampleCardRedirect);
        // to get back the CardRedirect set earlier
        CardRedirect testCardRedirect = (CardRedirect) examplePaymentMethodData.getActualInstance();

        // create a new CardToken1
        CardToken1 exampleCardToken1 = new CardToken1();
        // set PaymentMethodData to CardToken1
        examplePaymentMethodData.setActualInstance(exampleCardToken1);
        // to get back the CardToken1 set earlier
        CardToken1 testCardToken1 = (CardToken1) examplePaymentMethodData.getActualInstance();

        // create a new Crypto
        Crypto exampleCrypto = new Crypto();
        // set PaymentMethodData to Crypto
        examplePaymentMethodData.setActualInstance(exampleCrypto);
        // to get back the Crypto set earlier
        Crypto testCrypto = (Crypto) examplePaymentMethodData.getActualInstance();

        // create a new GiftCard
        GiftCard exampleGiftCard = new GiftCard();
        // set PaymentMethodData to GiftCard
        examplePaymentMethodData.setActualInstance(exampleGiftCard);
        // to get back the GiftCard set earlier
        GiftCard testGiftCard = (GiftCard) examplePaymentMethodData.getActualInstance();

        // create a new OpenBanking
        OpenBanking exampleOpenBanking = new OpenBanking();
        // set PaymentMethodData to OpenBanking
        examplePaymentMethodData.setActualInstance(exampleOpenBanking);
        // to get back the OpenBanking set earlier
        OpenBanking testOpenBanking = (OpenBanking) examplePaymentMethodData.getActualInstance();

        // create a new PayLater
        PayLater examplePayLater = new PayLater();
        // set PaymentMethodData to PayLater
        examplePaymentMethodData.setActualInstance(examplePayLater);
        // to get back the PayLater set earlier
        PayLater testPayLater = (PayLater) examplePaymentMethodData.getActualInstance();

        // create a new RealTimePayment
        RealTimePayment exampleRealTimePayment = new RealTimePayment();
        // set PaymentMethodData to RealTimePayment
        examplePaymentMethodData.setActualInstance(exampleRealTimePayment);
        // to get back the RealTimePayment set earlier
        RealTimePayment testRealTimePayment = (RealTimePayment) examplePaymentMethodData.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set PaymentMethodData to String
        examplePaymentMethodData.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) examplePaymentMethodData.getActualInstance();

        // create a new Upi
        Upi exampleUpi = new Upi();
        // set PaymentMethodData to Upi
        examplePaymentMethodData.setActualInstance(exampleUpi);
        // to get back the Upi set earlier
        Upi testUpi = (Upi) examplePaymentMethodData.getActualInstance();

        // create a new Voucher
        Voucher exampleVoucher = new Voucher();
        // set PaymentMethodData to Voucher
        examplePaymentMethodData.setActualInstance(exampleVoucher);
        // to get back the Voucher set earlier
        Voucher testVoucher = (Voucher) examplePaymentMethodData.getActualInstance();

        // create a new Wallet1
        Wallet1 exampleWallet1 = new Wallet1();
        // set PaymentMethodData to Wallet1
        examplePaymentMethodData.setActualInstance(exampleWallet1);
        // to get back the Wallet1 set earlier
        Wallet1 testWallet1 = (Wallet1) examplePaymentMethodData.getActualInstance();
    }
}
```


