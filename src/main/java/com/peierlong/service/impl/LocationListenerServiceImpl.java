package com.peierlong.service.impl;

import com.peierlong.service.ListenerService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@Qualifier("location")
public class LocationListenerServiceImpl implements ListenerService {

    @Override
    public String processListenerContent(Map<String, String> map) {
        return null;
    }

}
