package generics

object P08EliminateConsecutiveDuplicates extends App{

//  If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.
//    Example:
//
//    scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
//  res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)

  def removeConsecutiveElements[T](list:List[T]) : List[T]={
    list.foldLeft(List[T]())((result,element) =>
      (result,element) match{
        case (List(),element)=> List(element)
        case (ls,element) => if(ls.last==element)
          ls
        else
          ls ::: List(element)
      }
    )
  }

  val b = removeConsecutiveElements(List("abc","abc","abc","abc","abc","abc","def","abc"))
}
