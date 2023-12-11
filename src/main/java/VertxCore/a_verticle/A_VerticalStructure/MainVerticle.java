package VertxCore.a_verticle.A_VerticalStructure;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
import io.vertx.core.Vertx;

public class MainVerticle extends AbstractVerticle {

  public static void main(String[] args) {
    final Vertx vertx = Vertx.vertx();
    vertx.deployVerticle(new MainVerticle());
  }

  @Override
  public void start(Promise<Void> startPromise) throws Exception {
    System.out.println("getClass().getName() = " + getClass().getName());

    vertx.deployVerticle(new VerticleA());
    vertx.deployVerticle(new VerticleB());
    super.start(startPromise);
  }
}
