package generics

object P16DropEveryNthElement extends App{

//  P16 (**) Drop every Nth element from a list.
//  Example:
//    scala> drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
//  res0: List[Symbol] = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)

  val inputList = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)

  //Recursive solutions
  def dropEveryNthELement[T](n:Int,list:List[T]) : List[T] ={
    list match {
      case Nil => List()
      case x if n< x.length =>
        x.take(n-1) ::: dropEveryNthELement(n,x.drop(n))
      case x => x
    }
  }
  println(dropEveryNthELement(3,inputList))

  //Direct approach
  val n = 3
  println(inputList.zipWithIndex.filter(_._2%n!=0).unzip._2)
}
