package com.roy.actor_test

/**
  * Created by BG244210 on 1/3/2017.
  */
object pingpong extends Application {
  val pong = new Pong
  val ping = new Ping(100000, pong)
  ping.start
  pong.start
}
