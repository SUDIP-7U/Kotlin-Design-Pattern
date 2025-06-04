package com.example.kotlindesignpattern

interface PaymentStrategy {
    fun pay(amount: Int)
}

class CreditCardPayment : PaymentStrategy {
    override fun pay(amount: Int) = println("Paid $amount with Credit Card")
}

class PayPalPayment : PaymentStrategy {
    override fun pay(amount: Int) = println("Paid $amount with PayPal")
}

class PaymentContext(private var strategy: PaymentStrategy) {
    fun setStrategy(strategy: PaymentStrategy) {
        this.strategy = strategy
    }

    fun pay(amount: Int) = strategy.pay(amount)
}
