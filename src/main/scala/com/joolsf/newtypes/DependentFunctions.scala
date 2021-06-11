package com.joolsf.newtypes

object DependentFunctions:
  trait Entry { type Key; val key: Key }

  def extractKey(e: Entry): e.Key = e.key

  val extractor: (e: Entry) => e.Key = extractKey

  val intEntry = new Entry {
    override type Key = String
    override val key = "key-1"
  }
  
  def test = extractor(intEntry)
