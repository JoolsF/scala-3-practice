package com.joolsf.newtypes

object UnionTypes:
  //Example 1
  def test(v: String | Int | List[Int]) =
    val res = v match
      case s: String => s.toInt
      case i: Int => i
      case l: List[Int] => l.reduce(_ + _)

    println(res)
  
  //Example 2
  trait A:
    def children: List[A]

  trait B:
    def children: List[B]

  class C extends A, B:
    def children: List[A & B] = List.empty[A & B]

  val x: A & B = new C

  val y: List[A & B] = x.children

