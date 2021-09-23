package org.acme;

import org.acme.User.ServiceUserTest;

import io.quarkus.test.junit.NativeImageTest;

@NativeImageTest
public class NativeGreetingResourceIT extends ServiceUserTest {

    // Execute the same tests but in native mode.
}