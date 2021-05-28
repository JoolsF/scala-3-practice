package com.joolsf.uniontypes

object UnionTypes1:
  def test(v: String | Int | List[Int]) =
    val res = v match
      case s: String => s.toInt
      case i: Int => i
      case l: List[Int] => l.reduce(_ + _)

    println(res)

