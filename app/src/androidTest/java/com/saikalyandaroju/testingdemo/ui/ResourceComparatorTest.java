package com.saikalyandaroju.testingdemo.ui;

import android.content.Context;

import androidx.test.core.app.ApplicationProvider;

import com.saikalyandaroju.testingdemo.R;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class ResourceComparatorTest {
    ResourceComparator resourceComparator;

   // method intializes object for every individual test case freshly.
    @Before
    public void setup(){
      resourceComparator=new ResourceComparator();
    }
    @After
    public void teardown(){

    }

    @Test
    public void Stringres_sameas_typedString_return_true(){
        Context context= ApplicationProvider.getApplicationContext();
        boolean res=resourceComparator.isEqual(context, R.string.app_name,"TestingDemo");
        assertThat(res).isTrue();
    }

    @Test
    public void Stringres_not_sameas_typedString_return_false(){
        Context context= ApplicationProvider.getApplicationContext();
        boolean res=resourceComparator.isEqual(context, R.string.app_name,"Testing");
        assertThat(res).isFalse();
    }

}