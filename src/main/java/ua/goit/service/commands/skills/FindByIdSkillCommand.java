package ua.goit.service.commands.skills;

import ua.goit.model.Skills;
import ua.goit.service.commands.Command;
import ua.goit.service.commands.CrudCommand;
import ua.goit.view.View;

import java.util.Map;

public class FindByIdSkillCommand extends CrudCommand {

    public FindByIdSkillCommand(View view, Map<String, Command> commands) {
        super(view, commands, Skills.class);
    }

    @Override
    public void process() {
        super.findById();
    }

    @Override
    public String commandName() {
        return "find_by_id_skill";
    }

    @Override
    public String description() {
        return "получить навык по ID";
    }
}
