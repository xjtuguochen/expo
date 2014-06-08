package com.terracotta;

import static org.hamcrest.Matchers.*;

import org.junit.Test;

import static org.junit.Assert.assertThat;


/**
 * Created by johndoe on 6/8/14.
 */
public class AppTest {
    @Test
    public void testEqual() {
        assertThat(1, equalTo(1));
    }
}
