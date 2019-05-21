package $organization$

import com.axtstar.asta4e._
import com.axtstar.asta4e.core.ExcelHelper

case class Code(
                 theme_code:String,
                 deactivated:String,
                 `type`:Any,
                 theme_name:Any,
                 fi_coverage:Any,
                 maintenance_information:Any,
                 `f-term_theme`:Any,
                 start:Any,
                 end:Any,
                 under_reanalysis:Any
               )

object HelloAsta4e extends App {
  val readTemplate = "./src/resources/templates/read_template.xls"
  val inputExcel = "./src/resources/input/code.xls"
  val ignoreSheetNames = List()

  //template
  val results = ExcelMapper.getDataDown(readTemplate, inputExcel , ignoreSheetNames)

  val list = results.map {
    result =>
      //sheet name
      val sheetName = result._1
      //contents
      val contents = result._2

      // tuple of SheetName, Contents
      sheetName -> contents.map{
        row =>
          row.map {
            column =>
              print(s"${column._1} ${column._2} ")
          }
          println()
          //row To case class
          val target:Option[Code] = ExcelHelper.to[Code].from(row)
          target
      }
  }

  // each sheet size
  list.foreach{
    l =>
      //print sheetName and size
      println(s"${l._1}: ${l._2.size}")
  }
}
