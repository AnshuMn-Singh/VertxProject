package VertxCore.c_eventLoop;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
import io.vertx.core.Vertx;
import io.vertx.core.VertxOptions;
import java.util.concurrent.TimeUnit;

public class EventLoop extends AbstractVerticle {

  public static void main(String[] args) {
    Vertx vertx = Vertx.vertx(
      new VertxOptions()
        .setMaxEventLoopExecuteTime(500)
        .setMaxEventLoopExecuteTimeUnit(TimeUnit.MICROSECONDS)
        .setBlockedThreadCheckInterval(1)
        .setBlockedThreadCheckIntervalUnit(TimeUnit.SECONDS)
    );

    vertx.deployVerticle(new EventLoop());
  }

  @Override
  public void start(Promise<Void> startPromise) throws Exception {
    System.out.println("getClass().getName() = " + getClass().getName());
    super.start(startPromise);
    Thread.sleep(5000);
  }
}
