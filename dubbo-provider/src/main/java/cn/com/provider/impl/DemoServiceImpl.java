package cn.com.provider.impl;

import cn.com.api.DemoService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lujingzhong on 2018/3/19.
 */
public class DemoServiceImpl implements DemoService {
    public List<String> getPermissions(Long id) {
        List<String> demo = new ArrayList<String>();
        demo.add(String.format("Permission_%d", id - 1));
        demo.add(String.format("Permission_%d", id));
        demo.add(String.format("Permission_%d", id + 1));
        return demo;
    }
}
