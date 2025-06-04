package com.example.kotlindesignpattern

class Observable {
    private val observers = mutableListOf<(String) -> Unit>()

    fun subscribe(observer: (String) -> Unit) {
        observers.add(observer)
    }

    fun notifyAll(message: String) {
        observers.forEach { it(message) }
    }
}
