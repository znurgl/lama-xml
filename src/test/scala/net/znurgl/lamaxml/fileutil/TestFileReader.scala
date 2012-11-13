package net.znurgl.lamaxml.fileutil

import org.scalatest.FunSuite
import scala.collection.mutable.Stack

class TestFileReader extends FunSuite {
  
  test("read test files") {
 
    val fr = new FileReader("test-files/1.xml")
    println(fr.open)
    
  }

}