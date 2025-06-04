package com.example.kotlindesignpattern


interface Shape {
    fun draw()
}

class Circle : Shape {
    override fun draw() = println("Drawing Circle")
}

class Square : Shape {
    override fun draw() = println("Drawing Square")
}

object ShapeFactory {
    fun createShape(type: String): Shape = when (type) {
        "circle" -> Circle()
        "square" -> Square()
        else -> throw IllegalArgumentException("Unknown shape")
    }
}
