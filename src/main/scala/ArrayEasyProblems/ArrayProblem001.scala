package ArrayEasyProblems

class ArrayProblem001 {

  //Largest three elements in an array
  def findLargestElements(arr:Array[Int]):List[Int]={
    var list=List()
    var first,second,third=0
  val n=arr.length
    for(i<-0 until n){
      if(arr(i)> first){
        first=arr(i)
        second=first
        third=second
      }else if(arr(i)>second){
        second=arr(i)
        third=second
      }
    }
     list :+ first
    list :+ second
    list :+ third
  }
}
