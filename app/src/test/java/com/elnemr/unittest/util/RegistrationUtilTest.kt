package com.elnemr.unittest.util

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun `empty username returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "",
            "123",
            "123"
        )

        assertThat(result).isFalse()
    }

   @Test
    fun `empty password returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Mahmoud",
            "",
            "123"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `password less than 2 digit returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Mahmoud",
            "1",
            "1"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `confirmed password and password not match returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Mahmoud",
            "123",
            "abc"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `exist username returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Ahmed",
            "123",
            "123"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correct password returns true`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Mohammed",
            "123",
            "123"
        )

        assertThat(result).isTrue()
    }
}