package LearnScala.oopsBasics


import java.util.{Calendar, Date}

object packageImport extends App {

  // package object
  println(iscomplete)
  println(COMPLETED)

  // Date import
  val date = new Date()
  val calenderDate = Calendar.getInstance().getTime
  println(calenderDate)

 }
