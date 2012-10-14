bot.g8
========
[giter8](https://github.com/n8han/giter8/) template project for [scala-irc-bot](http://github.com/scala-irc-bot/scala-irc-bot/).
This template generates a project using:

- scala 2.9.2
- sbt
- [specs2](http://etorreborre.github.com/specs2/) 1.12.2
- [sbt-assembly](https://github.com/sbt/sbt-assembly) 0.8.4
- scala-irc-bot

# Usage
## Getting started
1. Install giter8.
2. Install sbt.
3. Create new project from scaffold:

```sh
g8 scala-irc-bot/bot
```

## Build a jar
```sh
sbt
> assembly
```
You copy `target/$PROJECT-assembly-$VERSION.jar` to `scala-irc-bot/bots` directory.

# FAQ
## I wanna use user config.
You implement a constructor of the bot class have one argument that extends `net.mtgto.irc.config.BotConfig` trait.

As an example, see [log-mongo](https://github.com/scala-irc-bot/log-mongo).
