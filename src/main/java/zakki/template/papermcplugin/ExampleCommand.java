package zakki.template.papermcplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ExampleCommand implements CommandExecutor {
    PaperMCPlugin plugin;

    public ExampleCommand(PaperMCPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        String cmdName = cmd.getName().toLowerCase();

        if (!cmdName.equals("example")) {
            return false;
        }

        sender.sendMessage("Successfully used example command!");

        return true;
    }
}
