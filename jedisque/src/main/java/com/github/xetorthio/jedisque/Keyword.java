package com.github.xetorthio.jedisque;

import redis.clients.util.SafeEncoder;


enum Keyword {
		FROM, REPLICATE, DELAY, RETRY, TTL, MAXLEN, ASYNC;
		final byte[] raw;

		Keyword() {
			raw = SafeEncoder.encode(this.name());
		}

}