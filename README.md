# Minecraft Mod - Hello World

A quick run through of setting up vscode on windows to develop a new minecraft mod.

## Setup Environment
1) install\update `vscode` 1.39.1 was latest for me.
1) install these plugins: [vscode-java-pack](vscode:extension/vscjava.vscode-java-pack) (which includes `Debugger for Java`, `Java Dependency Viewer`, `Java Extension Pack`, `Java Test Runner`,  `Language Support for Java(TM) by Red Hat`), `Markdown Preview Gitgub Styling`, `Visual Studio Intellicode`, `Gradle Language Support`, `Better TOML`.  [See here for recommended plugins](https://code.visualstudio.com/docs/languages/java)
1) install this plugin `Minecraft JSON Schemas`
1) Install chocolatey
1) `choco install gradle -g` 5.6.2 was latest for me.  It takes a long time to install, just wait for it to say _Chocolatey installed 1/1 packages._
1) `choco install openjdk13 -g` 13.0.33 was latest for me.

## Setup New Minecraft Mod Project
Firstly, take a look at the [docs](https://mcforge.readthedocs.io/en/1.13.x/gettingstarted/)

### Downloading Minecraft Assets
1) [Download v1.13.2](https://files.minecraftforge.net/), (avoiding 1.14 because the documentation hasn't been updated yet) unzip the files and copy `build.gradle`, `gradle.properties` and `\src\` to the root directory of your repo. 
1) Open vscode to the root of your repo
1) Open a vscode terminal window and run `gradle build`

### Config Changes
1) In `build.gradle` find the line that starts `group = `, and replace it with a domain you own in reverse, followed by package identifier e.g. `dev.mikemcmillan.modid`

### Build it
Clean and build: `gradle clean build`

### Run it
Tip: You can run `gradle tasks` to output all tasks available.  Such as `runserver`:

1) `gradle runserver`  This runs a dedicated server. ... this failed for me at the :runserver step.  Will look into this later.
1) `gradle runclient` This launches minecraft in client mode.  Swish.

### Start Coding the Mod
Here's a great resource for 1.13.2 with plenty of examples: 
https://github.com/TheGreyGhost/MinecraftByExample/tree/master/src/main/java/minecraftbyexample

This has some examples for 1.13 and 1.14: https://suppergerrie2.com/category/forge-tutorial/, https://github.com/suppergerrie2/ForgeTutorial

A good resource for the json file structures: https://minecraft.gamepedia.com/Recipe

### Commit to git
1) Setup .gitignore to ignore build\run assets, and ensure we're not distributing mojang intellectual property!