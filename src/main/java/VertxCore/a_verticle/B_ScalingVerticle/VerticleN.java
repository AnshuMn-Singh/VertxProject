package VertxCore.a_verticle.B_ScalingVerticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;

public class VerticleN extends AbstractVerticle {
  @Override
  public void start(Promise<Void> startPromise) throws Exception {
    System.out.println("getClass().getName() = " + getClass().getName()
      + "Thread " + Thread.currentThread().getName()
      + " Config " + config().toString());
    super.start(startPromise);
  }
}
