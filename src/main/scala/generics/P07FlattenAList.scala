package generics

object P07FlattenAList extends App{

//  P07 (**) Flatten a nested list structure.
//  Example:
//    scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
//  res0: List[Any] = List(1, 1, 2, 3, 5, 8)

  def flatten[A](l: List[A]): List[A] = l match {
    case Nil => Nil
    case (h:List[A])::tail => flatten(h):::flatten(tail)
    case (h:A)::tail => h::flatten(tail)
  }
  println(flatten(List(List(1, 1), 2, List(3, List(5, 8)))))
}
