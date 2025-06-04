package com.example.kotlindesignpattern

class Pizza private constructor(
    val cheese: Boolean,
    val pepperoni: Boolean,
    val bacon: Boolean
) {
    class Builder {
        private var cheese = false
        private var pepperoni = false
        private var bacon = false

        fun cheese(value: Boolean) = apply { cheese = value }
        fun pepperoni(value: Boolean) = apply { pepperoni = value }
        fun bacon(value: Boolean) = apply { bacon = value }

        fun build() = Pizza(cheese, pepperoni, bacon)
    }
}
