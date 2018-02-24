package generics

import java.util.NoSuchElementException

object P01LastElementOfList extends App{

//  P01 (*) Find the last element of a list.
//  Example:
//    scala> last(List(1, 1, 2, 3, 5, 8))
//  res0: Int = 8

  def lastElement[T](input:List[T]): T = {
    input match {
      case x :: Nil => x
      case head :: tail => lastElement(tail)
      case _ => throw new NoSuchElementException
    }
  }

  //println(lastElement(List()))
  println(lastElement(List(1,2,3,4)))
  println(lastElement(List(1)))
}
