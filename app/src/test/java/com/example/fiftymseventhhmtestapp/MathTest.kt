package com.example.fiftymseventhhmtestapp

import junit.framework.Assert.assertEquals
import org.junit.After
import org.junit.Before
import org.junit.Test

class MathTest {

    private var math: Math? = null

    @Before
    fun install() {
        math = Math()
    }

    @Test
    fun simpleAdd(){
        assertEquals("4",math?.add("2","2"))
    }


    @Test
    fun minusAdd(){
        assertEquals("Отрицательное указывать нельзя",math?.add("2","---2"))
    }

    @Test
    fun emptyAdd(){
        assertEquals("Пустоту прибавить нельзя",math?.add("2",""))
    }

    @Test
    fun spaceAdd(){
        assertEquals("4",math?.add("2","     2       "))
    }


    @Test
    fun floatAdd(){
        assertEquals("4.5",math?.add("2","2.5f"))
    }
    @Test
    fun addSymbol(){
        assertEquals("Символ вводить нельзя",math?.add("2","zxczxczx"))
    }

    @Test
    fun simpleDivide(){
        assertEquals("3",math?.divide("6","2"))
    }
    @Test
    fun divideOnZero(){
        assertEquals("Делить на ноль нельзя",math?.divide("6","0"))
    }

    @After
    fun detach() {
        math = null

    }
}