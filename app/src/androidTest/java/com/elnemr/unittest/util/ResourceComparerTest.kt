package com.elnemr.unittest.util

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.elnemr.unittest.R
import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test

class ResourceComparerTest {
    // every test case must be independent so we use @Before to init resourceComparer before every test case
    private lateinit var resourceComparer: ResourceComparer

    // runs before every test case
    @Before
    fun setup(){
        resourceComparer = ResourceComparer()
    }

    // runs after every test case
    @After
    fun tearDown(){
    // destroy instances
    }

    @Test
    fun stringResourceSameAsGivenString_returnsTrue() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(context, R.string.app_name, "UnitTest")

        assertThat(result).isTrue()
    }
    @Test
    fun stringResourceNotSameAsGivenString_returnsFalse() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(context, R.string.app_name, "abcd")

        assertThat(result).isFalse()
    }
}