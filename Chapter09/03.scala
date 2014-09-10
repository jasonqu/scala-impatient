io.Source.fromFile("01.txt").mkString.split("""[\s"\.,\)\()/]+""").filter(_.length > 12).distinct.foreach(println(_))

"\\w+".r.findAllIn(io.Source.fromFile("01.tmp").getLines.mkString).toList.filter(_.length > 12).foreach(println)
