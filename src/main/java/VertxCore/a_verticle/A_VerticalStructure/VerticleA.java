package VertxCore.a_verticle.A_VerticalStructure;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;

public class VerticleA extends AbstractVerticle {
  @Override
  public void start(Promise<Void> startPromise) throws Exception {
    System.out.println("getClass().getName() = " + getClass().getName());
    vertx.deployVerticle(new VerticleAA(), whenDeployed -> {
      System.out.println("Deplyed" + getClass().getName());
      vertx.undeploy(whenDeployed.result());
    });

    vertx.deployVerticle(new VerticleAB(), whenDeployed -> {
      System.out.println("Deplyed" + getClass().getName());
      vertx.undeploy(whenDeployed.result());
    });

    super.start(startPromise);
  }
}
