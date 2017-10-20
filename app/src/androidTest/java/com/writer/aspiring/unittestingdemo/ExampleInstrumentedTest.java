package com.writer.aspiring.unittestingdemo;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.ViewAssertion;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import junit.framework.TestCase;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;


import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withHint;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;


/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest  {

    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<>(MainActivity.class);



    @Test
    public void checkText() {
        String unMock[] = {"","Peter","Astrid","","Olivia","lincoln"};
        String pwMock[] = {"","","Bishop","Farnsworth","Dunham","Lee"};

        onView(withId(R.id.UserName)).check(matches(withHint("Username")));
        onView(withId(R.id.password)).check(matches(withHint("Password")));
        onView(withId(R.id.text_signin)).check(matches(withText("Sign In")));
        int i=4;
        //for (int i=0;i<unMock.length;i++) {
            onView(withId(R.id.UserName)).perform(typeText(unMock[i]));
            onView(withId(R.id.password)).perform(typeText(pwMock[i]));
            onView(withId(R.id.layout_signin)).perform(click());
            String msg = "Sign In Unsuccessful";
            if (i == 4)
                msg = "Sign In Successful";
            onView(withId(R.id.result_signin)).check(matches(withText(msg)));
        //}
    }
}
