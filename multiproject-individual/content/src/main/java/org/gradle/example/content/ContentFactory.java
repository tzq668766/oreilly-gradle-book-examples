package org.gradle.example.content;

public class ContentFactory {
  private static ContentFactory instance;
  
  public static ContentFactory getInstance() {
    if(instance == null) {
      instance = new ContentFactory();
    }
    
    return instance;
  }
  
  public Content getContentProvider(String poet) {
    Content provider = null;
    
    if(poet != null) {
      if(poet.equals("shakespeare")) {
        provider = new ShakespeareContent();
      }
      else if(poet.equals("williams")) {
        provider = new WilliamCarlosWilliamsContent();
      }
    }

    return provider;
  }
}
