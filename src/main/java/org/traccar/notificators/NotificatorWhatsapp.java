/*
 * Copyright 2018 Anton Tananaev (anton@traccar.org)
 * Copyright 2018 Andrey Kunitsyn (andrey@traccar.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.traccar.notificators;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.traccar.config.Config;
import org.traccar.config.Keys;
import org.traccar.config.KeysCustom;
import org.traccar.model.Event;
import org.traccar.model.Position;
import org.traccar.model.User;
import org.traccar.notification.NotificationFormatter;

import javax.inject.Inject;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.InvocationCallback;

public class NotificatorWhatsapp implements Notificator {
    private final NotificationFormatter notificationFormatter;
    private final Client client;

    private final String url;
    private final String key;

    private static final Logger LOGGER = LoggerFactory.getLogger(NotificatorWhatsapp.class);


    public static class Message {
        @JsonProperty("dest")
        private String dest;
        @JsonProperty("msg")
        private String msg;
    }

    @Inject
    public NotificatorWhatsapp(Config config, NotificationFormatter notificationFormatter, Client client) {
        this.notificationFormatter = notificationFormatter;
        this.client = client;
        this.url = config.getString(KeysCustom.NOTIFICATOR_WHATSAPP_URL);
        this.key = config.getString(KeysCustom.NOTIFICATOR_WHATSAPP_KEY);
    }

    @Override
    public void send(User user, Event event, Position position) {
        if(!user.getPhone().isEmpty()) {
            Message message = new Message();
            message.dest = user.getPhone().replace("+","").replace("-","") + "@c.us";
            message.msg = notificationFormatter.formatMessage(user, event, position, "short").getBody().trim();
            client.target(url + "msg/send").request()
                    .header("Authorization", "Bearer " + key)
                    .async().post(Entity.json(message), new InvocationCallback<Object>() {
                        @Override
                        public void completed(Object o) {
                        }

                        @Override
                        public void failed(Throwable throwable) {
                        }
                    });
        }
    }
}
