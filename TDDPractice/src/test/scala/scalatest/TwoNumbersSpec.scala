package scalatest
import org.scalatest._


class TwoNumbersSpec extends FlatSpec{
  "add" should "add numbers" in {
    val nums = new TwoNumbers(1, 2)
    assert(nums.add === 3)
  }


}
