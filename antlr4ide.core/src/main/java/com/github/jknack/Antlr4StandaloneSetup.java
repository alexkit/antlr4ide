package com.github.jknack;

/**
 * Initialization support for running Xtext languages
 * without equinox extension registry
 */
public class Antlr4StandaloneSetup extends Antlr4StandaloneSetupGenerated {

  public static void doSetup() {
    new Antlr4StandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
