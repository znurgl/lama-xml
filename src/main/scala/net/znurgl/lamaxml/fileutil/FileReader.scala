package net.znurgl.lamaxml.fileutil

class FileReader(val fullPath: String) {
  
  def open() = {
    scala.io.Source.fromFile(fullPath).mkString
  }

}