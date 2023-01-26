In Arch WSL2, run `export GPG_TTY=$(tty)` 

If the `mvn clean deploy` is successful, the jar file will be [here](https://s01.oss.sonatype.org/content/repositories/snapshots/io/github/troungtam70/wezterm/1.0.0-SNAPSHOT/)

`mvn versions:set -DnewVersion=1.0.1`