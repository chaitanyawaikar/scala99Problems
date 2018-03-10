package generics

object P15DuplicateElementsOfListNTimes extends App{

//  P15 (**) Duplicate the elements of a list a given number of times.
//  Example:
//    scala> duplicateN(3, List('a, 'b, 'c, 'c, 'd))
//  res0: List[Symbol] = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)

  def duplicateNTimes[T](n:Int,list:List[T]) : List[T] ={

    list match {
      case List() => List()
      case head :: tail => List.fill(n)(head) ::: duplicateNTimes(n,tail)
    }
  }

  println(duplicateNTimes(3,List(1,2,3,4,5,6)))
}
