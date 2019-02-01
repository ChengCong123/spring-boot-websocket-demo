package com.sunlong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * @author sunlong
 * @since 2019/2/1
 */
@RestController
@RequestMapping
public class SettingsController {

    @PostMapping("/settings")
    public Map settings(HttpSession session, String name, String room) {
        session.setAttribute("name", name);
        session.setAttribute("room", room);
        Map<String, String> map = new HashMap<>();
        map.put("name", name);
        map.put("room", room);
        return map;
    }
}
