/*
 * Copyright 2010-2014 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.jet.asJava;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.jet.JUnit3RunnerWithInners;
import org.jetbrains.jet.JetTestUtils;
import org.jetbrains.jet.test.InnerTestClasses;
import org.jetbrains.jet.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.jet.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/asJava/lightClasses")
@TestDataPath("$PROJECT_ROOT")
@InnerTestClasses({KotlinLightClassTestGenerated.Delegation.class, KotlinLightClassTestGenerated.NullabilityAnnotations.class})
@RunWith(JUnit3RunnerWithInners.class)
public class KotlinLightClassTestGenerated extends AbstractKotlinLightClassTest {
    public void testAllFilesPresentInLightClasses() throws Exception {
        JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/asJava/lightClasses"), Pattern.compile("^(.+)\\.kt$"), true);
    }

    @TestMetadata("compiler/testData/asJava/lightClasses/delegation")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Delegation extends AbstractKotlinLightClassTest {
        public void testAllFilesPresentInDelegation() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/asJava/lightClasses/delegation"), Pattern.compile("^(.+)\\.kt$"), true);
        }

        @TestMetadata("Function.kt")
        public void testFunction() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/asJava/lightClasses/delegation/Function.kt");
            doTest(fileName);
        }

        @TestMetadata("Property.kt")
        public void testProperty() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/asJava/lightClasses/delegation/Property.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("compiler/testData/asJava/lightClasses/nullabilityAnnotations")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class NullabilityAnnotations extends AbstractKotlinLightClassTest {
        public void testAllFilesPresentInNullabilityAnnotations() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/asJava/lightClasses/nullabilityAnnotations"), Pattern.compile("^(.+)\\.kt$"), true);
        }

        @TestMetadata("Class.kt")
        public void testClass() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/asJava/lightClasses/nullabilityAnnotations/Class.kt");
            doTest(fileName);
        }

        @TestMetadata("ClassObjectField.kt")
        public void testClassObjectField() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/asJava/lightClasses/nullabilityAnnotations/ClassObjectField.kt");
            doTest(fileName);
        }

        @TestMetadata("ClassWithConstructor.kt")
        public void testClassWithConstructor() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/asJava/lightClasses/nullabilityAnnotations/ClassWithConstructor.kt");
            doTest(fileName);
        }

        @TestMetadata("ClassWithConstructorAndProperties.kt")
        public void testClassWithConstructorAndProperties() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/asJava/lightClasses/nullabilityAnnotations/ClassWithConstructorAndProperties.kt");
            doTest(fileName);
        }

        @TestMetadata("Generic.kt")
        public void testGeneric() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/asJava/lightClasses/nullabilityAnnotations/Generic.kt");
            doTest(fileName);
        }

        @TestMetadata("IntOverridesAny.kt")
        public void testIntOverridesAny() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/asJava/lightClasses/nullabilityAnnotations/IntOverridesAny.kt");
            doTest(fileName);
        }

        @TestMetadata("NullableUnitReturn.kt")
        public void testNullableUnitReturn() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/asJava/lightClasses/nullabilityAnnotations/NullableUnitReturn.kt");
            doTest(fileName);
        }

        @TestMetadata("OverrideAnyWithUnit.kt")
        public void testOverrideAnyWithUnit() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/asJava/lightClasses/nullabilityAnnotations/OverrideAnyWithUnit.kt");
            doTest(fileName);
        }

        @TestMetadata("PlatformTypes.kt")
        public void testPlatformTypes() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/asJava/lightClasses/nullabilityAnnotations/PlatformTypes.kt");
            doTest(fileName);
        }

        @TestMetadata("Primitives.kt")
        public void testPrimitives() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/asJava/lightClasses/nullabilityAnnotations/Primitives.kt");
            doTest(fileName);
        }

        @TestMetadata("PrivateInClass.kt")
        public void testPrivateInClass() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/asJava/lightClasses/nullabilityAnnotations/PrivateInClass.kt");
            doTest(fileName);
        }

        @TestMetadata("PrivateInTrait.kt")
        public void testPrivateInTrait() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/asJava/lightClasses/nullabilityAnnotations/PrivateInTrait.kt");
            doTest(fileName);
        }

        @TestMetadata("Synthetic.kt")
        public void testSynthetic() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/asJava/lightClasses/nullabilityAnnotations/Synthetic.kt");
            doTest(fileName);
        }

        @TestMetadata("Trait.kt")
        public void testTrait() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/asJava/lightClasses/nullabilityAnnotations/Trait.kt");
            doTest(fileName);
        }

        @TestMetadata("TraitClassObjectField.kt")
        public void testTraitClassObjectField() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/asJava/lightClasses/nullabilityAnnotations/TraitClassObjectField.kt");
            doTest(fileName);
        }

        @TestMetadata("UnitAsGenericArgument.kt")
        public void testUnitAsGenericArgument() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/asJava/lightClasses/nullabilityAnnotations/UnitAsGenericArgument.kt");
            doTest(fileName);
        }

        @TestMetadata("UnitParameter.kt")
        public void testUnitParameter() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/asJava/lightClasses/nullabilityAnnotations/UnitParameter.kt");
            doTest(fileName);
        }

        @TestMetadata("VoidReturn.kt")
        public void testVoidReturn() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/asJava/lightClasses/nullabilityAnnotations/VoidReturn.kt");
            doTest(fileName);
        }

        @TestMetadata("_DefaultPackage.kt")
        public void test_DefaultPackage() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/asJava/lightClasses/nullabilityAnnotations/_DefaultPackage.kt");
            doTest(fileName);
        }
    }
}
