import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class HammingSpec extends AnyFlatSpec with should.Matchers {

  "hamDist" should "compute difference in elements between two sequences" in {
    import Hamming._
    hamDist(Seq(1,2,3), Seq(1,2,3)) shouldBe Some(0)
    hamDist(Seq(1,2,3), Seq(1,2,1)) shouldBe Some(1)
    hamDist(Seq('a', 'b', 'c'), Seq('c', 'b', 'a')) shouldBe Some(2)
    hamDist(Seq('a', 'b', 'c'), Seq('c', 'b')) shouldBe None
  }


}
