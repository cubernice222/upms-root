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
 * Converter for {@link org.cuber.umps.bo.UserBo}.
 *
 * NOTE: This class has been automatically generated from the {@link org.cuber.umps.bo.UserBo} original class using Vert.x codegen.
 */
public class UserBoConverter {

  public static void fromJson(JsonObject json, UserBo obj) {
    if (json.getValue("avatar") instanceof String) {
      obj.setAvatar((String)json.getValue("avatar"));
    }
    if (json.getValue("consumer") instanceof String) {
      obj.setConsumer((String)json.getValue("consumer"));
    }
    if (json.getValue("corpNumber") instanceof String) {
      obj.setCorpNumber((String)json.getValue("corpNumber"));
    }
    if (json.getValue("dingUserId") instanceof String) {
      obj.setDingUserId((String)json.getValue("dingUserId"));
    }
    if (json.getValue("email") instanceof String) {
      obj.setEmail((String)json.getValue("email"));
    }
    if (json.getValue("fullName") instanceof String) {
      obj.setFullName((String)json.getValue("fullName"));
    }
    if (json.getValue("operator") instanceof String) {
      obj.setOperator((String)json.getValue("operator"));
    }
    if (json.getValue("password") instanceof String) {
      obj.setPassword((String)json.getValue("password"));
    }
    if (json.getValue("phone") instanceof String) {
      obj.setPhone((String)json.getValue("phone"));
    }
    if (json.getValue("producer") instanceof String) {
      obj.setProducer((String)json.getValue("producer"));
    }
    if (json.getValue("sex") instanceof String) {
      obj.setSex((String)json.getValue("sex"));
    }
    if (json.getValue("status") instanceof String) {
      obj.setStatus((String)json.getValue("status"));
    }
    if (json.getValue("userId") instanceof Number) {
      obj.setUserId(((Number)json.getValue("userId")).intValue());
    }
    if (json.getValue("userName") instanceof String) {
      obj.setUserName((String)json.getValue("userName"));
    }
    if (json.getValue("wechatUserId") instanceof String) {
      obj.setWechatUserId((String)json.getValue("wechatUserId"));
    }
  }

  public static void toJson(UserBo obj, JsonObject json) {
    if (obj.getAvatar() != null) {
      json.put("avatar", obj.getAvatar());
    }
    if (obj.getConsumer() != null) {
      json.put("consumer", obj.getConsumer());
    }
    if (obj.getCorpNumber() != null) {
      json.put("corpNumber", obj.getCorpNumber());
    }
    if (obj.getDingUserId() != null) {
      json.put("dingUserId", obj.getDingUserId());
    }
    if (obj.getEmail() != null) {
      json.put("email", obj.getEmail());
    }
    if (obj.getFullName() != null) {
      json.put("fullName", obj.getFullName());
    }
    if (obj.getOperator() != null) {
      json.put("operator", obj.getOperator());
    }
    if (obj.getPassword() != null) {
      json.put("password", obj.getPassword());
    }
    if (obj.getPhone() != null) {
      json.put("phone", obj.getPhone());
    }
    if (obj.getProducer() != null) {
      json.put("producer", obj.getProducer());
    }
    if (obj.getSex() != null) {
      json.put("sex", obj.getSex());
    }
    if (obj.getStatus() != null) {
      json.put("status", obj.getStatus());
    }
    if (obj.getUserId() != null) {
      json.put("userId", obj.getUserId());
    }
    if (obj.getUserName() != null) {
      json.put("userName", obj.getUserName());
    }
    if (obj.getWechatUserId() != null) {
      json.put("wechatUserId", obj.getWechatUserId());
    }
  }
}