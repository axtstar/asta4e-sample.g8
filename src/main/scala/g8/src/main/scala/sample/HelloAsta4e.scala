package sample

import com.axtstar.asta4e._

object HelloAsta4e extends App {

  val result = ExcelMapper.getData(args(0), args(1) , List(args(2)))

  println(result.toString())

}
