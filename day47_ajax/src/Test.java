import Dao.UserDao;
import Entity.User;
import Services.UserServices;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author As_los
 * @date 2019/8/30  15:18
 */

public class Test {
    UserDao userDao = new UserDao();
    UserServices userServices = new UserServices();

    @org.junit.Test
    public void test() {
        boolean i = userDao.selectInfo("dd");
        System.out.println(i);

    }

    @org.junit.Test
    public void tset1() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        User user = new User("张三", "155645", "0");

        String text = mapper.writeValueAsString(user);
        System.out.println(text);

        User newUser = mapper.readValue(text, User.class);
        System.out.println(newUser);

    }

    @org.junit.Test
    public void map() throws IOException {
        ObjectMapper mapper=new ObjectMapper();
        Map<String, Object> map = new HashMap<>();
        map.put("age", 25);
        map.put("name", "yitian");
        map.put("interests", new String[]{"pc games", "music"});

        String text=mapper.writeValueAsString(map);
        System.out.println(text);
        Map<String,Object> map1=mapper.readValue(text,new TypeReference<Map<String, Object>>() { });
        System.out.println(map1);
    }




}
