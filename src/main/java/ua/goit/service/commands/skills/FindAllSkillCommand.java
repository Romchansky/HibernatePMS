package ua.goit.service.commands.skills;

import ua.goit.model.Skills;
import ua.goit.service.commands.Command;
import ua.goit.service.commands.CrudCommand;
import ua.goit.view.View;

import java.util.Map;

public class FindAllSkillCommand extends CrudCommand {

    public FindAllSkillCommand(View view, Map<String, Command> commands) {
        super(view, commands, Skills.class);
    }

    @Override
    public void process() {
        super.findAll();
    }

    @Override
    public String commandName() {
        return "find_all_skills";
    }

    @Override
    public String description() {
        return "список всех навыков";
    }
}
