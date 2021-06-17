package com.saikalyandaroju.testingdemo.utils;

import org.junit.Before;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;


public class RegistrationUtilsTest {


    @Test
    public void empty_field_return_false() {
        boolean res = RegistrationUtils.validateUser("", "sai", "123", "123");
        assertThat(res).isFalse();
    }

    @Test
    public void not_valid_email_return_false() {
        boolean res = RegistrationUtils.validateUser("saikalyan.com", "sai", "123456", "123456");
        assertThat(res).isFalse();
    }


    @Test
    public void password_notequals_confirmpassword_return_false() {
        boolean res = RegistrationUtils.validateUser("saikalyan@gmail.com", "sai", "123", "abc");
        assertThat(res).isFalse();
    }

    @Test
    public void password_length_less_than_6_return_false() {
        boolean res = RegistrationUtils.validateUser("saikalyan@gmail.com", "sai", "123", "123");
        assertThat(res).isFalse();
    }

    @Test
    public void all_fileds_ok_return_true() {
        boolean res = RegistrationUtils.validateUser("saikalyan@gmail.com", "sai", "123456", "123456");
        assertThat(res).isTrue();
    }
}