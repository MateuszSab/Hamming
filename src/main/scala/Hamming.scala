object Hamming extends App {

  def hamDist(seq1: Seq[Any], seq2: Seq[Any]): Option[Int] = {
    if (seq1.length == seq2.length) {
      val seqZip = seq1.zip(seq2)
      Option(seqZip.foldLeft(0) { (result, pair) =>
        if (pair._1 != pair._2) result + 1
        else result
      })
    }
    else None
  }


  println(hamDist(Seq(1,1,1,1,1), Seq(1,1,1,1,2)))
  println(hamDist(Seq('a','b', 'c','d'), Seq('a', 'c', 'b', 'd')))

}
