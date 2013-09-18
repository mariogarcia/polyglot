package org.gradle.example

import org.gradle.api.tasks.TaskAction
import org.gradle.api.DefaultTask

class GreetingTask extends DefaultTask {

  String username
  
  @TaskAction
  def greeting() {
      println "Hello $username"
  }
  
}
