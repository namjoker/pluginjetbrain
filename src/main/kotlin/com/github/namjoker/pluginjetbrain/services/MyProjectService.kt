package com.github.namjoker.pluginjetbrain.services

import com.intellij.openapi.project.Project
import com.github.namjoker.pluginjetbrain.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
