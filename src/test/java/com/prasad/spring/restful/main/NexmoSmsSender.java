package com.prasad.spring.restful.main;

import com.nexmo.messaging.sdk.NexmoSmsClient;
import com.nexmo.messaging.sdk.SmsSubmissionResult;
import com.nexmo.messaging.sdk.messages.TextMessage;

public class NexmoSmsSender {
	public static void main(String[] args) {
		SmsSubmissionResult results[] = null;
		try {
			NexmoSmsClient client = new NexmoSmsClient("0b827fc2", "65ddb3a4");
	        TextMessage message = new TextMessage("Satya", "919177148783", "Just Hello from Satya.");
			results = client.submitMessage(message);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.print("Reply: ");
		for (int i = 0; i < results.length; i++) {
			SmsSubmissionResult smsSubmissionResult = results[i];
			System.out.println("Status:" + smsSubmissionResult.getStatus() + ",");
			System.out.println("Error:" + smsSubmissionResult.getErrorText() + ",");
			System.out.println("MessageId:" + smsSubmissionResult.getMessageId() + ",");
			System.out.println("Price:" + smsSubmissionResult.getMessagePrice() + ",");
			System.out.println("Remaining Price:" + smsSubmissionResult.getRemainingBalance() + ",");
		}
		
	}

}
