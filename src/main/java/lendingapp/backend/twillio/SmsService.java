package lendingapp.backend.twillio;

import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;


@Component
public class SmsService {


    private final String ACCOUNT_SID ="enter your SID Number from Twilio";

    private final String AUTH_TOKEN = "enter your Auth token from Twilio Account";

    private final String FROM_NUMBER = "enter the phone number generated from Twilio";

    public void send(SmsEntity sms) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message.creator(new PhoneNumber(sms.getNumberToReceiveMessage()), new PhoneNumber(FROM_NUMBER), "hi friend you are" +
                "requested to aprove loan for mr/mrs")
                .create();
        System.out.println("here is my id:"+message.getSid());// Unique resource ID created to manage this transaction

    }

    public void receive(MultiValueMap<String, String> smscallback) {
    }}
