package generics

object P05ReverseAList extends App{

//  P05 (*) Reverse a list.
//  Example:
//    scala> reverse(List(1, 1, 2, 3, 5, 8))
//  res0: List[Int] = List(8, 5, 3, 2, 1, 1)

  def reverse[T](list:List[T]) : List[T] ={
    list match {
      case Nil => List[T]()
      case x ::xs => reverse(xs) :+ x
    }
  }

  println(reverse(List(1, 1, 2, 3, 5, 8)))
}
