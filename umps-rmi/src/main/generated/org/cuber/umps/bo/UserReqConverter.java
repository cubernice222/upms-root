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
 * Converter for {@link org.cuber.umps.bo.UserReq}.
 *
 * NOTE: This class has been automatically generated from the {@link org.cuber.umps.bo.UserReq} original class using Vert.x codegen.
 */
public class UserReqConverter {

  public static void fromJson(JsonObject json, UserReq obj) {
    if (json.getValue("bizDesc") instanceof String) {
      obj.setBizDesc((String)json.getValue("bizDesc"));
    }
    if (json.getValue("consumer") instanceof String) {
      obj.setConsumer((String)json.getValue("consumer"));
    }
    if (json.getValue("producer") instanceof String) {
      obj.setProducer((String)json.getValue("producer"));
    }
    if (json.getValue("traceId") instanceof String) {
      obj.setTraceId((String)json.getValue("traceId"));
    }
    if (json.getValue("userBo") instanceof JsonObject) {
      obj.setUserBo(new org.cuber.umps.bo.UserBo((JsonObject)json.getValue("userBo")));
    }
  }

  public static void toJson(UserReq obj, JsonObject json) {
    if (obj.getBizDesc() != null) {
      json.put("bizDesc", obj.getBizDesc());
    }
    if (obj.getConsumer() != null) {
      json.put("consumer", obj.getConsumer());
    }
    if (obj.getProducer() != null) {
      json.put("producer", obj.getProducer());
    }
    if (obj.getTraceId() != null) {
      json.put("traceId", obj.getTraceId());
    }
    if (obj.getUserBo() != null) {
      json.put("userBo", obj.getUserBo().toJson());
    }
  }
}