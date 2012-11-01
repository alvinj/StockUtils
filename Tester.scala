package foo

import java.io._
import scala.io.Source
import com.devdaily.stocks.StockUtils

object Tester extends App {

  val symbol = "aapl"
  val html = StockUtils.getHtmlFromUrl(symbol)
  val price = StockUtils.extractPriceFromHtml(html, symbol)
  println("current price = " + price)

}

