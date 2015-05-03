package com.github.xetorthio.jedisque;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Test;

import redis.clients.jedis.exceptions.JedisConnectionException;

public class ConnectionTest {

	@Test
	public void iterateOverHosts() throws URISyntaxException {
		Jedisque q = new Jedisque(new URI("disque://192.168.47.120:55665"), new URI("disque://192.168.47.120:7711"));
		q.info();
		q.close();
	}

	@Test(expected = JedisConnectionException.class)
	public void throwExceptionWhenNodesAreUnavailbale() throws URISyntaxException {
		Jedisque q = new Jedisque(new URI("disque://192.168.47.120:55665"), new URI("disque://192.168.47.120:55666"));
		q.info();
		q.close();
	}
}
