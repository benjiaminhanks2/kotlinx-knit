// !!! AUTOMATICALLY GENERATED BY TestDataGen. DO NOT EDIT !!!
package kotlinx.knit

import kotlin.test.Test

class TestDataTest {
    // !!! AUTOMATICALLY GENERATED BY TestDataGen. DO NOT EDIT !!!
    @Test
    fun testExampleBasic() {
       verifyTestData(
           "ExampleBasic",
           "testdata/example-basic.in.md",
           "testdata/example-basic.in.md",
           "testdata/example-basic.properties",
           FileRef.Expect("testdata/example-basic/example-basic-01.kt")
       )
    }

    // !!! AUTOMATICALLY GENERATED BY TestDataGen. DO NOT EDIT !!!
    @Test
    fun testExampleInclude() {
       verifyTestData(
           "ExampleInclude",
           "testdata/example-include.in.md",
           "testdata/example-include.in.md",
           "testdata/example-include.properties",
           FileRef.Expect("testdata/example-include/example-include-01.kt")
       )
    }

    // !!! AUTOMATICALLY GENERATED BY TestDataGen. DO NOT EDIT !!!
    @Test
    fun testExampleMerge() {
       verifyTestData(
           "ExampleMerge",
           "testdata/example-merge.in.md",
           "testdata/example-merge.in.md",
           "testdata/example-merge.properties",
           FileRef.Expect("testdata/example-merge/example-merge-01.kt")
       )
    }

    // !!! AUTOMATICALLY GENERATED BY TestDataGen. DO NOT EDIT !!!
    @Test
    fun testExampleRenumber() {
       verifyTestData(
           "ExampleRenumber",
           "testdata/example-renumber.in.md",
           "testdata/example-renumber.out.md",
           "testdata/example-renumber.properties",
           FileRef.Expect("testdata/example-renumber/example-renumber-02.kt"),
           FileRef.Expect("testdata/example-renumber/example-renumber-01.kt")
       )
    }

    // !!! AUTOMATICALLY GENERATED BY TestDataGen. DO NOT EDIT !!!
    @Test
    fun testExampleToc() {
       verifyTestData(
           "ExampleToc",
           "testdata/example-toc.in.md",
           "testdata/example-toc.out.md",
           null
       )
    }

    // !!! AUTOMATICALLY GENERATED BY TestDataGen. DO NOT EDIT !!!
    @Test
    fun testIncludeProp() {
       verifyTestData(
           "IncludeProp",
           "testdata/include-prop.in.md",
           "testdata/include-prop.in.md",
           "testdata/include-prop.properties",
           FileRef.Copy("testdata/include-prop.copy.template"),
           FileRef.Expect("testdata/include-prop/example-include-01.kt")
       )
    }

    // !!! AUTOMATICALLY GENERATED BY TestDataGen. DO NOT EDIT !!!
    @Test
    fun testPatternProp() {
       verifyTestData(
           "PatternProp",
           "testdata/pattern-prop.in.md",
           "testdata/pattern-prop.out.md",
           "testdata/pattern-prop.properties",
           FileRef.Expect("testdata/pattern-prop/pattern-001.kt")
       )
    }

    // !!! AUTOMATICALLY GENERATED BY TestDataGen. DO NOT EDIT !!!
    @Test
    fun testTestBasic() {
       verifyTestData(
           "TestBasic",
           "testdata/test-basic.in.md",
           "testdata/test-basic.in.md",
           "testdata/test-basic.properties",
           FileRef.Expect("testdata/test-basic/test/BasicTest.kt"),
           FileRef.Expect("testdata/test-basic/example-basic-01.kt")
       )
    }

    // !!! AUTOMATICALLY GENERATED BY TestDataGen. DO NOT EDIT !!!
    @Test
    fun testTestHidden() {
       verifyTestData(
           "TestHidden",
           "testdata/test-hidden.in.md",
           "testdata/test-hidden.in.md",
           "testdata/test-hidden.properties"
       )
    }
}