package generics

object P08EliminateConsecutiveDuplicates extends App{

//  If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.
//    Example:
//
//    scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
//  res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)

  def compress[T](list:List[T]) : List[T] ={
    list.foldLeft(List[T]())(  (res,elem) =>
      (res,elem) match {
        case (List(),elem) => List(elem)
        case (ls, elem) if (ls.last == elem) => ls
        case (ls, elem) => ls:::List(elem)

      })
  }

  println(compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
}
