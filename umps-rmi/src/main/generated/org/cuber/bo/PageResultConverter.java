/*
 * Copyright (c) 2014 Red Hat, Inc. and others
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package org.cuber.bo;

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;

/**
 * Converter for {@link org.cuber.bo.PageResult}.
 *
 * NOTE: This class has been automatically generated from the {@link org.cuber.bo.PageResult} original class using Vert.x codegen.
 */
public class PageResultConverter {

  public static void fromJson(JsonObject json, PageResult obj) {
    if (json.getValue("pageNumber") instanceof Number) {
      obj.setPageNumber(((Number)json.getValue("pageNumber")).intValue());
    }
    if (json.getValue("pageSize") instanceof Number) {
      obj.setPageSize(((Number)json.getValue("pageSize")).intValue());
    }
    if (json.getValue("total") instanceof Number) {
      obj.setTotal(((Number)json.getValue("total")).intValue());
    }
  }

  public static void toJson(PageResult obj, JsonObject json) {
    json.put("pageNumber", obj.getPageNumber());
    json.put("pageSize", obj.getPageSize());
    json.put("total", obj.getTotal());
  }
}