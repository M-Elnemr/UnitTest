package com.elnemr.unittest.util

object RegistrationUtil {

    private val existingUsers = listOf("Ahmed", "Ali")
    /**
     * the input is not valid if ...
     * ... the username/password is empty
     * ... the password contains less than 2 digits
     * ... the confirmed password not the same as the password
     * ... the username is already taken
     */
    fun validateRegistrationInput(
        userName: String,
        password: String,
        confirmedPassword: String
    ): Boolean {
        if (userName.isEmpty() || password.isEmpty()) return false
        if (password.count { it.isDigit() } < 2) return false
        if (confirmedPassword != password) return false
        if (userName in existingUsers) return false
        return true
    }
}