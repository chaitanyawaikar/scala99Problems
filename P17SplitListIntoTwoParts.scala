package generics

object P17SplitListIntoTwoParts extends App{

  /*Split a list into two parts.
  The length of the first part is given. Use a Tuple for your result.
  Example:

    scala> split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  res0: (List[Symbol], List[Symbol]) = (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))*/

  def split[T](n:Int,list:List[T]) : (List[T],List[T]) ={
    if(n>=list.size)
      (list,List())
    else
      (list.take(n),list.drop(n))
  }
  println(split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
}
