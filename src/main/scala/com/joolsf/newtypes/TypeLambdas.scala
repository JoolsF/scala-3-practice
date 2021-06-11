package com.joolsf.newtypes

object TypeLambdas:
  type Tuple = [X] =>> (X, X)

  def test1[X](value: X): Tuple[X] = (value, value)
