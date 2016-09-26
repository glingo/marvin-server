package com.marvin.server.event;

import com.marvin.server.Server;
import com.marvin.component.event.Event;

public class ServerEvent extends Event {

    private Server server;

    public ServerEvent(Server server) {
        super();
        this.server = server;
    }

    public Server getServer() {
        return server;
    }

    public void setServer(Server server) {
        this.server = server;
    }

}
