package com.roy.actor_test

import javafx.scene.paint.Stop

import scala.actors.Actor
import com.roy.actor_test.Ping
import com.roy.actor_test.Pong

/**
  * Created by BG244210 on 1/3/2017.
  */
class Pong extends Actor {
  def act() {
    var pongCount = 0
    /*while (true) {
      receive {
        case Ping =>
          if (pongCount % 1000 == 0)
            Console.println("Pong: ping "+pongCount)
          sender ! Pong
          pongCount = pongCount + 1
        case Stop =>
          Console.println("Pong: stop")
          exit()
      }
    }*/
  }
}
