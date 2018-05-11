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

package org.cuber.umps.bo;

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;

/**
 * Converter for {@link org.cuber.umps.bo.PagingUserResp}.
 *
 * NOTE: This class has been automatically generated from the {@link org.cuber.umps.bo.PagingUserResp} original class using Vert.x codegen.
 */
public class PagingUserRespConverter {

  public static void fromJson(JsonObject json, PagingUserResp obj) {
    if (json.getValue("consumer") instanceof String) {
      obj.setConsumer((String)json.getValue("consumer"));
    }
    if (json.getValue("pageResult") instanceof JsonObject) {
      obj.setPageResult(new org.cuber.bo.PageResult((JsonObject)json.getValue("pageResult")));
    }
    if (json.getValue("producer") instanceof String) {
      obj.setProducer((String)json.getValue("producer"));
    }
    if (json.getValue("records") instanceof JsonArray) {
      java.util.ArrayList<org.cuber.umps.bo.UserBo> list = new java.util.ArrayList<>();
      json.getJsonArray("records").forEach( item -> {
        if (item instanceof JsonObject)
          list.add(new org.cuber.umps.bo.UserBo((JsonObject)item));
      });
      obj.setRecords(list);
    }
    if (json.getValue("resultDesc") instanceof String) {
      obj.setResultDesc((String)json.getValue("resultDesc"));
    }
  }

  public static void toJson(PagingUserResp obj, JsonObject json) {
    if (obj.getConsumer() != null) {
      json.put("consumer", obj.getConsumer());
    }
    if (obj.getPageResult() != null) {
      json.put("pageResult", obj.getPageResult().toJson());
    }
    if (obj.getProducer() != null) {
      json.put("producer", obj.getProducer());
    }
    if (obj.getRecords() != null) {
      JsonArray array = new JsonArray();
      obj.getRecords().forEach(item -> array.add(item.toJson()));
      json.put("records", array);
    }
    if (obj.getResultDesc() != null) {
      json.put("resultDesc", obj.getResultDesc());
    }
  }
}