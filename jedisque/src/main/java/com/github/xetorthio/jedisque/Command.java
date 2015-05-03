package com.github.xetorthio.jedisque;

import redis.clients.jedis.ProtocolCommand;
import redis.clients.util.SafeEncoder;

public enum Command implements ProtocolCommand {
	CLUSTER,
	ADDJOB, GETJOB, ACKJOB, INFO, QLEN, QPEEK, DELJOB, DEQUEUE, ENQUEUE, FASTACK;


	private final byte[] raw;

	Command() {
		raw = SafeEncoder.encode(this.name());
	}

	@Override
	public byte[] getRaw() {
		return raw;
	}

}
