/**
 * Copyright 2010 Google Inc.
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

package com.google.gag.annotation.literary;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import com.google.gag.enumeration.Feet;
import com.google.gag.enumeration.Measure;

/**
 * Indicates that the annotated code follows the specified poetic meter.
 */
@Retention(RetentionPolicy.SOURCE)
public @interface Meter {
  Feet feet();
  Measure measure() default Measure.UNSPECIFIED;
}
