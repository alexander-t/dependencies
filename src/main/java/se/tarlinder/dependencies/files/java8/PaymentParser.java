package se.tarlinder.dependencies.files.java8;

import se.tarlinder.dependencies.files.Payment;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PaymentParser {

    public List<Payment> readPayments(Stream<String> lines) {
        return lines.map(this::parsePayment).collect(Collectors.toList());
    }

    private Payment parsePayment(String line) {
        Payment payment = new Payment();
        payment.setId(Long.valueOf(line.substring(0, 10)));
        return payment;
    }
}
