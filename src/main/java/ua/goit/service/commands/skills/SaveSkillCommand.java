package ua.goit.service.commands.skills;

import ua.goit.model.Skills;
import ua.goit.service.commands.Command;
import ua.goit.service.commands.CrudCommand;
import ua.goit.view.View;

import java.util.Map;

public class SaveSkillCommand extends CrudCommand {

    public SaveSkillCommand(View view, Map<String, Command> commands) {
        super(view, commands, Skills.class);
    }

    @Override
    public void process() {
        Skills skills = Skills.builder()
                .language(view.read())
                .level(view.read())
                .build();

        super.save(skills);
    }

    @Override
    public String commandName() {
        return "save_skill";
    }

    @Override
    public String description() {
        return "сохранение нового навыка";
    }
}
