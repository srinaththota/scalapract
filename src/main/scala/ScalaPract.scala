import Problem001.Problem001
import ArrayEasyProblems.ArrayProblem001
object ScalaPract extends  App{

  //problem001 to find the minimum number of jumps
  val problem001Array=Array(1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9)
  val problem001=new Problem001

  val problem001Res=problem001.minimumJumps(problem001Array)
  println(problem001Res)

  //Largest 3 elements in an array
  val Arrayproblem = new ArrayProblem001

  val arrayProblemRes=Arrayproblem.findLargestElements(problem001Array)
  println(arrayProblemRes)
}
