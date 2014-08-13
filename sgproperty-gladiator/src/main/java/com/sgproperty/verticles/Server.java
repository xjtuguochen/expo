package com.sgproperty.verticles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.vertx.java.core.AsyncResult;
import org.vertx.java.core.Handler;
import org.vertx.java.core.Vertx;
import org.vertx.java.core.VertxFactory;
import org.vertx.java.core.eventbus.EventBus;
import org.vertx.java.core.eventbus.Message;
import org.vertx.java.core.json.JsonObject;
import org.vertx.java.platform.Verticle;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by johndoe on 8/12/14.
 */
public class Server extends Verticle {

    static Logger logger = LoggerFactory.getLogger(Server.class);

    public static void main(String[] args) throws InterruptedException {
        Vertx vertx = VertxFactory.newVertx();
        EventBus eventBus = vertx.eventBus();

        eventBus.registerHandler("test.address", new Handler<Message<JsonObject>>() {
            @Override
            public void handle(Message<JsonObject> event) {
                logger.debug("working {} ", event.body().toString());
            }
        }, event -> {
            if (event.succeeded()) {
                Map<String, Object> jsonMsg = new HashMap<String, Object>();
                jsonMsg.put("field1", "filedValue");
                eventBus.publish("test.address", new JsonObject(jsonMsg));
            }
        });
        Thread.sleep(10000);
    }

}
