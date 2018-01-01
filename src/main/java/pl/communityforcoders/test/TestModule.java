package pl.communityforcoders.test;

import net.dv8tion.jda.core.events.Event;
import pl.communityforcoders.nancy.Nancy;
import pl.communityforcoders.nancy.module.annotation.Listener;
import pl.communityforcoders.nancy.module.annotation.Manifest;
import pl.communityforcoders.nancy.module.annotation.OnDisable;
import pl.communityforcoders.nancy.module.annotation.OnEnable;

@Manifest(name = "TestModule", author = "kacperduras", version = "1.0.0.0")
public class TestModule {

  @OnEnable
  public void onEnable(Nancy nancy) {

  }

  @OnDisable
  public void onDisable(Nancy nancy) {

  }

  @Listener
  public void onEvent(Event event) {

  }

}
