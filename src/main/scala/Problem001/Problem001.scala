package Problem001
// minimum jumps required to reach
class Problem001 {

  def minimumJumps(arr:Array[Int]):Int={
    val n=arr.length-1
    minJumps(arr,0,n)
  }

  def minJumps(arr: Array[Int], value:Int, n: Int):Int={
    var l=value
    var h=n

    val jumps=new Array[Int](n)

    for(i<-1 until n){
      jumps(i)=Integer.MAX_VALUE
        for(j<-0 until i){
          if(i<=j+arr(j) && jumps(j) != Integer.MAX_VALUE){
            jumps(i)=Math.min(jumps(i),jumps(j)+1)
          }
        }
    }
    jumps(n-1)
  }
}
