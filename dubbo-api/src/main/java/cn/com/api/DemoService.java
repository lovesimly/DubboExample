package cn.com.api;

import java.util.List;

/**
 * Created by lujingzhong on 2018/3/19.
 */
public interface DemoService {
    List<String> getPermissions(Long id);
}