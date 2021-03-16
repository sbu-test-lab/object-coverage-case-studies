#!/bin/sh
cd evosuite-tests
find . -name '*scaffolding.java' -delete
find . -name '*_ESTest.java' | xargs sed -i -E "s/ extends .*\{/\{/ "
find . -name '*_ESTest.java' | xargs sed -i "s/@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)//"
cd ..

