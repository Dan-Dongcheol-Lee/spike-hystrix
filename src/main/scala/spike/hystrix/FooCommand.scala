package spike.hystrix

import com.netflix.hystrix.{HystrixCommand, HystrixCommandGroupKey}

class FooCommand(name: String)
  extends HystrixCommand[String](HystrixCommandGroupKey.Factory.asKey("FooGroup")) {

  override def run() = s"Foo $name!"
}
