package com.example.iw.themesample;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

/**
 * Created by iw on 05/05/16.
 */
public class MainActivityTest extends
        ActivityInstrumentationTestCase2<MainActivity> {

    private MainActivity mTestActivity;

    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        // Starts the activity under test using
        // the default Intent with:
        // action = {@link Intent#ACTION_MAIN}
        // flags = {@link Intent#FLAG_ACTIVITY_NEW_TASK}
        // All other fields are null or empty.
        mTestActivity = getActivity();

    }

    /**
     * Test if your test fixture has been set up correctly.
     * You should always implement a test that
     * checks the correct setup of your test fixture.
     * If this tests fails all other tests are
     * likely to fail as well.
     */
    public void testPreconditions() {
        // Try to add a message to add context to your assertions.
        // These messages will be shown if
        // a tests fails and make it easy to
        // understand why a test failed
        //assertNotNull("mTestActivity is null", mTestActivity);
    }

}