package spike.hystrix

import com.netflix.hystrix.{HystrixCommand, HystrixCommandGroupKey}

class BarCommand(name: String)
  extends HystrixCommand[String](HystrixCommandGroupKey.Factory.asKey("BarGroup")) {

  override def run() = s"Bar $name!"
}
