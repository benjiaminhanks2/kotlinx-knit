/*
 * Copyright 2016-2020 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license.
 */

package kotlinx.knit

import org.junit.Test
import kotlinx.knit.test.*

class CaptureVerifyTest {
    @Test
    fun testBasic() {
        captureOutput("ExampleBasic01") { exampleMain() }.verifyOutputLines(
            "Hello, world!"
        )
    }

    private fun exampleMain() {
        println("Hello, world!")
    }

    @Test
    fun testPredicate() {
        captureOutput("ExamplePredicate01") { predicateMain() }.also { lines ->
            check(lines.single().toInt() in 1..100)
        }
    }

    private fun predicateMain() {
        println(42)
    }
}

