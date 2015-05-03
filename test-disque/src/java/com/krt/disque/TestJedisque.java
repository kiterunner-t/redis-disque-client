package com.krt.disque;

import com.github.xetorthio.jedisque.Jedisque;
import java.net.URI;


public class TestJedisque {
  public static void main(String[] args) {
    try {
      Jedisque disque = new Jedisque(new URI("disque://192.168.1.106:7011"));
      //Jedisque disque2 = new Jedisque(new URI("disque://192.168.1.106:7022"));
      //Jedisque disque3 = new Jedisque(new URI("disque://192.168.1.106:7033"));

      System.out.println(disque.meet("192.168.1.106", 7022));
      System.out.println(disque.meet("192.168.1.106", 7033));

      System.out.println(disque.info());

      String jobId = disque.addJob("foo", "bar", 10000);
      disque.close();

    } catch (Exception e) {

    }
  }
}

