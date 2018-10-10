lazy val root = project.in(file("."))
  .dependsOn(dep)

lazy val dep = project.in(file("dep"))
