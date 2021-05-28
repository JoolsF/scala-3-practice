package com.joolsf.intersectiontypes

// Both A && B
//
object IntersectionTypes1:

  trait Camera:
    def takePhoto(): Unit = println("snap")

  trait Phone:
    def makeCall(): Unit = println("ring")

  class SmartPhone extends Camera with Phone

  // Commutatative i.e Camera & Phone same as Phone & Camera from type system perspective
  def test(sd: Camera & Phone): Unit =
    sd.takePhoto()
    sd.makeCall()

