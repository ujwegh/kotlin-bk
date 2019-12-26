package com.basrikahveci.p2p.peer.network.message.ping;

import com.basrikahveci.p2p.peer.Peer;
import com.basrikahveci.p2p.peer.network.Connection;
import com.basrikahveci.p2p.peer.network.message.Message;

/**
 * Contains information about a peer which responds to an incoming Ping message
 */
public class Pong implements Message {

    private static final long serialVersionUID = 2748377163219868853L;

    private final String pingPeerName;

    private final String senderPeerName;

    private final String peerName;

    private final String serverHost;

    private final int serverPort;

    private final int ttl;

    private final int hops;

    public Pong(String pingPeerName, String senderPeerName, String peerName, String serverHost, int serverPort, int ttl,
                int hops) {
        this.pingPeerName = pingPeerName;
        this.senderPeerName = senderPeerName;
        this.peerName = peerName;
        this.serverHost = serverHost;
        this.serverPort = serverPort;
        this.ttl = ttl;
        this.hops = hops;
    }

    public String getPingPeerName() {
        return pingPeerName;
    }

    public String getSenderPeerName() {
        return senderPeerName;
    }

    public String getPeerName() {
        return peerName;
    }

    public String getServerHost() {
        return serverHost;
    }

    public int getServerPort() {
        return serverPort;
    }

    public int getTtl() {
        return ttl;
    }

    public int getHops() {
        return hops;
    }

    public Pong next(final String thisPeerName) {
        return ttl > 1 ? new Pong(pingPeerName, thisPeerName, peerName, serverHost, serverPort, ttl - 1, hops + 1) : null;
    }

    public void handle(Peer peer, Connection connection) {
        peer.handlePong(connection, this);
    }

    @Override
    public String toString() {
        return "Pong{" +
                "pingPeerName='" + pingPeerName + '\'' +
                ", senderPeerName='" + senderPeerName + '\'' +
                ", peerName='" + peerName + '\'' +
                ", serverHost='" + serverHost + '\'' +
                ", serverPort=" + serverPort +
                ", ttl=" + ttl +
                ", hops=" + hops +
                '}';
    }

}
