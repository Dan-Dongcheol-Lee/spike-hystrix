package spike.hystrix

import com.netflix.hystrix.{HystrixCommandGroupKey, HystrixCommand}

class HelloWorldCommand(name: String)
  extends HystrixCommand[String](HystrixCommandGroupKey.Factory.asKey("HelloWorldGroup")) {

  override def run() = s"Hello $name!"
}
