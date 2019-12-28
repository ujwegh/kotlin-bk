package com.basrikahveci.p2p.peer;

public enum ConfigProperty {

    MIN_NUMBER_OF_ACTIVE_CONNECTIONS("minActiveConnections") {
        @Override
        public void setIntValue(int val, Config config) {
            config.setMinNumberOfActiveConnections(val);
        }
    },

    MAX_READ_IDLE_SECONDS("maxReadIdleSeconds") {
        @Override
        public void setIntValue(int val, Config config) {
            config.setMaxReadIdleSeconds(val);
        }
    },

    KEEP_ALIVE_PING_PERIOD_SECONDS("keepAlivePingPeriodSeconds") {
        @Override
        public void setIntValue(int val, Config config) {
            config.setKeepAlivePeriodSeconds(val);
        }
    },

    PING_TIMEOUT_SECONDS("pingTimeoutSeconds") {
        @Override
        public void setIntValue(int val, Config config) {
            config.setPingTimeoutSeconds(val);
        }
    },

    AUTO_DISCOVERY_PING_FREQUENCY("autoDiscoveryPingFrequency") {
        @Override
        public void setIntValue(int val, Config config) {
            config.setAutoDiscoveryPingFrequency(val);
        }
    },

    PING_TTL("pingTTL") {
        @Override
        public void setIntValue(int val, Config config) {
            config.setPingTTL(val);
        }
    },

    LEADER_ELECTION_TIMEOUT("leaderElectionTimeoutSeconds") {
        @Override
        public void setIntValue(int val, Config config) {
            config.setLeaderElectionTimeoutSeconds(val);
        }
    },

    LEADER_REJECTION_TIMEOUT("leaderRejectionTimeoutSeconds") {
        @Override
        public void setIntValue(int val, Config config) {
            config.setLeaderRejectionTimeoutSeconds(val);
        }
    };

    public static ConfigProperty byPropertyName(final String propertyName) {
        for (ConfigProperty prop : values()) {
            if (prop.propertyName.equals(propertyName)) {
                return prop;
            }
        }

        throw new IllegalArgumentException("Invalid config property: " + propertyName);
    }

    private final String propertyName;

    ConfigProperty(String propertyName) {
        this.propertyName = propertyName;
    }

    public abstract void setIntValue(final int val, final Config config);
}
