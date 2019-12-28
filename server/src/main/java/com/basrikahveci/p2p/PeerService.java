package com.basrikahveci.p2p;

import com.basrikahveci.p2p.peer.Command;
import com.basrikahveci.p2p.peer.Config;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;

public class PeerService {
    private static final Logger LOGGER = LoggerFactory.getLogger(PeerService.class);

    private final String peerName = UUID.randomUUID().toString();
    private Integer bindPort;

    public PeerService(Integer bindPort) {
        this.bindPort = bindPort;
    }

    public void createNewPeerLeader() throws InterruptedException {
        LOGGER.info("Create new peer leader");
        final Config config = new Config();
        config.setPeerName(peerName);
        LOGGER.info("Using configuration: {}", config);

        final PeerRunner peerRunner = new PeerRunner(config, bindPort);
        peerRunner.start();
        peerRunner.handleCommand(Command.ELECTION, null, null);
    }
}
