package generics

import java.util.NoSuchElementException

object  ListExample1 extends App{

  // Find the last element of a list.
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

  // Find the last but one element of a list.

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
