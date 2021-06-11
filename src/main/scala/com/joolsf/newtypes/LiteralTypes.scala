package com.joolsf.newtypes

object LiteralTypes:
  type AllowedNumbers = 1 | 1 | 2 | 3 | 5 | 8

  def test(x: AllowedNumbers): Int =
    x + 1


