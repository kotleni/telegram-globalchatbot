package bot.cmd

import bot.TelegramBot
import com.elbekD.bot.types.Message

class LogsCommand: Command() {
    override fun getName(): String {
        return "/logs"
    }

    override fun getDescription(): String {
        return "Отправляет логи на текущий день файлом."
    }

    override fun getPermission(): Permission {
        return Permission.GOD
    }

    override fun invokeCommand(msg: Message, line: String?, bot: TelegramBot) {
        bot.getBot().sendDocument(msg.from!!.id, Logger.getFile(), caption = "Logs file")
    }
}