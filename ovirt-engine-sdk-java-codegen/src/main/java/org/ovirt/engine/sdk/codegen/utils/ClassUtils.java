//
// Copyright (c) 2012 Red Hat, Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//           http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//

package org.ovirt.engine.sdk.codegen.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Utilities for handling class files.
 */
public class ClassUtils {
    /**
     * Saves the code of a class file.
     *
     * @param distPath the top level directory of the java sources
     * @param className the fully qualified name of the class
     * @param classCode the source code of the class
     */
    public static void saveClass(String distPath, String className, String classCode) {
        String classPath = distPath + File.separator + className.replace('.', File.separatorChar) + ".java";
        FileUtils.saveFile(classPath, classCode);
    }
}
