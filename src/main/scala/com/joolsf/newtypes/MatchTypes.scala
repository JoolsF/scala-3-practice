package com.joolsf.newtypes

object MatchTypes:

  // This example show us how we can relate potentially unrelated types
  // with static guarantees
  type ConstituentPartOf[T] = T match
    case BigInt => Int
    case String => Char
    case List[t] => t

  def lastComponentOf[T](thing: T): ConstituentPartOf[T] = thing match
    case b: BigInt => (b % 10).toInt
    case s: String =>
      if (s.isEmpty) throw new NoSuchElementException
      else s.charAt(s.length - 1)
    case l: List[_] =>
      if (l.isEmpty) throw new NoSuchElementException
      else l.last
