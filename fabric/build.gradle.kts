architectury {
    fabric()
}

dependencies {
    modImplementation("net.fabricmc:fabric-loader:0.16.8")
}

tasks.processResources {
    inputs.property("version", version)

    filesMatching("fabric.mod.json") {
        expand("version" to version)
    }
}
