package su.hitori.template;
import su.hitori.api.module.Module;
import su.hitori.api.module.enable.EnableContext;

public class Main extends Module {
    @Override
    public void enable(EnableContext enableContext) {
        throw new RuntimeException("DON'T LOAD TEMPLATE ON RUNTIME PLEASE");
    }

    @Override
    public void disable() {

    }
}
