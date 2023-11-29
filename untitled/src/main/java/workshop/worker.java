package workshop;
import java.util.ArrayList;
import java.util.List;
public class Worker extends Tool{
    public void run() {
        Tool tool1 = new Tool ("turbosprezarka");
        tool1.useTool();
        Tool tool2 = new Tool("mlot rakietowy");
        tool2.useTool();
        Tool tool3 = new Tool("walec zakalec");
        tool3.useTool();
        Tool tool4 = new Tool("dzida laserowa");
        tool4.useTool();
        List<Tool> tools = new ArrayList<>();
        tools.add(tool1);
        tools.add(tool2);
        tools.add(tool3);
        tools.add(tool4);
        for (Tool tool : tools) {
            System.out.println("takie naredzie tego typu: " + tool.toolType);
        }
    }
}