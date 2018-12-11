plugins {
    java
    eclipse
}

eclipse {
    project {
        linkedResource(mapOf(
            "name" to "src/main/resources/myfile.yml",
            "type" to "1",
            "locationUri" to "PROJECT_LOC/src/main/dist/myfile.yml.example"
        ))
    }
}
