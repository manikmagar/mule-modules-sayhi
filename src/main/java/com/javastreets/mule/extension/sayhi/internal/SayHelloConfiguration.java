package com.javastreets.mule.extension.sayhi.internal;

import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.connectivity.ConnectionProviders;
import org.mule.runtime.extension.api.annotation.param.Parameter;

/**
 * This class represents an extension configuration, values set in this class are commonly used across multiple
 * operations since they represent something core from the extension.
 */
@Operations(SayHelloOperations.class)
@ConnectionProviders(SayHiConnectionProvider.class)
@Configuration(name="config-hello")
public class SayHelloConfiguration {

  @Parameter
  private String configId;

  public String getConfigId(){
    return configId;
  }
}
