package com.jpdev.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.jpdev.hrpayroll.entities.Payment;

@Service
public class PaymentService {
	
	public Payment getpayment(long workerId, int days) {
		return new Payment ("Bob", 200.0, days);
	}

}
