In Arch WSL2, run `export GPG_TTY=$(tty)` 

If the `mvn clean deploy` is successful, the jar file will be [here](https://s01.oss.sonatype.org/content/repositories/snapshots/io/github/troungtam70/wezterm/1.0.0-SNAPSHOT/)

`mvn versions:set -DnewVersion=1.0.1`

`mvn clean deploy -P release`: even though there was this warning `[WARNING] The requested profile "release" could not be activated because it does not exist`, it can be seen at https://repo1.maven.org/maven2/io/github/troungtam70/wezterm/1.0.1/

Do I see [this](https://s01.oss.sonatype.org/content/repositories/snapshots/io/github/troungtam70/wezterm/) in citi?

```
for i in {2..8}; do
  j=$(( i-1 ))
  rm -f src/main/resources/librewolf.7z.00?
  mv /mnt/c/Users/Me/Downloads/librewolf-109.0-1/librewolf.7z.00${i} src/main/resources
  export A="2.0.$j"
  export B="2.0.$i-SNAPSHOT"
  mvn -Dtest=SingleTest#modifyPomXml test
  git add .
  git commit -m "..."
  mvn -DskipTests clean deploy
  mvn versions:set -DnewVersion=2.0.$i
  mvn -DskipTests clean deploy -P release
done
```