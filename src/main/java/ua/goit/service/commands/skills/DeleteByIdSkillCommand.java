package ua.goit.service.commands.skills;

import ua.goit.model.Skills;
import ua.goit.service.commands.Command;
import ua.goit.service.commands.CrudCommand;
import ua.goit.view.View;

import java.util.Map;

public class DeleteByIdSkillCommand extends CrudCommand {

    public DeleteByIdSkillCommand(View view, Map<String, Command> commands) {
        super(view, commands, Skills.class);
    }

    @Override
    public void process() {
        super.deleteById();
    }

    @Override
    public String commandName() {
        return "delete_by_id_skill";
    }

    @Override
    public String description() {
        return "удалить навык по ID";
    }
}
