package se.tarlinder.dependencies.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PaymentFileParser {

    public List<Payment> readPaymentFile(String filename) throws IOException {
        List<Payment> parsedPayments = new ArrayList<>();
        File paymentFile = new File(filename);
        BufferedReader reader = new BufferedReader(new FileReader(paymentFile));
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
