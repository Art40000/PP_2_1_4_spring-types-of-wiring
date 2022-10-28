package koschei.models;

import koschei.config.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Ocean1 {

    private Island2 island;
    @Autowired
    public Ocean1(Wood3 wood) {
        island = AppConfig.getIsland(wood);
    }
    @Override
    public String toString() {
        return "на океане остров " + island.toString();
    }
}
