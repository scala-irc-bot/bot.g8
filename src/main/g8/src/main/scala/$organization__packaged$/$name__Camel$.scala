package $organization$

import net.mtgto.irc.{Bot, Client}
import net.mtgto.irc.event._

class $name;format="Camel"$ extends Bot {
  override def onMessage(client: Client, message: Message) = {
    client.sendNotice(message.channel, message.text)
  }
}
