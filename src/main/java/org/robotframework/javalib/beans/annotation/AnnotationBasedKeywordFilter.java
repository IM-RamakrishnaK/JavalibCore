/*
 * Copyright 2013 Nokia Solutions and Networks Oyj
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

package org.robotframework.javalib.beans.annotation;

import org.robotframework.javalib.annotation.RobotKeywords;
import org.robotframework.javalib.beans.common.BasicKeywordFilter;

public class AnnotationBasedKeywordFilter extends BasicKeywordFilter {
    public AnnotationBasedKeywordFilter() {
        addCondition(new HasKeywordAnnotationCondition());
    }

    private class HasKeywordAnnotationCondition implements Condition {
        public boolean check(Class clazz) {
            return clazz.isAnnotationPresent(RobotKeywords.class);
        }
    }
}
