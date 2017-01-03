package com.roy.actor_test

import scala.actors.Actor

/**
  * Created by BG244210 on 1/3/2017.
  */
object ActorWithCaseClassTest  extends App{
  val myActor = new MyActor
  //启动
  myActor.start()
  //发送消息
  myActor!Emp("yy",25)

  //接收回传消息
  Actor.self.receive{
    case msg => println("reply:" + msg)
  }
}
