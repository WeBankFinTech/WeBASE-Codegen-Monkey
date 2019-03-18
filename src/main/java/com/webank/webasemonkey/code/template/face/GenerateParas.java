/**
 * Copyright 2014-2019 the original author or authors.
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
package com.webank.webasemonkey.code.template.face;

import java.util.Map;

/**
 * RenderParas
 *
 * @Description: RenderParas
 * @author maojiayu
 * @date 2018-11-12 16:09:42
 * 
 */
public interface GenerateParas<T> {
    /**
     * @Description: wrap the render data to a map. And the render data is basically read from a pojo.
     * @param: @param t
     * @return: Map<String,Object>
     */
    public Map<String, Object> getMap(T t);

    /**
     * @Description: return the path of template.
     * @return: String
     */
    public String getTemplatePath();

    /**
     * @Description: return the path of generated files.
     * @param: @param t
     * @return: String
     */
    public String getGeneratedFilePath(T t);
}
