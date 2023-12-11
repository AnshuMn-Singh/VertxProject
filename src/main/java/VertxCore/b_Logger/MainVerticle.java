package VertxCore.b_Logger;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
import io.vertx.core.Vertx;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainVerticle extends AbstractVerticle {

  private static final Logger logger = LoggerFactory.getLogger(MainVerticle.class);

  public static void main(String[] args) {
    final Vertx vertx = Vertx.vertx();
    vertx.deployVerticle(new MainVerticle());
  }

  @Override
  public void start(Promise<Void> startPromise) throws Exception {
    logger.debug("Start {}", getClass().getName());
    System.out.println("getClass().getName() = " + getClass().getName());

    vertx.deployVerticle(new VerticleA());
    vertx.deployVerticle(new VerticleB());
    super.start(startPromise);
  }

}
