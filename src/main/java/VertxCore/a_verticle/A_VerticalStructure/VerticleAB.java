package VertxCore.a_verticle.A_VerticalStructure;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;

public class VerticleAB extends AbstractVerticle {
  @Override
  public void start(Promise<Void> startPromise) throws Exception {
    System.out.println("getClass().getName() = " + getClass().getName());
    super.start(startPromise);
  }

  @Override
  public void stop(Promise<Void> stopPromise) throws Exception {
    System.out.println("Stop " + getClass().getName());
    super.stop(stopPromise);
  }
}
