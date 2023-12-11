package VertxCore.a_verticle.B_ScalingVerticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;

public class VerticleB extends AbstractVerticle {
  @Override
  public void start(Promise<Void> startPromise) throws Exception {
    System.out.println("getClass().getName() = " + getClass().getName());
    super.start(startPromise);
  }
}
