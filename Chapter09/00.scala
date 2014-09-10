import scala.io.Source
import java.io.PrintWriter
val source = Source.fromFile("01.tmp")

val lines = source.getLines.toList.reverse
//println(lines)
source.close

val out = new PrintWriter("01.tmp")
lines.foreach(out.println(_))
out.close()

"\\w+".r.findAllIn(Source.fromFile("01.tmp").getLines.mkString).toList.filter(_.length > 12).foreach(println)
