

package scalatest
import org.scalatest._

/*

class TwoNumbersSpec extends FlatSpec{
  "add" should "add numbers" in {
    val nums = new TwoNumbers(1, 2)
    assert(nums.add === 3)
  }


}
 */
class FizzBuzzSpec extends FlatSpec {
  "fizzBuzz" should "divide by 3 exactly and return the word fizz" in {
    val test1 = new FizzBuzz()
    assert(test1.fizzBuzz === "fizz")
  }
}