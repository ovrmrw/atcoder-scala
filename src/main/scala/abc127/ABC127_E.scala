package abc127.ABC127_E

/////////////////////////////////////////////////
// Cell Distance
// (submit the code below)
/////////////////////////////////////////////////

import java.util.Scanner

object Main {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val writer = new java.io.PrintWriter(System.out)
    writer.println(solve(sc))
    writer.flush()
  }

  def solve(sc: Scanner): String = {
    // Write your code here and return the answer as string
    "answer"
  }

  private def debug(x: Any): Unit = {
    if (System.getenv("LOCAL_DEBUG") != null) println(x)
  }
}
