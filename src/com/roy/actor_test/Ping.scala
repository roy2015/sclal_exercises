package com.roy.actor_test

/**
  * Created by BG244210 on 1/3/2017.
  */
import javafx.scene.paint.Stop

import scala.actors.Actor
import scala.actors.Actor._

class Ping(count: Int, pong: Actor) extends Actor {
  def act() {
    var pingsLeft = count - 1
    /*pong ! Ping
    while (true) {
      receive {
        case Pong =>
          if (pingsLeft % 1000 == 0)
            Console.println("Ping: pong")
          if (pingsLeft > 0) {
            pong ! Ping
            pingsLeft -= 1
          } else {
            Console.println("Ping: stop")
            pong ! Stop
            exit()
          }
      }
    }*/
  }
}