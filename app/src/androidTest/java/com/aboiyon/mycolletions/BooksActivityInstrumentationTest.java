package com.aboiyon.mycolletions;

import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.RootMatchers.withDecorView;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.anything;
import static org.hamcrest.CoreMatchers.not;

import android.view.View;

import androidx.test.core.app.ActivityScenario;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class BooksActivityInstrumentationTest {
    @Rule
    public ActivityScenarioRule<BooksActivity>activityTestRule = new ActivityScenarioRule<BooksActivity>(BooksActivity.class);
    private View activityDecorView;

    @Before
    public void setUp(){
        activityTestRule.getScenario().onActivity(new ActivityScenario.ActivityAction<BooksActivity>() {
            @Override
            public void perform(BooksActivity activity) {
                activityDecorView = activity.getWindow().getDecorView();
            }
        });
    }

    @Test
    public void listItemClickDisplaysToastWithCorrectBook(){
        String bookName = "Java";
        onData(anything())
                .inAdapterView(withId(R.id.ListView))
                .atPosition(0)
                .perform(click());
        onView(withText(bookName)).inRoot(withDecorView(not(activityDecorView)))
                .check(matches(withText(bookName)));
    }
}
