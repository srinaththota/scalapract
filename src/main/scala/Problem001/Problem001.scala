package Problem001

class Problem001 {
// minimum jumps required to reach
  def minimumJumps(arr:Array[Int]):Int={
    val n=arr.length-1
    minJumps(arr,0,n)
  }

  def minJumps(arr: Array[Int], value:Int, n: Int):Int={
    var l=value
    var h=n
    if(l==h){
      0
    }
    if(arr(l)==0){
      Integer.MAX_VALUE
    }
    var min=Integer.MAX_VALUE

    for(i<- l+1 to h if i <= l+arr(l)){

      val jumps=minJumps(arr,i,h)
      if(jumps != Integer.MAX_VALUE && jumps+1 < min){
        min=jumps+1
      }
    }
    min
  }
}
