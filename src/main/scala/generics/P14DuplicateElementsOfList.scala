package generics

object P14DuplicateElementsOfList extends App{

 // P14 (**) Duplicate the elements of a list

  def duplicateNTimes[T](n:Int,list:List[T]) : List[T] ={

    list match {
      case List() => List()
      case head :: tail => List.fill(n)(head) ::: duplicateNTimes(n,tail)
    }
  }

  println(duplicateNTimes(3,List(1,2,3,4,5,6)))


  //Direct approach
  val nTimes = 3
  val input = List(1,2,3,4,5,6)
  val res = input.flatMap(x=> List.fill(nTimes)(x))
  println(res)
}
