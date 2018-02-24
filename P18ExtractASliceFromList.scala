package generics

object P18ExtractASliceFromList {

//  P18 (**) Extract a slice from a list.
//    Given two indices, I and K, the slice is the list containing the elements from and including the Ith element up to but not including the Kth element of the original list. Start counting the elements with 0.
//  Example:
//
//    scala> slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
//  res0: List[Symbol] = List('d, 'e, 'f, 'g)

  def sliceAList[T](startIndex:Int,endIndex:Int,list:List[T]) ={
    list match{
      case Nil => List()
      case x :: xs =>

    }
  }
}
