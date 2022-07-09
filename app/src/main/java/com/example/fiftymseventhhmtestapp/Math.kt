package com.example.fiftymseventhhmtestapp

class Math {

    fun add(num1: String, num2: String): String {
        val result:String
        if (num1.contains("-") || num2.contains("-")) {
            result = "Отрицательное указывать нельзя"
        } else if (num1.isEmpty() || num2.isEmpty()) {
            result = "Пустоту прибавить нельзя"
        } else if (num1.contains(".") || num2.contains(".")) {
            result = (num1.toFloat() + num2.toFloat()).toString()
        } else if (num1.contains(Regex("[a-z]"))||num2.contains(Regex("[a-z]"))) {
            result = "Символ вводить нельзя"
        } else {
            result = (num1.trim().toInt() + num2.trim().toInt()).toString()
        }
        return result
    }

    fun divide(num1: String, num2: String): String {
        val result:String
        if (num2 == "0") {
            result = "Делить на ноль нельзя"
        } else {
            result = (num1.trim().toInt() / num2.trim().toInt()).toString()
        }
        return result
    }
}