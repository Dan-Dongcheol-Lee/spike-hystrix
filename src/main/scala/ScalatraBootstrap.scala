import javax.servlet.ServletContext

import org.scalatra.LifeCycle
import spike.hystrix.HttpExample

class ScalatraBootstrap extends LifeCycle {
  override def init(context: ServletContext) {
    context.mount(new HttpExample, "/example/*")
  }
}

