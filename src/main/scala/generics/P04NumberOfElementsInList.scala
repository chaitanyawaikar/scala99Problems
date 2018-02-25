package generics

object P04NumberOfElementsInList extends App{

  /*P04 (*) Find the number of elements of a list.
    Example:
    scala> length(List(1, 1, 2, 3, 5, 8))
  res0: Int = 6*/

  def length[T](list:List[T]):Int ={
    list match {
      case Nil => 0
      case x ::xs => 1+ length(xs)
    }
  }
  println(length(List(1, 1, 2, 3, 5, 8)))
  println(length(List()))
}
