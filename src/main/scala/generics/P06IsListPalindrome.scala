package generics

object P06IsListPalindrome extends App{

//  P06 (*) Find out whether a list is a palindrome.
//    Example:
//    scala> isPalindrome(List(1, 2, 3, 2, 1))
//  res0: Boolean = true

  def isPalindrome[T](list:List[T]) : Boolean ={
    list.reverse == list
  }

  println(isPalindrome(List(1, 2, 3, 2, 1)))
}
