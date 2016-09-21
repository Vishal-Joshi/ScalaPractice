package example

object Lists {

  def sum(list: List[Int]): Int = {
    var sum = 0
    list.foreach(sum+=_)
    sum
  }

  def max(list: List[Int]): Int = {
    var max = list.head
    list.foreach(e => if(e>max){
      max = e
    })
    max
  }

}
