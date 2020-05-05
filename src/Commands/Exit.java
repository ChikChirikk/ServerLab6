package Commands;

import java.io.IOException;

/**
 * complete the program
 *
 * @author Polina
 */
public class Exit implements CommandWithoutArg {
    String name = "exit";
    /**
     * @param arg ignore this
     * @return
     */
    @Override
    public Object execute(Object arg) throws IOException {
        Save save = new Save();
        return  save.execute(null);
    }

    @Override
    public String getName() {
        return name;
    }
}
