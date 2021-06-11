package com.joolsf.contextualabstractions

import scala.concurrent.{ExecutionContext, Future}

object ContextFunctions:
  
  //Example 1 - no implicit ec param
  type Executable[T] = ExecutionContext ?=> Future[T]
  def fetch(i: Int): Executable[Int] = Future.successful(i + 1)
  def foo(i: Int): Executable[Int] = fetch(i).map(_ * 2)

  //Example 2 - no implicit log context param
  type Context = Map[String, String]
  type Loggable[T] = Context ?=> T

  def log(message: String): Loggable[Unit] = {
    println(s"log message: $message \n" +
    s"log context: ${summon[Context]}")
  }

  def testContext =
    given c: Context = Map("1" -> "one")
    log("foo")

