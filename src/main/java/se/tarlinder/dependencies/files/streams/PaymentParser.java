package se.tarlinder.dependencies.files.streams;

import se.tarlinder.dependencies.files.Payment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PaymentParser {

    public List<Payment> readPayments(InputStream inputStream) throws IOException {
        List<Payment> parsedPayments = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String line;
        while ((line = reader.readLine()) != null) {
            Payment payment = new Payment();
            payment.setId(Long.valueOf(line.substring(0, 10)));

            // Rest of the "logic" for parsing the file goes here...
            parsedPayments.add(payment);
        }
        return parsedPayments;
    }
}
