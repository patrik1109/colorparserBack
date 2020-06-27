package colorparser.service;

import org.springframework.data.mongodb.core.query.Update;

import java.lang.reflect.Field;

public class Tools {
    protected static Update fillupdate (Object claz){
        Update update = new Update();
        Field[] fields = claz.getClass().getDeclaredFields();

        try
        {
            for (Field field : fields) {
                field.setAccessible(true);
                String name = field.getName();
                Object value =  field.get(claz);
                if (value != null)
                {
                    update.set(name,value);
                }
            }
        }

        catch (Exception e){
            System.out.println(e.getStackTrace());
        }
        return update;
    }
}
