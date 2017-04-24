/*
 * Copyright 2014 Jin Kwon.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.jinahya.example;

/**
 * A main class.
 *
 * @author Jin Kwon &lt;jinahya_at_gmail.com&gt;
 */
public class Main {

    public static void main(final String[] args) throws ClassNotFoundException {
        System.out.println(Class.forName("com.google.common.io.BaseEncoding"));
        System.out.println(Class.forName("com.google.inject.Injector"));
    }
}
