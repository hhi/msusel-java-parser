/**
 * The MIT License (MIT)
 *
 * MSUSEL Java Parser
 * Copyright (c) 2015-2017 Montana State University, Gianforte School of Computing,
 * Software Engineering Laboratory
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package edu.montana.gsoc.msusel.codetree.parsers;

import edu.montana.gsoc.msusel.codetree.node.Accessibility;
import edu.montana.gsoc.msusel.codetree.node.Modifiers;
import edu.montana.gsoc.msusel.codetree.node.type.ClassNode;
import edu.montana.gsoc.msusel.codetree.node.type.EnumNode;
import edu.montana.gsoc.msusel.codetree.node.type.InterfaceNode;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BasicTypesTest extends BaseTestClass {

    @Before
    public void setUp() throws Exception {
        JavaCodeTreeBuilder builder = new JavaCodeTreeBuilder();
        tree = builder.build("Test", "./data/java-test-project/BasicTypes");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testAbstractClass() {
        retrieveType("AbstractClass", Accessibility.PUBLIC, ClassNode.class, Modifiers.ABSTRACT);
    }

    @Test
    public void testBasicClass() {
        retrieveType("BasicClass", Accessibility.PUBLIC, ClassNode.class);
    }

    @Test
    public void testBasicEnum() {
        retrieveType("BasicEnum", Accessibility.PUBLIC, EnumNode.class);
    }

    @Test
    public void testBasicInterface() {
        retrieveType("BasicInterface", Accessibility.PUBLIC, InterfaceNode.class);
    }

    @Test
    public void testFinalClass() {
        retrieveType("FinalClass", Accessibility.PUBLIC, ClassNode.class, Modifiers.FINAL);
    }

    @Test
    public void testFinalStaticClass() {
        retrieveType("FinalStaticClass", Accessibility.PUBLIC, ClassNode.class, Modifiers.FINAL, Modifiers.STATIC);
    }
}
