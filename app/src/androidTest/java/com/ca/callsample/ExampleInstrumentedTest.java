package com.ca.callsample;
import android.content.Context;

import org.junit.Test;
import org.junit.runner.RunWith;
import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;

import androidx.test.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        Context appContext = InstrumentationRegistry.getTargetContext();
        assertEquals("com.ca.callsample", appContext.getPackageName());
    }
}
