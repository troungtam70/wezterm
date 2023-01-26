In Arch WSL2, run `export GPG_TTY=$(tty)` 

If the `mvn clean deploy` is successful, the jar file will be [here](https://s01.oss.sonatype.org/content/repositories/snapshots/io/github/troungtam70/wezterm/1.0.0-SNAPSHOT/)

`mvn versions:set -DnewVersion=1.0.1`

`mvn clean deploy -P release`: even though there was this warning `[WARNING] The requested profile "release" could not be activated because it does not exist`, it can be seen at https://repo1.maven.org/maven2/io/github/troungtam70/wezterm/1.0.1/