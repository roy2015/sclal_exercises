package com.roy.actor_test

/**
  * Created by BG244210 on 1/3/2017.
  */
import scala.actors.Actor
import  Actor._
/**
  * Actor with Case Class
  *
  */
case class Emp(val name:String, val age:Int)

//Actor
class MyActor extends Actor{
  //重写act方法
  def act(){
    while(true){
      receive {
        case Emp(name,age) =>{
          println("recv: Emp name:" + name + ",age:" + age)
          //给消息发送者回复消息
          sender!"well done,Boy!"
        }
      }
    }
  }
}
