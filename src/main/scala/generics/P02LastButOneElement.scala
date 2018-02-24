package generics

import java.util.NoSuchElementException

object P02LastButOneElement extends App{

  /*P02 (*) Find the last but one element of a list.
  Example:
    scala> penultimate(List(1, 1, 2, 3, 5, 8))
  res0: Int = 5*/

  def lastButOneElement[T](list:List[T]) : T ={
    list match {
      case x :: y :: Nil => x
      case head :: tail => lastButOneElement(tail)
      case _ => throw new NoSuchElementException
    }
  }
  println(lastButOneElement(List(1,2,3,4)))
  println(lastButOneElement(List(1,2)))
  println(lastButOneElement(List(1)))
}
