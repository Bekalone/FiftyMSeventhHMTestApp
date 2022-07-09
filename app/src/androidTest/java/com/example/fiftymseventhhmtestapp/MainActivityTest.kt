package com.example.fiftymseventhhmtestapp

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4


@RunWith(JUnit4::class)
class MainActivityTest {

    @Rule @JvmField
    var snario = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun addSimple(){
        onView(withId(R.id.et_first)).perform(typeText("4"))
        onView(withId(R.id.et_second)).perform(typeText("5"))
        onView(withId(R.id.btn_plus)).perform(click())
        onView(withId(R.id.tv_result)).check(matches(withText("9")))
    }

    @Test
    fun divide(){
        onView(withId(R.id.et_first)).perform(typeText("6"))
        onView(withId(R.id.et_second)).perform(typeText("2"))
        onView(withId(R.id.btn_divide)).perform(click())
        onView(withId(R.id.tv_result)).check(matches(withText("3")))
    }

}