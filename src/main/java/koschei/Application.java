package koschei;

import koschei.config.AppConfig;
import koschei.models.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Death8 death = applicationContext.getBean(Death8.class);
        Needle7 needle = applicationContext.getBean(Needle7.class, death);
        Egg6 egg = applicationContext.getBean(Egg6.class, needle);
        Duck5 duck = applicationContext.getBean(Duck5.class, egg);
        Rabbit4 rabbit = applicationContext.getBean(Rabbit4.class, duck);
        Wood3 wood = applicationContext.getBean(Wood3.class, rabbit );
        Ocean1 ocean = applicationContext.getBean(Ocean1.class);

        KoscheiTheDeathless koscheiTheDeathless =
                applicationContext.getBean(KoscheiTheDeathless.class);
        koscheiTheDeathless.setOcean(ocean);

        System.out.println(koscheiTheDeathless.getRulesByDeth());
    }
}
