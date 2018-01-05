package pl.communityforcoders.test;

import java.io.File;
import net.dv8tion.jda.core.events.Event;
import org.apache.commons.lang3.Validate;
import pl.communityforcoders.nancy.Nancy;
import pl.communityforcoders.nancy.module.annotation.Inject;
import pl.communityforcoders.nancy.module.annotation.Listener;
import pl.communityforcoders.nancy.module.annotation.ModuleManifest;
import pl.communityforcoders.nancy.module.annotation.OnDisable;
import pl.communityforcoders.nancy.module.annotation.OnEnable;

@ModuleManifest(name = "TestModule", author = "kacperduras", version = "1.0.0.2")
public class TestModule {

  @Inject
  private Nancy nancy;

  @Inject
  private File directory;

  @Inject
  private ModuleManifest manifest;

  @OnEnable
  public void onEnable(Nancy nancy) {
    Validate.notNull(nancy);
    Validate.notNull(this.nancy);

    Validate.notNull(directory);
    Validate.notNull(manifest);
  }

  @OnDisable
  public void onDisable(Nancy nancy) {
    Validate.notNull(nancy);
  }

  @Listener
  public void onEvent(Event event) {

  }

}
