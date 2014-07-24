package spike.hystrix;

import org.scalatra._
import org.scalatra.scalate.ScalateSupport

class HttpExample extends ScalatraServlet with FlashMapSupport with ScalateSupport {

  get("/hello-world/:name") {
    val hello = new HelloWorldCommand(params("name")).execute()
    <h1>{hello}</h1>
  }

  get("/foo/:name") {
    val foo = new FooCommand(params("name")).execute()
    <h1>{foo}</h1>
  }

  get("/bar/:name") {
    val bar = new BarCommand(params("name")).execute()
    <h1>{bar}</h1>
  }
}