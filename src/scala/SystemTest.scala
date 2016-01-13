package src.scala

/**
  * Created by root on 16-1-13.
  */
object SystemTest extends App {
  val str = System.getProperty("user.name")
  val passwd = Console.readLine("Password: ")
  if (passwd.equals("secret")) { println("Hello") } else { println("Failure") }
}
