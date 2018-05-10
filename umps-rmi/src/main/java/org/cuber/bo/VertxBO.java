package org.cuber.bo;

import io.vertx.core.json.JsonObject;

public abstract class VertxBO {
    protected String producer;
    protected String consumer;

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getConsumer() {
        return consumer;
    }

    public void setConsumer(String consumer) {
        this.consumer = consumer;
    }

    public VertxBO() {
    }

    public VertxBO(JsonObject jsonObject) {
    }

    public abstract JsonObject toJson();
}
