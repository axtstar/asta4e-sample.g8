package $organization$

import com.axtstar.asta4e._

case class Code(
                 theme_code:String,
                 deactivated:String,
                 `type`:String,
                 theme_name:String,
                 fi_coverage:String,
                 maintenance_information:String,
                 `f-term_theme`:String,
                 start:Option[Int],
                 end:Option[Int],
                 under_reanalysis:String
)

object HelloAsta4e extends App {
  val readTemplate = "read_template.xls"
  val inputExcel = "code.xls"
  val ignoreSheetNames = List()

  //template
  val results = ExcelMapper.by[Code].getDataDown(readTemplate, inputExcel , ignoreSheetNames)

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
              print(s"\${column.theme_code},\${column.theme_name},")
              print(s"\${column.start.getOrElse("")}〜\${column.end.getOrElse("")}")
          }
          println()
      }
  }

  // each sheet size
  list.foreach{
    l =>
      //print sheetName and size
      println(s"SHEET NAME=\${l._1}: SIZE=\${l._2.size}")
  }
}
